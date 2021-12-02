package mobile.extraado.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    //Arrays
    public int[] slides_images = {
            R.drawable.setlocation,
            R.drawable.searchservice,
            R.drawable.bookservices
    };


    @Override
    public int getCount() {
        return slides_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);


//        RelativeLayout slideImage = view.findViewById(R.id.slide_relativeLayout);
        ImageView slideimage2 = view.findViewById(R.id.slide_image);
        slideimage2.setBackgroundResource(slides_images[position]);

        container.addView(view);


        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout)object);

    }
}
