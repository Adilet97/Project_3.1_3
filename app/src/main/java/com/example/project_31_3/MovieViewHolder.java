package com.example.project_31_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMovie;


    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMovie = itemView.findViewById(R.id.textViewTitle);
    }
    public void onBind(String movieName){
        tvMovie.setText(movieName);

    }
}
