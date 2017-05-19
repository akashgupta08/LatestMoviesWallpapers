package in.guptaakash.latestmovieswallpapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import in.guptaakash.latestmovieswallpapers.adapter.ImageAdapter;

public class MovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        setTitle(getIntent().getExtras().get("EXTRA_MESSAGE").toString());


        GridView gridview = (GridView) findViewById(R.id.moviePicsGrid);
        gridview.setAdapter(new ImageAdapter(this));


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent intent = new Intent(MovieActivity.this,SingleImageActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);

                Toast.makeText(MovieActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }


        });

    }

}

