package com.sjzc.enote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleTestController {

    @CrossOrigin
    @RequestMapping(value="/add_article_ui")
    public String AddArticleUI() { return "add_article_ui"; }

 @CrossOrigin
    @RequestMapping(value="/find_articles_by_author_ui")
    public String findArticlesByAuthorUI() { return "find_articles_by_author_ui"; }

    @CrossOrigin
    @RequestMapping(value="/delete_by_id_ui")
    public String deleteByIdUI() { return "delete_by_id_ui"; }


}
