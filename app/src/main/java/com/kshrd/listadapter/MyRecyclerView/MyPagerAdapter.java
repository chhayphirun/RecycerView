package com.kshrd.listadapter.MyRecyclerView;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIER on 6/6/2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragmentList;
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList=new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    public  void  addFragment(Fragment fragment){
        fragmentList.add(fragment);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "HOME";
        }else if(position==1){
            return "Favorite";

        }else {
            return null;
        }
    }
}
