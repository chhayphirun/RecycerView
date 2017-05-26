package com.kshrd.listadapter.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.kshrd.listadapter.R;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {

    ListView customListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        customListView = (ListView) findViewById(R.id.customListView);

        final List<Article> articleList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            articleList.add(new Article((i+1), "Named -> " + (i+1)));
        }

        CustomListAdapter adapter = new CustomListAdapter(articleList);
        customListView.setAdapter(adapter);
        customListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomListViewActivity.this, articleList.get(position).getId() + "", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
