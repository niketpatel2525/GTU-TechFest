package com.bean.gtu.techfest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Quizzes extends Fragment implements OnClickListener {
    ImageView armaggedon;
    ImageView bazinga;
    ImageView bitcoin;
    ImageView opengeneral;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(C0049R.layout.quizzes, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.bitcoin = (ImageView) view.findViewById(C0049R.id.ivbitcoin);
        this.armaggedon = (ImageView) view.findViewById(C0049R.id.ivarmagadon);
        this.bazinga = (ImageView) view.findViewById(C0049R.id.ivbazinga);
        this.opengeneral = (ImageView) view.findViewById(C0049R.id.ivopengeneral);
        this.bitcoin.setOnClickListener(this);
        this.armaggedon.setOnClickListener(this);
        this.bazinga.setOnClickListener(this);
        this.opengeneral.setOnClickListener(this);
    }

    public void onClick(View v) {
        Bundle args = new Bundle();
        FragmentManager frgManager = getFragmentManager();
        Fragment fragment;
        switch (v.getId()) {
            case C0049R.id.ivbitcoin:
                args.putInt(WorkshopDescriptionActivity.PARENT, 0);
                args.putInt(WorkshopDescriptionActivity.CHILD, 0);
                fragment = new QuizzesDescriptionActivity();
                fragment.setArguments(args);
                frgManager.beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
            case C0049R.id.ivarmagadon:
                args.putInt(WorkshopDescriptionActivity.PARENT, 0);
                args.putInt(WorkshopDescriptionActivity.CHILD, 1);
                fragment = new QuizzesDescriptionActivity();
                fragment.setArguments(args);
                frgManager.beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
            case C0049R.id.ivbazinga:
                args.putInt(WorkshopDescriptionActivity.PARENT, 0);
                args.putInt(WorkshopDescriptionActivity.CHILD, 2);
                fragment = new QuizzesDescriptionActivity();
                fragment.setArguments(args);
                frgManager.beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
            case C0049R.id.ivopengeneral:
                args.putInt(WorkshopDescriptionActivity.PARENT, 0);
                args.putInt(WorkshopDescriptionActivity.CHILD, 3);
                fragment = new QuizzesDescriptionActivity();
                fragment.setArguments(args);
                frgManager.beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
            default:
        }
    }
}
