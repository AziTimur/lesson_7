package com.example.lesson7android1;

import android.widget.ImageView;

import com.example.lesson7android1.Fragment1.ModelHeros;
import com.example.lesson7android1.Fragment2.StringModel;

import java.util.ArrayList;

public interface OnViewClickListener {
    void onClick(ModelHeros mainModel);

    void onClick(StringModel stringModel);
}