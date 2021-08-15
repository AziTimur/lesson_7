package com.example.lesson7android1.Fragment3;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lesson7android1.Fragment1.ModelHeros;
import com.example.lesson7android1.databinding.FragmentThirdBinding;


public class ThirthFragment extends Fragment {

    private FragmentThirdBinding binding;
    private ModelHeros modelHeros;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.text2Thirth.setText(modelHeros.getName());
        binding.imageThirthFragment.setImageResource(modelHeros.getAvatar());
        binding.textThirth.setText(modelHeros.getStatus());

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (requireArguments() != null) {
            modelHeros = (ModelHeros) requireArguments().getSerializable("MYKEY");
        }

    }
}