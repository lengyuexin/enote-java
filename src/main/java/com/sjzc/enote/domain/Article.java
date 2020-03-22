package com.sjzc.enote.domain;

import javax.persistence.*;

@Entity
@Table(name="article")
public class Article {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) ////主键生成策略

    private Long id;
    private String title;
    private String author;
    private String md;
    private String html;
    private String state;


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", md='" + md + '\'' +
                ", html='" + html + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    public Article(){}



    public Article(String title, String author, String md, String html, String state) {
        this.title = title;
        this.author = author;
        this.md = md;
        this.html = html;
        this.state = state;
    }
}
