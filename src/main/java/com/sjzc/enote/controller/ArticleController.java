package com.sjzc.enote.controller;

import com.sjzc.enote.domain.Article;
import com.sjzc.enote.domain.User;
import com.sjzc.enote.repository.ArticleRepository;
import com.sjzc.enote.utils.ResHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

    @Autowired
    ArticleRepository  articleRepository;


    //添加文章

    @CrossOrigin
    @RequestMapping(value = "/api/addArticle")
    @ResponseBody
    Object addArticle(@RequestBody Map<String,Object> params) {
        try {
            String title=(String)params.get("title");
            String author=(String)params.get("author");
            String md=(String)params.get("md");
            String html=(String)params.get("html");
            String state="0";

            Article article = new Article(title,author,md,html,state);
            articleRepository.save(article);
            return  ResHelper.success("发布成功",null);
        }catch(Exception e){
            System.out.println(e);
            return ResHelper.fail("发布失败",e.getMessage());

        }



    }


//查询该用户的所有文章

    @CrossOrigin
    @RequestMapping(value = "/api/findArticlesByAuthor")
    @ResponseBody
    Object findArticlesByAuthor(@RequestBody Map<String,Object> params) {
        try {
            String author=(String)params.get("author");
            List<Article> lists = articleRepository.findArticlesByAuthor(author);
            return  ResHelper.success("文章列表查询成功",lists);
        }catch(Exception e){
            System.out.println(e);
            return ResHelper.fail("文章列表查询失败",e.getMessage());

        }



    }

    //根据文章id删除该文章

    @CrossOrigin
    @RequestMapping(value = "/api/deleteById")
    @ResponseBody
    Object deleteById(@RequestBody Map<String,Object> params) {
        try {
            Integer id=(Integer)params.get("id");
            articleRepository.deleteById(id.longValue());
            return  ResHelper.success("文章删除成功",null);
        }catch(Exception e){
            System.out.println(e);
            return ResHelper.fail("文章删除失败",e.getMessage());

        }



    }



}


