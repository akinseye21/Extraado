package mobile.extraado.com;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Dashboard extends AppCompatActivity implements
        FragmentExplore.OnFragmentInteractionListener,
        FragmentFavorite.OnFragmentInteractionListener,
        FragmentBooking.OnFragmentInteractionListener,
        SearchPage.OnFragmentInteractionListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    ImageView openMenu;


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

//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        tab.setLayoutParams(params);


        drawerLayout = findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.Open, R.string.Close);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView = findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.profile){
                    Toast.makeText(Dashboard.this, "Profile Selected", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.reviews){
                    Toast.makeText(Dashboard.this, "Reviews Selected", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.payments){
                    Toast.makeText(Dashboard.this, "Payments Selected", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.notifications){
                    Toast.makeText(Dashboard.this, "Notifications Selected", Toast.LENGTH_SHORT).show();
                }
               else  if(id == R.id.settings){
                    Toast.makeText(Dashboard.this, "Settings Selected", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.privacy){
                    Toast.makeText(Dashboard.this, "Privacy Selected", Toast.LENGTH_SHORT).show();
                }


                return true;
            }
        });

        openMenu = findViewById(R.id.open_nav);
        openMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

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
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
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
