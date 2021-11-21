package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

public class Dashboard extends AppCompatActivity implements
        FragmentExplore.OnFragmentInteractionListener,
        FragmentFavorite.OnFragmentInteractionListener,
        FragmentBooking.OnFragmentInteractionListener{

    private TabLayout tab;
    private ViewPager viewpager;
    ViewPagerAdapter viewPagerAdapter;
    private int[] tabIcons = { R.drawable.ic_search, R.drawable.ic_favorite, R.drawable.ic_booking};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewpager = findViewById(R.id.viewpager);
        tab = findViewById(R.id.tabLayout);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(viewPagerAdapter);

        tab.setupWithViewPager(viewpager);
        tab.getTabAt(0).setIcon(tabIcons[0]);
        tab.getTabAt(1).setIcon(tabIcons[1]);
        tab.getTabAt(2).setIcon(tabIcons[2]);

        tab.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#017691"), PorterDuff.Mode.SRC_IN);
        tab.getTabAt(1).getIcon().setColorFilter(Color.parseColor("#808080"), PorterDuff.Mode.SRC_IN);
        tab.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#808080"), PorterDuff.Mode.SRC_IN);

        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#017691"), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#808080"), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

//    private void addTabs2(ViewPager viewpager2) {
//        Dashboard. adapter = new Dashboard().ViewPagerAdapter(getChildFragmentManager());
//        adapter.addFrag(new Tutor(), "");
//        adapter.addFrag(new Games(), "");
//        adapter.addFrag(new Gigs(), "");
//        viewpager2.setAdapter(adapter);
//    }
}
