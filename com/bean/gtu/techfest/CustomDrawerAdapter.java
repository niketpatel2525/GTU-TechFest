package com.bean.gtu.techfest;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class CustomDrawerAdapter extends ArrayAdapter<Slider_List_Bean> {
    Context context;
    List<Slider_List_Bean> drawerItemList;
    int layoutResID;

    private class DrawerItemHolder {
        TextView tvSliderItem;

        private DrawerItemHolder() {
        }
    }

    public CustomDrawerAdapter(Context context, int layoutResourceID, List<Slider_List_Bean> listItems) {
        super(context, layoutResourceID, listItems);
        this.context = context;
        this.drawerItemList = listItems;
        this.layoutResID = layoutResourceID;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        DrawerItemHolder drawerHolder;
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = ((Activity) this.context).getLayoutInflater();
            drawerHolder = new DrawerItemHolder();
            view = inflater.inflate(this.layoutResID, parent, false);
            drawerHolder.tvSliderItem = (TextView) view.findViewById(C0049R.id.slider_text);
            view.setTag(drawerHolder);
        } else {
            drawerHolder = (DrawerItemHolder) view.getTag();
        }
        drawerHolder.tvSliderItem.setText(((Slider_List_Bean) this.drawerItemList.get(position)).getItem());
        return view;
    }
}
