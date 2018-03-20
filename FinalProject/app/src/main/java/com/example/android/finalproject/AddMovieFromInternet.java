 package com.example.android.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddMovieFromInternet extends AppCompatActivity {
    private MovieReaderController moviesReaderController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie_from_internet);
        moviesReaderController = new MovieReaderController(this);

        // Show all countries from server:
        moviesReaderController.readAllMovies();
    }

}
