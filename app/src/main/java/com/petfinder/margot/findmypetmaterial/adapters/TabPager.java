package com.petfinder.margot.findmypetmaterial.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Margot on 10/11/2014.
 */
public class TabPager extends FragmentStatePagerAdapter{


        private List<Fragment> fragments;


        public TabPager(android.support.v4.app.FragmentManager fm, List<Fragment> fragments) {

            super(fm);
            // TODO Auto-generated constructor stub
            this.fragments = fragments;


        }

        @Override
        public CharSequence getPageTitle(int position) {

            if(position == 0){
                return "todos";
            }

            return "";
        }

        @Override
        public Fragment getItem(int position) {



            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }


    }

