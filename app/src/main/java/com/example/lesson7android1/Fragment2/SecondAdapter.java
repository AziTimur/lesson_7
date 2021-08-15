package com.example.lesson7android1.Fragment2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson7android1.OnViewClickListener;
import com.example.lesson7android1.R;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder> {

    private ArrayList<StringModel> list = new ArrayList<>();

    OnViewClickListener listener;

    public void setListener(OnViewClickListener listener){
        this.listener = listener;

    }

    public void setList(ArrayList<StringModel> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_second, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView planetName, numberOfPlanet;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            planetName = itemView.findViewById(R.id.planet);
            numberOfPlanet = itemView.findViewById(R.id.numberOfPlanet);
            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    listener.onClick(list.get(getAdapterPosition()));
                }
            });
        }

        public void onBind(StringModel s) {
            planetName.setText(s.getNameOfPlanet());
            numberOfPlanet.setText(s.getNumberOfPlanet());

        }
    }
}