package com.kshrd.listadapter.MyRecyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.kshrd.listadapter.R;
import com.kshrd.listadapter.listview.Article;
import com.kshrd.listadapter.recyclerview.MyRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

        RecyclerView recyclerView;
        recyclerView= (RecyclerView) findViewById(R.id.rvnumber1);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        MyAdapter adapter=new MyAdapter(DataSource.dataSource(),this);
        recyclerView.setAdapter(adapter);

    }
}
