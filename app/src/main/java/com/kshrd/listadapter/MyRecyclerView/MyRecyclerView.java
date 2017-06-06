package com.kshrd.listadapter.MyRecyclerView;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.kshrd.listadapter.R;

public class MyRecyclerView extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

       /* RecyclerView recyclerView;
        recyclerView= (RecyclerView) findViewById(R.id.rvnumber1);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        MyAdapter adapter=new MyAdapter(DataSource.dataSource(),this);
        recyclerView.setAdapter(adapter);*/
       viewPager= (ViewPager) findViewById(R.id.viewpagerlayoutmain);
        tabLayout= (TabLayout) findViewById(R.id.tablayoutmain);
        MyPagerAdapter adapter=new MyPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(HomeFragment.newInstance("HOME"));
        adapter.addFragment(FavoriteFragment.newInstance("Favorite"));
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
