package com.bean.gtu.techfest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Workshop extends Fragment implements OnClickListener {
    ImageView homeauto;
    ImageView makingMobile;
    ImageView oracle;
    ImageView tallBuilding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(C0049R.layout.workshop, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.homeauto = (ImageView) view.findViewById(C0049R.id.ivhomeautomation);
        this.makingMobile = (ImageView) view.findViewById(C0049R.id.ivmobilemaking);
        this.tallBuilding = (ImageView) view.findViewById(C0049R.id.ivDesigntall);
        this.oracle = (ImageView) view.findViewById(C0049R.id.ivoracle);
        this.homeauto.setOnClickListener(this);
        this.makingMobile.setOnClickListener(this);
        this.tallBuilding.setOnClickListener(this);
        this.oracle.setOnClickListener(this);
    }

    public void onClick(View v) {
        Bundle args = new Bundle();
        FragmentManager frgManager = getFragmentManager();
        Fragment fragment;
        switch (v.getId()) {
            case C0049R.id.ivhomeautomation:
                args.putInt(WorkshopDescriptionActivity.PARENT, 0);
                args.putInt(WorkshopDescriptionActivity.CHILD, 0);
                fragment = new WorkshopDescriptionActivity();
                fragment.setArguments(args);
                frgManager.beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
            case C0049R.id.ivmobilemaking:
                args.putInt(WorkshopDescriptionActivity.PARENT, 0);
                args.putInt(WorkshopDescriptionActivity.CHILD, 1);
                fragment = new WorkshopDescriptionActivity();
                fragment.setArguments(args);
                frgManager.beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
            case C0049R.id.ivDesigntall:
                args.putInt(WorkshopDescriptionActivity.PARENT, 0);
                args.putInt(WorkshopDescriptionActivity.CHILD, 2);
                fragment = new WorkshopDescriptionActivity();
                fragment.setArguments(args);
                frgManager.beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
            case C0049R.id.ivoracle:
                args.putInt(WorkshopDescriptionActivity.PARENT, 0);
                args.putInt(WorkshopDescriptionActivity.CHILD, 3);
                fragment = new WorkshopDescriptionActivity();
                fragment.setArguments(args);
                frgManager.beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
            default:
        }
    }
}
