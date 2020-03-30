/*
package com.soft1851.spring.web.controller;

import com.soft1851.spring.web.entity.Base;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("message","Hello  处理乱码");
        List<Base> list1 = new ArrayList<>();
        list1.add(new Base("专业的云端知识库","面向个人和团队，提供与众不同的知识管理，打造轻松流畅的工作协同。","https://gw.alipayobjects.com/mdn/prod_resou/afts/img/A*QT3DQZcBDqwAAAAAAAAAAABjARQnAQ"));
       model.addAttribute("list1", list1);

        List<Base> list2 = new ArrayList<>();
        list2.add(new Base("强大的知识创作与管理","编辑器自主研发，支持 Markdown、表格、脑图、代码块、LaTeX 公式、PlantUML 等专业编辑能力，同时做到本地视频、Office 文件、PDF 在线阅读，让你专注于创作。","https://gw.alipayobjects.com/mdn/prod_resou/afts/img/A*wW17Ta1oBZEAAAAAAAAAAABjARQnAQ"));
        model.addAttribute("list2", list2);

        Map maps= new HashMap();
        maps.put("黄启佳","并没有十全十美，也没有什么不劳而获，努力做自己！");
        model.addAttribute("maps", maps);
        return "templates/home";
    }
}
*/
