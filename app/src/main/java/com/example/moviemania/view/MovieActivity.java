package com.example.moviemania.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import com.example.moviemania.R;
import com.example.moviemania.databinding.ActivityMovieBinding;
import com.example.moviemania.model.Movie;

import java.util.Objects;

public class MovieActivity extends AppCompatActivity {

    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
//        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activityMovieBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie);

        Intent i = getIntent();
        
        if(i!=null){
            movie = getIntent().getParcelableExtra("movie");
            activityMovieBinding.setMovie(movie);
            Objects.requireNonNull(getSupportActionBar()).setTitle(movie.getTitle());
        }
    }
}