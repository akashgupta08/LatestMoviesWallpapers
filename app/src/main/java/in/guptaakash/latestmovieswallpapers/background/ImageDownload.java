package in.guptaakash.latestmovieswallpapers.background;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.net.URL;

/**
 * Created by akash on 5/19/17.
 */

public class ImageDownload  extends AsyncTask<String,Void,Bitmap> {

    protected Bitmap doInBackground(String... urls) {
        Bitmap bmp=null;
        try {
            URL url = new URL("https://images-na.ssl-images-amazon.com/images/M/MV5BMTg4NTExODc3Nl5BMl5BanBnXkFtZTgwODUyMDEzMDE@._V1_QL50_.jpg");
             bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            return bmp;
        }
     catch (Exception e){
       e.printStackTrace();
   }

   return bmp;
    }

    protected void onPostExecute(String feed) {
        // TODO: check this.exception
        // TODO: do something with the feed
    }
}
