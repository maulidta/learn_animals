package com.example.dashboard_ori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.dashboard_ori.VertebrateFragment.VAmphibiansFragment;
import com.example.dashboard_ori.VertebrateFragment.VBirdFragment;
import com.example.dashboard_ori.VertebrateFragment.VOneFragment;
import com.example.dashboard_ori.VertebrateFragment.VReptilesFragment;
import com.example.dashboard_ori.VertebrateFragment.VFishFragment;
import com.example.dashboard_ori.VertebrateFragment.VMammalsFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class VertebrateActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertebrate);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new VOneFragment(), "Vertebrates");
        adapter.addFrag(new VMammalsFragment(), "Mammals");
        adapter.addFrag(new VFishFragment(), "Fish");
        adapter.addFrag(new VBirdFragment(), "Bird");
        adapter.addFrag(new VAmphibiansFragment(), "Amphibians");
        adapter.addFrag(new VReptilesFragment(), "Reptiles");
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
