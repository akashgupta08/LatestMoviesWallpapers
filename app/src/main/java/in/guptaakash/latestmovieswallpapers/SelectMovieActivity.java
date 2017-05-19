package in.guptaakash.latestmovieswallpapers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import in.guptaakash.latestmovieswallpapers.adapter.ImageAdapter;

public class SelectMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_movie);

        GridView gridview = (GridView) findViewById(R.id.movieGrid);
        gridview.setAdapter(new ImageAdapter(this));


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(SelectMovieActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
