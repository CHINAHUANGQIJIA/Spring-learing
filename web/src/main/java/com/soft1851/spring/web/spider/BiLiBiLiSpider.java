package com.soft1851.spring.web.spider;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.util.Rank;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description TODO
 * @Author xiao
 * @Date 2020/3/28 9:57
 * @Version 1.0
 **/
public class BiLiBiLiSpider {
    public static final int SUCCESS = 200;


    /**
     * HttpClient和JSoup爬取B站排行榜
     */
    public static List<Rank> getRanks() {
        List<Rank> ranks = new ArrayList<>();
        String userAgent = "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36";
        String url = "https://www.bilibili.com/ranking?spm_id_from=333.851.b_7072696d61727950616765546162.3";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            Thread.sleep(4000);
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent",userAgent);
            HttpClientContext context = HttpClientContext.create();
            CloseableHttpResponse response = httpClient.execute(httpGet, context);
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println(statusCode);
            if (statusCode == SUCCESS){
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    //res是页面
                    String res = EntityUtils.toString(entity);
                    Document document =  Jsoup.parse(res);
                    Elements scripts = document.getElementsByTag("script");
                    String wholeData = scripts.get(5).html();
                    String data = wholeData.substring(wholeData.indexOf("rankList") + 10, wholeData.indexOf("rankRouteParams") - 2);
                    JSONArray jsonArray = JSONArray.parseArray(data);
                    jsonArray.forEach(o->{
                        JSONObject json = JSONObject.parseObject(o.toString());
                        Rank rank = Rank.builder()
                                .title(json.getString("title"))
                                .author(json.getString("author"))
                                .pic(json.getString("pic"))
                                .duration(json.getString("duration"))
                                .build();
                    });
//                    Elements elements = document.getElementsByClass("rank-item");
//                    for (Element element:elements) {
//                        String num = element.child(0).text();
//                        Element contentEle = element.child(1);
//                        String title = contentEle.select(".title").text();
//                        Elements img = contentEle.select(".lazy-img img");
//                        String cover = img.attr("src");
//                        Rank rank = Rank.builder().id(Integer.parseInt(num)).title(title).cover(cover).build();
//                        ranks.add(rank);
//                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ranks;
    }


    public static void main(String[] args) throws IOException {
        for (Rank rank : getRanks()) {
            System.out.println(rank);
       }
        getRanks();

    }
}
