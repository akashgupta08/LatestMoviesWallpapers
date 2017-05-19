package in.guptaakash.latestmovieswallpapers.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.net.URL;

import in.guptaakash.latestmovieswallpapers.R;

/**
 * Created by akash on 5/19/17.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }


            //imageView.setImageBitmap(bmp);
        Picasso.with(mContext).load(mThumbURL[position]).into(imageView);
            //imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }





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

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.daniel, R.drawable.daniel,
            R.drawable.daniel, R.drawable.daniel,
            R.drawable.daniel, R.drawable.daniel,
            R.drawable.daniel, R.drawable.daniel,
            R.drawable.daniel, R.drawable.daniel
    };
}