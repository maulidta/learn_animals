package com.example.dashboard_ori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.dashboard_ori.InvertebrateFragment.InArthropodsFragment;
import com.example.dashboard_ori.InvertebrateFragment.InJellyfishFragment;
import com.example.dashboard_ori.InvertebrateFragment.InMollusksFragment;
import com.example.dashboard_ori.InvertebrateFragment.InOneFragment;
import com.example.dashboard_ori.InvertebrateFragment.InSpongesFragment;
import com.example.dashboard_ori.InvertebrateFragment.InStarfishFragment;
import com.example.dashboard_ori.InvertebrateFragment.InWormsFragment;
import com.example.dashboard_ori.VertebrateFragment.VAmphibiansFragment;
import com.example.dashboard_ori.VertebrateFragment.VBirdFragment;
import com.example.dashboard_ori.VertebrateFragment.VReptilesFragment;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class InvertebrateActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invertebrates);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        InvertebrateActivity.ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new InOneFragment(), "Invertebrates");
        adapter.addFrag(new InArthropodsFragment(), "Arthropods");
        adapter.addFrag(new InJellyfishFragment(), "Jellyfish");
        adapter.addFrag(new InMollusksFragment(), "Mollusks");
        adapter.addFrag(new InSpongesFragment(), "Sponges");
        adapter.addFrag(new InStarfishFragment(), "Starfish");
        adapter.addFrag(new InWormsFragment(), "Worms");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
