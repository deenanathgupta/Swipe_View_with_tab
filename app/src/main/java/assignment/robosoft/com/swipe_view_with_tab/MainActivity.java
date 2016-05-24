package assignment.robosoft.com.swipe_view_with_tab;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;

import assignment.robosoft.com.swipe_view_with_tab.adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_check_circle_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_check_circle_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_check_circle_black_24dp);

    }

    private void setupViewPager(ViewPager viewPager) {
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_One(), "ONE");
        adapter.addFragment(new Fragment_Two(), "TWO");
        adapter.addFragment(new Fragment_Three(), "THREE");
        /*adapter.addFragment(new Fragment_Four(), "FOUR");
        adapter.addFragment(new Fragment_Five(), "FIVE");
        adapter.addFragment(new Fragment_Six(), "SIX");
        adapter.addFragment(new Fragment_Seven(), "SEVEN");
        adapter.addFragment(new Fragment_Eight(), "EIGHT");
        adapter.addFragment(new Fragment_Nine(), "NINE");
        adapter.addFragment(new Fragment_Ten(), "TEN");*/
        viewPager.setAdapter(adapter);
    }
}
