package com.example.lesson7android1.Fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lesson7android1.FourthFragment;
import com.example.lesson7android1.Fragment1.ModelHeros;
import com.example.lesson7android1.OnViewClickListener;
import com.example.lesson7android1.R;
import com.example.lesson7android1.databinding.FragmentSecondBinding;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private SecondAdapter adapter;
    private ArrayList<StringModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new SecondAdapter();
        createList();
        binding.secondFragRV.setAdapter(adapter);
        adapter.setList(list);

        adapter.setListener(new OnViewClickListener() {
            @Override
            public void onClick(ModelHeros modelHeros) {

            }

            @Override
            public void onClick(StringModel stringModel) {
                FourthFragment fragment = new FourthFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.mainContainer, fragment).commit();
                Bundle bundle = new Bundle();
                bundle.putSerializable("secondKey", stringModel );
                fragment.setArguments(bundle);
            }
        });
    }

    private void createList() {
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLaner","Earth (209)"));
        list.add(new StringModel("PLaner","Earth (209)"));
        list.add(new StringModel("PLaner","Earth (209)"));

    }


}