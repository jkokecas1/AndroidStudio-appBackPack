package com.shool.backpack.Fragments.Menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shool.backpack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuAnatomiaFragment extends Fragment {

    public MenuAnatomiaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_anatomia, container, false);
        return  view;
    }
}
