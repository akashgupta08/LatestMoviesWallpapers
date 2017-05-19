package in.guptaakash.latestmovieswallpapers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SingleViewFragment extends Fragment {

    private static final String ARG_IMAGE_RESOURCE = "image";

    public static SingleViewFragment buildWithResource(int res){
        Bundle args = new Bundle();
        args.putInt(ARG_IMAGE_RESOURCE, res);

        SingleViewFragment fragment = new SingleViewFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.single_view, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String resource = getArguments().getString(ARG_IMAGE_RESOURCE);
        ImageView imageView = (ImageView) getView().findViewById(R.id.imageview);
        Picasso.with(getContext()).load(resource).into(imageView);
       // imageView.setImageResource(resource);
    }
}
