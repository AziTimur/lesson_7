package com.example.lesson7android1.Fragment1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson7android1.OnViewClickListener;
import com.example.lesson7android1.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.VieHolder> {

    ArrayList<ModelHeros> list;

    OnViewClickListener listener;

    void setListener(OnViewClickListener listener){
        this.listener = listener;
    }

    public void setList(ArrayList<ModelHeros> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public VieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first_frag, parent, false);
        return new VieHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.VieHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class VieHolder extends RecyclerView.ViewHolder {

        private ImageView imageView, imageView2;
        private TextView sts, name, sts2, name2;

        public VieHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_it);

            sts = itemView.findViewById(R.id.stsTV);

            name = itemView.findViewById(R.id.nameTV);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    listener.onClick(list.get(getAdapterPosition()));
                }


            });
        }


    public void onBind(ModelHeros modelHeros) {
        imageView.setImageResource(modelHeros.getAvatar());
        sts.setText(modelHeros.getStatus());
        name.setText(modelHeros.getName());


    }
}
}
