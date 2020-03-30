package com.soft1851.spring.web.spider;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import java.io.IOException;
import java.util.List;

public class JdSpider {

    public static void getItems() throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.BEST_SUPPORTED);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.waitForBackgroundJavaScript(60 * 1000);
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());
        HtmlPage page = webClient.getPage("https://list.jd.com/list.html?cat=9987,653,655");
        List<HtmlDivision> divs = page.getByXPath("//div[@id='plist']//ul//li[@class='gl-item']//div[@class='gl-i-wrap j-sku-item']");
        System.out.println(divs);
        for (HtmlDivision div : divs) {
            DomNodeList<DomNode> childs = div.getChildNodes();
            String name = "";
            String price = "";
            String comments = "";
            String img = "";
            for (DomNode dn:childs) {
                NamedNodeMap map = dn.getAttributes();
                Node node = map.getNamedItem("class");
                if (node!=null){
                    String value = node.getNodeValue();
                    if (value.contains("p-name")) {
                        name = dn.asText();
                    } else if (value.contains("p-price")) {
                        price = dn.asText();
                    } else if (value.contains("p-commit")) {
                        comments = dn.asText();
                    }
                    else if (value.contains("p-img")) {
                        img = dn.asText();
                    }
                }
            }
            System.out.println(name+"//"+price+"//"+comments+"//"+img);
        }
    }

    public static void main(String[] args) throws IOException {
        getItems();
    }

}
