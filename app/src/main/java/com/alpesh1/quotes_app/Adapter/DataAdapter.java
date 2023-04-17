package com.alpesh1.quotes_app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alpesh1.quotes_app.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.Model;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataHolder>{

    String[] photoImage;
    int[] fitnessImage;

    Context context;

    public DataAdapter(String[] photoImage, int[] fitnessImage) {
        this.photoImage = photoImage;
        this.fitnessImage = fitnessImage;

    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quotes_design,parent,false);

        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder holder, int position) {

        holder.textquote.setText(photoImage[position]);
        Glide.with(context).load(fitnessImage[position]).into(holder.imagebackground);


    }

    @Override
    public int getItemCount() {

        return photoImage.length;
    }

    class DataHolder extends RecyclerView.ViewHolder {

        ImageView imagebackground;
        TextView textquote;
        public DataHolder(@NonNull View itemView) {
            super(itemView);

            imagebackground = itemView.findViewById(R.id.imagebackground);
            textquote = itemView.findViewById(R.id.textquote);

        }
    }
}
