package com.kshrd.listadapter.MyRecyclerView;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kshrd.listadapter.R;
import com.kshrd.listadapter.listview.Article;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by kshrd on 5/29/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Article1> dataSourceList;
    private Context context;

    public MyAdapter(List<Article1> dataSources, Context context) {
        this.dataSourceList= dataSources;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recyclerview_item1, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Article1 article1 = dataSourceList.get(position);
        holder.title.setText(article1.getTitle());
        Picasso.with(context)
                .load(article1.getImageUrl())
                .placeholder(R.drawable.ic_android)
                .error(R.drawable.ic_android)
                .into(holder.ivthumnail);
        holder.date.setText(article1.getPostDate()+" Views");
        holder.viewnumber.setText(String.valueOf(article1.getView()));
        Picasso.with(context)
                .load(article1.getImageUrl())
                .placeholder(R.drawable.ic_android)
                .error(R.drawable.ic_android)
                .into(holder.imageView6);

    }

    @Override
    public int getItemCount() {
        return dataSourceList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView ivthumnail;
        TextView date;
        TextView viewnumber;
        ImageView imageView6;


        public MyViewHolder(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.tvTitle);
            ivthumnail= (ImageView) itemView.findViewById(R.id.ivthumnail1);
            date= (TextView) itemView.findViewById(R.id.tvDate);
            viewnumber= (TextView) itemView.findViewById(R.id.tvviewnumber);
            imageView6= (ImageView) itemView.findViewById(R.id.imageView6);
        }
    }
}
