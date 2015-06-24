package com.bearcub.absnavigationdrawer;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bearcub.absnavigationdrawerlibrary.AbstractNavigationDrawer;
import com.bearcub.absnavigationdrawerlibrary.NavigationDrawerItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 6/12/2015.
 */
public class NavigationDrawerFragment extends AbstractNavigationDrawer {
    @Override
    public int getNavigationItemViewId() {
        return R.layout.item_navigation_drawer;
    }

    @Override
    public int getRecyclerViewId() {
        return R.id.recycler_view_navigation;
    }

    @Override
    public int getMainLayoutId() {
        return R.layout.fragment_navigation;
    }

    @Override
    public RecyclerView.LayoutManager createLayoutManager() {
        return new LinearLayoutManager(getActivity());
    }

    @Override
    public int getTextViewId() {
        return R.id.text_navigation;
    }

    @Override
    public int getImgViewId() {
        return R.id.image_navigation;
    }

    @Override
    public List<NavigationDrawerItem> getItemData() {
        List<NavigationDrawerItem> list = new ArrayList<>();
        int[] images = {R.color.material_blue_grey_800, R.color.material_blue_grey_900, R.color.material_blue_grey_950};
        String[] labels = {"Definitions", "Training", "Walk-throughs"};

        for (int i = 0; i < images.length && i < labels.length; i++ ){
            NavigationDrawerItem item = new NavigationDrawerItem();
            item.imageId = images[i];
            item.label = labels[i];
            list.add(item);
        }
        return list;
    }
}
