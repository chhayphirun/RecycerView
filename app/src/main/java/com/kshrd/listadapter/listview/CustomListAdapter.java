package com.kshrd.listadapter.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kshrd.listadapter.R;

import java.util.List;

/**
 * Created by pirang on 5/26/17.
 */

public class CustomListAdapter extends BaseAdapter {

    private List<Article> articleList;

    public CustomListAdapter(List<Article> articleList) {
        this.articleList = articleList;
    }

    @Override
    public int getCount() {
        return articleList.size();
    }

    @Override
    public Object getItem(int position) {
        return articleList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {

        Article article = articleList.get(position);

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_listview_item, parent, false);
        TextView tvTitle = (TextView) v.findViewById(R.id.tvTitle);
        ImageView ivThumbnail = (ImageView) v.findViewById(R.id.ivThumbnail);
        tvTitle.setText(article.getTitle());
        ivThumbnail.setImageResource(R.drawable.ic_android);

        ivThumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(), "I am Thumbnail", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}
