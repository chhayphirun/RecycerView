package com.kshrd.listadapter.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kshrd.listadapter.R;
import com.kshrd.listadapter.listview.Article;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        final List<Article> articleList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            articleList.add(new Article((i+1), "Named -> " + (i+1)));
        }

        recyclerView = (RecyclerView) findViewById(R.id.rvNumber);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(this, articleList);
        recyclerView.setAdapter(adapter);

    }
}
