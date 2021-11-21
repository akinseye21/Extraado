package mobile.extraado.com;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new FragmentExplore();
        }
        else if (position == 1)
        {
            fragment = new FragmentFavorite();
        }
        else if (position == 2)
        {
            fragment = new FragmentBooking();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Explore";
        }
        else if (position == 1)
        {
            title = "Favorite";
        }
        else if (position == 2)
        {
            title = "Booking";
        }
        return title;
    }
}
