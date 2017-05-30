package com.kshrd.listadapter.MyRecyclerView;

import java.util.ArrayList;

/**
 * Created by pirang on 5/29/17.
 */

public class DataSource {

    public static ArrayList<Article1> dataSource() {

        ArrayList<Article1> list = new ArrayList<>();
        list.add(new Article1(0, "Title 0", 100, "29-05-17", "http://assets-cdn.ekantipur.com/images/the-kathmandu-post-archive/2015/20150510football-star-ronaldo-donates-5m-to-nepal-600x0.jpg"));

        list.add(new Article1(1, "Title 1", 100, "29-05-17", "http://www3.pictures.zimbio.com/pc/Football+star+David+Beckham+seen+captaining+GuosLx_sfd_l.jpg"));

        list.add(new Article1(2, "Title 2", 100, "29-05-17", "http://talksport.com/sites/default/files/styles/just_scale/public/field/image/201607/rio-sturgeon.jpg"));

        list.add(new Article1(3, "Title 3", 100, "29-05-17", "http://news.7msport.com/news/upload_img/20150216/tt2_2015021610205927.jpg"));

        list.add(new Article1(4, "Title 4", 100, "29-05-17", "http://www.arabianbusiness.com/incoming/article462822.ece/ALTERNATES/g3l/146482039.jpg"));

        list.add(new Article1(5, "Title 5", 100, "29-05-17", "http://cdn.acidcow.com/content/img/new01/185/football_14.jpg"));

        list.add(new Article1(6, "Title 6" , 100, "29-05-17", "http://img.brothersoft.com/screenshots/softimage/f/free_football_stars_screensaver-49291-3.jpeg"));

        list.add(new Article1(7, "Title 7", 100, "29-05-17", "http://i.dailymail.co.uk/i/pix/2016/04/09/09/2FE03FB300000578-0-image-m-3_1460190015944.jpg"));

        list.add(new Article1(8, "Title 8", 100, "29-05-17", "http://www.topnews.in/files/Michael-Owen.jpg"));

        list.add(new Article1(9, "Title 9", 100, "29-05-17", "http://images.enca.com/encadrupal/styles/600_383/s3/000_DV2219521.jpg"));

        list.add(new Article1(10, "Title 10", 100, "29-05-17", "http://www.therealbest.com/img/items/big/816/Ronaldo_International-football-star_1387.jpg"));

        list.add(new Article1(11, "Title 11", 100, "29-05-17", "http://www.chinadaily.com.cn/sports/images/attachement/jpg/site1/20090831/0022190dec450c0572600f.jpg"));

        list.add(new Article1(12, "Title 12", 100, "29-05-17", "http://www.onlinesocialmedia.net/wp-content/uploads/Barcelona-football-star-Lionel-Messi-vs-robot-goalkeeper.jpg"));

        list.add(new Article1(13, "Title 13", 100, "29-05-17", "https://ae01.alicdn.com/kf/HTB1P4oyHFXXXXaYaXXXq6xXFXXXd/HOT-figure-1-6-toys-football-star-male-action-figure-C-Ronaldo-Messi-1-6-scales.jpg"));

        list.add(new Article1(14, "Title 14", 100, "29-05-17", "http://timesofindia.indiatimes.com/photo/56647744.cms"));

        return list;
    }
}

class Article1 {
    private int id;
    private String title;
    private int View;
    private String postDate;
    private String imageUrl;

    public Article1(int id, String title, int view, String postDate, String imageUrl) {
        this.id = id;
        this.title = title;
        View = view;
        this.postDate = postDate;
        this.imageUrl = imageUrl;
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

    public int getView() {
        return View;
    }

    public void setView(int view) {
        View = view;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
