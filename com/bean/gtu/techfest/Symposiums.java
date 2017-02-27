package com.bean.gtu.techfest;

import android.animation.ObjectAnimator;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Symposiums extends Fragment implements OnGroupExpandListener, OnChildClickListener {
    public static final String IMAGE_RESOURCE_ID = "iconResourceID";
    public static final String ITEM_NAME = "itemName";
    ObjectAnimator anim;
    AnimationSet animation;
    Context context;
    ExpandableListView expListView;
    int fadeInDuration;
    int fadeOutDuration;
    ExpandableListAdapter listAdapter;
    HashMap<String, List<String>> listDataChild;
    List<String> listDataHeader;
    ImageView myGallery;
    int previousGroup;
    Runnable f8r;
    int timeBetween;
    Vibrator vibe;

    public Symposiums(Context c) {
        this.previousGroup = -1;
        this.fadeInDuration = 500;
        this.timeBetween = 3000;
        this.fadeOutDuration = 1000;
        this.context = c;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(C0049R.layout.symposiums, container, false);
        this.vibe = (Vibrator) this.context.getSystemService("vibrator");
        return rootView;
    }

    public void onViewCreated(View rootView, Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);
        this.expListView = (ExpandableListView) rootView.findViewById(C0049R.id.lvExp3);
        this.myGallery = (ImageView) rootView.findViewById(C0049R.id.gallery3);
        prepareListData();
        this.listAdapter = new ExpandableListAdapter(getActivity().getBaseContext(), this.listDataHeader, this.listDataChild);
        this.expListView.setAdapter(this.listAdapter);
        this.expListView.setOnChildClickListener(this);
        this.expListView.setOnGroupExpandListener(this);
    }

    private void prepareListData() {
        this.listDataHeader = new ArrayList();
        this.listDataChild = new HashMap();
        this.listDataHeader.add("Computer/IT");
        this.listDataHeader.add("Mechanical");
        this.listDataHeader.add("Civil");
        this.listDataHeader.add("Electrical/EC/IC");
        this.listDataHeader.add("Envi/Chem/Rubber/Plastic");
        this.listDataHeader.add("General");
        List<String> comp = new ArrayList();
        comp.add("Actionable analytics");
        comp.add("SKILL SCENARIO IN \nIT INDUSTRY");
        List<String> mech = new ArrayList();
        mech.add("Graviational Waves -\n An Approach to Know Universe");
        mech.add("Nano-technology:\nConcepts and Application");
        mech.add("Smart Material Application \nin Space Present & Future");
        List<String> civil = new ArrayList();
        civil.add("Green Building");
        civil.add("Building Information Modeling");
        List<String> ec = new ArrayList();
        ec.add("Indian power scenario and opportunities 1");
        ec.add("Indian power scenario and opportunities 2");
        List<String> envi = new ArrayList();
        envi.add("LEAGLE ASPECTS OF ENVIRONMENT POLLUTION CONTROL LAWS");
        envi.add("USE OF SPECIALTY RUBBER IN INDUSTRY");
        envi.add("COLOUR MATER BATCHES SPECIALITY ADITIVES AND POLYMER");
        envi.add("SOLID WASTE MANAGEMENT");
        List<String> gen = new ArrayList();
        gen.add("MASTERING EMOTIONAL INTELLIGENCE FOR SUCCESS");
        gen.add("INNOVATION VERSUS INVENTION & INTERNET OF THINGS");
        this.listDataChild.put((String) this.listDataHeader.get(0), comp);
        this.listDataChild.put((String) this.listDataHeader.get(1), mech);
        this.listDataChild.put((String) this.listDataHeader.get(2), civil);
        this.listDataChild.put((String) this.listDataHeader.get(3), ec);
        this.listDataChild.put((String) this.listDataHeader.get(4), envi);
        this.listDataChild.put((String) this.listDataHeader.get(5), gen);
    }

    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        parent.clearFocus();
        this.vibe.vibrate(20);
        Bundle args = new Bundle();
        args.putInt(WorkshopDescriptionActivity.PARENT, groupPosition);
        args.putInt(WorkshopDescriptionActivity.CHILD, childPosition);
        getActivity().getActionBar().setTitle(((String) this.listDataHeader.get(groupPosition)).toString());
        Fragment fragment = new SymposiumDesc();
        fragment.setArguments(args);
        getFragmentManager().beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
        return false;
    }

    public void onGroupExpand(int groupPosition) {
        if (groupPosition != this.previousGroup) {
            this.expListView.collapseGroup(this.previousGroup);
        }
        this.previousGroup = groupPosition;
    }
}
