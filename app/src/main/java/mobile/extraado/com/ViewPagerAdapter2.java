package mobile.extraado.com;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter2 extends FragmentPagerAdapter {
    public ViewPagerAdapter2(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new Details();
        }
        else if (position == 1)
        {
            fragment = new Services();
        }
        else if (position == 2)
        {
            fragment = new Reviews();
        }
        else if (position == 3)
        {
            fragment = new Map();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Details";
        }
        else if (position == 1)
        {
            title = "Services";
        }
        else if (position == 2)
        {
            title = "Reviews";
        }
        else if (position == 3)
        {
            title = "Map";
        }
        return title;
    }
}
