package in.guptaakash.latestmovieswallpapers;

import android.os.Bundle;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;


public class SingleImageActivity extends FragmentActivity {
    public static final String EXTRA_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_image);

        // Selected image id
        int position = getIntent().getIntExtra(EXTRA_ID, 0);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new ImagesPagerAdapter(
                getSupportFragmentManager(), this));
        pager.setCurrentItem(position);
    }


}
