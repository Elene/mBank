package com.example.elenek.mbank.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.elenek.mbank.App;
import com.example.elenek.mbank.R;
import com.example.elenek.mbank.ui.main.fragments.assets.AssetsFragment;
import com.example.elenek.mbank.ui.main.fragments.cards.CardsFragment;
import com.example.elenek.mbank.ui.main.fragments.profile.ProfileFragment;
import com.example.elenek.mbank.ui.main.fragments.transactions.TransactionsFragment;

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {

    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0)
            return ProfileFragment.newInstance();
        if(i == 1)
            return AssetsFragment.newInstance();
        if(i == 2)
            return TransactionsFragment.newInstance();
        return CardsFragment.newInstance();
    }

    @Override
    public int getCount() {
        return App.getContext().getResources().getStringArray(R.array.tab_names).length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return App.getContext().getResources().getStringArray(R.array.tab_names)[position];
    }
}
