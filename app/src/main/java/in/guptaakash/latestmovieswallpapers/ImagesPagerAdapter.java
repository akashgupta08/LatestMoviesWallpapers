package in.guptaakash.latestmovieswallpapers;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class ImagesPagerAdapter extends FragmentPagerAdapter{

    public Context ctx;

    public ImagesPagerAdapter(FragmentManager fm,Context ctx) {
        super(fm);
        this.ctx=ctx;
    }

    public Integer[] mThumbIds = {
            R.drawable.daniel, R.drawable.daniel,
            R.drawable.daniel, R.drawable.daniel
    };

    private String[] mThumbURL={
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-3.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-6.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-10.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-3.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-6.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-10.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-3.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-6.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-10.jpg",
            "http://wallpaper-gallery.net/images/best-movie-wallpaper/best-movie-wallpaper-10.jpg"

    };

    @Override
    public Fragment getItem(int i) {
        Bundle args = new Bundle();
      //  args.putInt("image", mThumbIds[i]);
        args.putString("image", mThumbURL[i]);
        SingleViewFragment fragment = new SingleViewFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public int getCount() {
        return mThumbURL.length;
    }
}