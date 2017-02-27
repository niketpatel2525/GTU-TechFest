package com.bean.gtu.techfest;

import android.animation.ObjectAnimator;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.ImageView;
import com.gtu.centralfest.staticentry.EventNameClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FragmentList extends Fragment implements OnGroupExpandListener, OnChildClickListener {
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
    Integer[] myImageIds;
    int previousGroup;
    Runnable f2r;
    int timeBetween;
    Vibrator vibe;

    /* renamed from: com.bean.gtu.techfest.FragmentList.1 */
    class C00471 implements Runnable {
        int f1i;

        C00471() {
            this.f1i = 0;
        }

        public void run() {
            FragmentList.this.getAnimate();
            FragmentList.this.myGallery.setAnimation(FragmentList.this.animation);
            FragmentList.this.myGallery.setImageResource(FragmentList.this.myImageIds[this.f1i].intValue());
            this.f1i++;
            if (this.f1i >= FragmentList.this.myImageIds.length) {
                this.f1i = 0;
            }
            FragmentList.this.myGallery.postDelayed(FragmentList.this.f2r, 3000);
        }
    }

    public FragmentList(Context c) {
        this.previousGroup = -1;
        this.myImageIds = new Integer[]{Integer.valueOf(C0049R.drawable.b), Integer.valueOf(C0049R.drawable.c), Integer.valueOf(C0049R.drawable.d), Integer.valueOf(C0049R.drawable.e), Integer.valueOf(C0049R.drawable.a)};
        this.fadeInDuration = 500;
        this.timeBetween = 3000;
        this.fadeOutDuration = 1000;
        this.context = c;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(C0049R.layout.activity_home_main, container, false);
        this.vibe = (Vibrator) this.context.getSystemService("vibrator");
        return rootView;
    }

    public void onViewCreated(View rootView, Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);
        this.expListView = (ExpandableListView) rootView.findViewById(C0049R.id.lvExp);
        this.myGallery = (ImageView) rootView.findViewById(C0049R.id.gallery1);
        getAnimate();
        this.myGallery.setAnimation(this.animation);
        this.f2r = new C00471();
        this.myGallery.postDelayed(this.f2r, 3000);
        prepareListData();
        this.listAdapter = new ExpandableListAdapter(getActivity().getBaseContext(), this.listDataHeader, this.listDataChild);
        this.expListView.setAdapter(this.listAdapter);
        this.expListView.setOnChildClickListener(this);
        this.expListView.setOnGroupExpandListener(this);
    }

    private void getAnimate() {
        Animation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setInterpolator(new DecelerateInterpolator());
        fadeIn.setDuration((long) this.fadeInDuration);
        Animation fadeOut = new AlphaAnimation(1.0f, 0.0f);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setStartOffset((long) (this.fadeInDuration + this.timeBetween));
        fadeOut.setDuration((long) this.fadeOutDuration);
        this.animation = new AnimationSet(true);
        this.animation.addAnimation(fadeIn);
        this.animation.addAnimation(fadeOut);
        this.animation.setRepeatCount(1);
    }

    private void prepareListData() {
        this.listDataHeader = new ArrayList();
        this.listDataChild = new HashMap();
        this.listDataHeader.add("ATV Championship 2.0");
        this.listDataHeader.add("Robo Shuttle Striker");
        this.listDataHeader.add("Robotics");
        this.listDataHeader.add("Mekkato");
        this.listDataHeader.add("C Villa");
        this.listDataHeader.add("TechnoElectra");
        this.listDataHeader.add("Softmania");
        this.listDataHeader.add("Envirotech");
        this.listDataHeader.add("Chemetrix");
        this.listDataHeader.add("Textile");
        this.listDataHeader.add("Pharma");
        this.listDataHeader.add("Management");
        List<String> avt = new ArrayList();
        avt.add("ATV Championship");
        List<String> mekkato = new ArrayList();
        mekkato.add("Junkyard Wars");
        mekkato.add("Auto Dexterous");
        mekkato.add("Thoxophilite");
        mekkato.add(EventNameClass.goldberg);
        mekkato.add("CAD-Maestro");
        List<String> robotics = new ArrayList();
        robotics.add("Food Factory");
        robotics.add(EventNameClass.mars_mission);
        robotics.add(EventNameClass.robowars);
        robotics.add(EventNameClass.roverrun);
        robotics.add(EventNameClass.galaxy_runners);
        List<String> softMania = new ArrayList();
        softMania.add("QuestoGraphy");
        softMania.add("Kick N Climb");
        softMania.add(EventNameClass.algo_wizards);
        softMania.add(EventNameClass.file_savvy);
        softMania.add(EventNameClass.code_square);
        List<String> chemetrix = new ArrayList();
        chemetrix.add("R\u00e9tro-ing\u00e9nierie");
        chemetrix.add("Chem-O-Freeze");
        chemetrix.add("Chem-E-Car");
        List<String> environtech = new ArrayList();
        environtech.add(EventNameClass.green_soul);
        environtech.add(EventNameClass.water_roadies);
        environtech.add("SMILE(Space Management)");
        List<String> cvila = new ArrayList();
        cvila.add("Bridge It- Fly in the Sky");
        cvila.add(EventNameClass.urbanista);
        cvila.add(EventNameClass.make_ur_way);
        List<String> textile = new ArrayList();
        textile.add("Stamp-O-Block");
        textile.add("Beat Around The Loom");
        textile.add(EventNameClass.maquet_tex);
        List<String> technoelectra = new ArrayList();
        technoelectra.add("Styl-O-Electra");
        technoelectra.add("Electro Trade");
        technoelectra.add(EventNameClass.crackit);
        technoelectra.add(EventNameClass.technathon);
        List<String> pharma = new ArrayList();
        pharma.add("Case Study");
        pharma.add("Model");
        pharma.add("Myself");
        pharma.add("Reciepe");
        List<String> management = new ArrayList();
        management.add("Ace of empire");
        management.add(EventNameClass.biz_plan);
        management.add("Estidio de case");
        management.add("UN debate");
        management.add("Wolf of Wall street");
        List<String> RoboShuttleStriker = new ArrayList();
        RoboShuttleStriker.add("Robo Shuttle Striker");
        this.listDataChild.put((String) this.listDataHeader.get(0), avt);
        this.listDataChild.put((String) this.listDataHeader.get(1), RoboShuttleStriker);
        this.listDataChild.put((String) this.listDataHeader.get(2), robotics);
        this.listDataChild.put((String) this.listDataHeader.get(3), mekkato);
        this.listDataChild.put((String) this.listDataHeader.get(4), cvila);
        this.listDataChild.put((String) this.listDataHeader.get(5), technoelectra);
        this.listDataChild.put((String) this.listDataHeader.get(6), softMania);
        this.listDataChild.put((String) this.listDataHeader.get(7), environtech);
        this.listDataChild.put((String) this.listDataHeader.get(8), chemetrix);
        this.listDataChild.put((String) this.listDataHeader.get(9), textile);
        this.listDataChild.put((String) this.listDataHeader.get(10), pharma);
        this.listDataChild.put((String) this.listDataHeader.get(11), management);
    }

    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        Fragment fragment;
        parent.clearFocus();
        this.vibe.vibrate(20);
        Bundle args = new Bundle();
        if (groupPosition == 0) {
            args.putInt(WorkshopDescriptionActivity.PARENT, 13);
            args.putInt(WorkshopDescriptionActivity.CHILD, 0);
        } else {
            args.putInt(WorkshopDescriptionActivity.PARENT, groupPosition);
            args.putInt(WorkshopDescriptionActivity.CHILD, childPosition);
        }
        getActivity().getActionBar().setTitle(((String) this.listDataHeader.get(groupPosition)).toString());
        if (groupPosition == 10) {
            fragment = new DescriptionPharmaActivity();
        } else if (groupPosition == 0) {
            fragment = new AVTChampionship();
        } else {
            fragment = new DescriptionActivity();
        }
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
