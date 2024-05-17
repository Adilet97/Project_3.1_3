package com.example.project_31_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> movieList = new ArrayList<>();
    private RecyclerView rvMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMovie=findViewById(R.id.rv_movie);
        movieList.add("Forrest Gump");
        movieList.add("King Arthur");
        movieList.add("Terminator");
        movieList.add("Great Gatsby");
        movieList.add("Dune");
        movieList.add("King Kong");
        movieList.add("Titanic");
        movieList.add("The Shawshank Redemption");
        movieList.add("Seven");
        movieList.add("Now You See Me");
        movieList.add("High Crimes");
        movieList.add("Rush Hours");
        movieList.add("Drunken Master");
        movieList.add("The Foreigner");

        MovieAdapter adapter = new MovieAdapter(movieList);
        rvMovie.setAdapter(adapter);
    }
}