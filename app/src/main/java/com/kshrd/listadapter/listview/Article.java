package com.kshrd.listadapter.listview;

/**
 * Created by pirang on 5/26/17.
 */

public class Article {

    private int id;
    private String title;

    public Article(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
