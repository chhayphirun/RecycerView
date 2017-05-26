package com.kshrd.listadapter.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kshrd.listadapter.R;
import com.kshrd.listadapter.listview.Article;

import java.util.List;

/**
 * Created by pirang on 5/26/17.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private List<Article> articleList;
    private Context context;

    public MyRecyclerViewAdapter(Context context, List<Article> articleList) {
        this.articleList = articleList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recyclerview_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Article article = articleList.get(position);
        holder.tvTitle.setText(article.getTitle());
        holder.ivThumbnail.setImageResource(R.drawable.ic_android);
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        ImageView ivThumbnail;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivThumbnail = (ImageView) itemView.findViewById(R.id.ivThumbnail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    //notifyDataSetChanged();

                    // Remove
//                    articleList.remove(pos);
//                    notifyItemRemoved(pos);

                    // Add
                    articleList.add(new Article(0, "Zero"));
                    notifyItemInserted(articleList.size() - 1);

                }
            });

            ivThumbnail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "I am Image", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
