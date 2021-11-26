package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Slides extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter sliderAdapter;
    Timer timer;
    private TextView[] mDots;
    TextView info;
     String [] words = {"Set your location",
                                        "Search for services near you",
                                        "Book for services"};

    Integer[] imageId = {
            R.drawable.setlocation,
            R.drawable.searchservice,
            R.drawable.bookservices};

    TextView skip,next;
    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slides);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mSlideViewPager = findViewById(R.id.viewpager);
        mDotLayout = findViewById(R.id.dotsLayout);

        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);

        info = findViewById(R.id.info);
        skip = findViewById(R.id.skip);
        next = findViewById(R.id.next);
        getStarted = findViewById(R.id.getStarted);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getStarted.setVisibility(View.VISIBLE);
                next.setVisibility(View.GONE);
                skip.setVisibility(View.GONE);
                mDotLayout.setVisibility(View.GONE);
                info.setVisibility(View.GONE);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getStarted.setVisibility(View.VISIBLE);
                next.setVisibility(View.GONE);
                skip.setVisibility(View.GONE);
                mDotLayout.setVisibility(View.GONE);
                info.setVisibility(View.GONE);
            }
        });

        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Slides.this, SignIn.class);
                startActivity(i);
            }
        });

        //adding timer for the images
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                mSlideViewPager.post(new Runnable() {
                    @Override
                    public void run() {
                        mSlideViewPager.setCurrentItem((mSlideViewPager.getCurrentItem()+1)%imageId.length);

                    }
                });
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 8000, 8000);

        addDotIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);

    }

    public void addDotIndicator(int position){

        mDots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i = 0; i<mDots.length; i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml(""));
            mDots[i].setTextSize(10);
//            mDots[i].setTextColor(getResources().getColor(R.color.colorYellow));
            mDots[i].setBackgroundResource(R.drawable.circle_dot);
            info.setText(words[i]);

            mDotLayout.addView(mDots[i]);
        }

        if(mDots.length > 0){

//            mDots[position].setTextColor(getResources().getColor(R.color.colorScroll));
            mDots[position].setBackgroundResource(R.drawable.circle_dot2);
            info.setText(words[position]);

        }

    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            addDotIndicator(position);

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
