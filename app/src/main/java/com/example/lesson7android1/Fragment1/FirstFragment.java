package com.example.lesson7android1.Fragment1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson7android1.Fragment2.StringModel;
import com.example.lesson7android1.Fragment3.ThirthFragment;
import com.example.lesson7android1.OnViewClickListener;
import com.example.lesson7android1.R;
import com.example.lesson7android1.databinding.FragmentFirsrtBinding;

import java.util.ArrayList;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toolbar;



import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private RecyclerAdapter adapter;
    private ArrayList<ModelHeros> list = new ArrayList<>();
    private FragmentFirsrtBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new RecyclerAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        createList();
        binding = FragmentFirsrtBinding.inflate(inflater, container, false);
        initList();
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

            adapter.setListener(new OnViewClickListener() {

            @Override
            public void onClick(ModelHeros modelHeros) {
                ThirthFragment thirthFragment = new ThirthFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.mainContainer, thirthFragment).commit();
                Bundle bundle = new Bundle();
                bundle.putSerializable("MYKEY",modelHeros);
                thirthFragment.setArguments(bundle);

            }

            @Override
            public void onClick(StringModel stringModel) {

            }
        });


    }

    private void initList() {
        adapter.setList(list);
        binding.firstFragFV.setAdapter(adapter);
    }

    private void createList() {
        list.add(new ModelHeros(R.drawable.img1, "Alive", "Morty"));
        list.add(new ModelHeros(R.drawable.img2, "dead", "Rick"));
        list.add(new ModelHeros(R.drawable.img3, "dead", "Einstein"));
        list.add(new ModelHeros(R.drawable.img4, "Alive", "Jerry"));
        list.add(new ModelHeros(R.drawable.img1, "Alive", "Morty"));
        list.add(new ModelHeros(R.drawable.img2, "dead", "Rick"));
        list.add(new ModelHeros(R.drawable.img3, "dead", "Einstein"));
        list.add(new ModelHeros(R.drawable.img4, "Alive", "Jerry"));


    }
}