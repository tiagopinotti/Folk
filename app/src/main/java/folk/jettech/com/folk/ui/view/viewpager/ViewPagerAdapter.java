package folk.jettech.com.folk.ui.view.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import folk.jettech.com.folk.MainScreenActivity;
import folk.jettech.com.folk.ui.view.viewpager.ui.view.viewpager.adapter.ui.view.viewpager.fragment.SlidePageFragment;

/**
 * Created by Eduardo on 18/02/2018.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new SlidePageFragment();
    }

    @Override
    public int getCount() {
        return MainScreenActivity.NUM_PAGES;
    }
}
