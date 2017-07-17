package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvMovie;
    ArrayList<MovieList> alMovieList;
CustomAdapter caMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie = (ListView) findViewById(R.id.listViewMovie);
        alMovieList = new ArrayList<MovieList>();
        caMovies = new CustomAdapter(this, R.layout.movielist_row, alMovieList);
        lvMovie.setAdapter(caMovies);
        MovieList item1 = new MovieList("War for the Planet of the Apes", "A 2017 sequel of the Planet of the Apes science fiction franchise by French author Pierre Boulle's");
        alMovieList.add(item1);
        MovieList item2 = new MovieList("King Kong", "Movie about a giant ape, created by American filmmaker  Merian C. Cooper that first appear in 1930s");
        alMovieList.add(item2);

    }
}
