package com.kshrd.listadapter.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.kshrd.listadapter.R;
import com.kshrd.listadapter.listview.Article;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = (GridView) findViewById(R.id.gridView);

        final List<Article> articleList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            articleList.add(new Article((i + 1), (i + 1) + " <= Name)"));
        }

        CustomGridViewAdapter adapter = new CustomGridViewAdapter(articleList);
        gridView.setAdapter(adapter);
    }
}
