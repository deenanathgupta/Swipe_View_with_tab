package assignment.robosoft.com.swipe_view_with_tab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deena on 27/1/16.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    int num_of_Tabs;
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        Log.i("Test", "PagerAdapter()");
    }


    @Override
    public Fragment getItem(int position) {
        Log.i("Test","getItem()");
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        Log.i("Test","getCount()");
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        Log.i("Test","addFragment()");
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Log.i("Test","getPageTitle()");
        return mFragmentTitleList.get(position);
    }
}
