package com.example.lesson7android1.Fragment1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class PacerAdapter extends FragmentStateAdapter {
    private ArrayList<Fragment> list;



    public PacerAdapter(@NonNull  Fragment fragment) {
        super(fragment);
    }
    public void setList(ArrayList<Fragment> list){
        this.list = new ArrayList<>();
        this.list.addAll(list);
    }

    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}