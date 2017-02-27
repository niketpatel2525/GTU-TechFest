package com.bean.gtu.techfest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.WindowCompat;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymposiumDesc extends Fragment implements OnGroupExpandListener, OnChildClickListener {
    public static final String CHILD = "child";
    public static final String PARENT = "parent";
    int child;
    TextView contact;
    List<String> description;
    List<String> desig;
    TextView event;
    ExpandableListView expListView;
    TextView fee;
    int group;
    List<String> lcontact;
    ExpandableListAdapter listAdapter;
    HashMap<String, List<String>> listDataChild;
    List<String> listDataHeader;
    int previousGroup;
    TextView slogan;
    TextView team;
    TextView venue;

    public SymposiumDesc() {
        this.previousGroup = -1;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(C0049R.layout.symposiumdesc, container, false);
        this.group = getArguments().getInt(PARENT);
        this.child = getArguments().getInt(CHILD);
        return rootView;
    }

    public void onViewCreated(View rootView, Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);
        this.expListView = (ExpandableListView) rootView.findViewById(C0049R.id.lvExp22);
        this.event = (TextView) rootView.findViewById(C0049R.id.event2);
        this.listDataHeader = new ArrayList();
        this.listDataChild = new HashMap();
        this.description = new ArrayList();
        this.desig = new ArrayList();
        this.lcontact = new ArrayList();
        switchData(this.group, this.child);
        this.listAdapter = new ExpandableListAdapter(getActivity().getBaseContext(), this.listDataHeader, this.listDataChild);
        this.expListView.setAdapter(this.listAdapter);
        this.expListView.setOnChildClickListener(this);
        this.expListView.setOnGroupExpandListener(this);
    }

    private void switchData(int groupPosition, int childPosition) {
        switch (groupPosition) {
            case DialogFragment.STYLE_NORMAL /*0*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.event.setText("Actionable analytics");
                        prepareListData(0);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.event.setText("SKILL SCENARIO IN IT INDUSTRY");
                        prepareListData(1);
                    default:
                }
            case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.event.setText("Graviational Waves - An Approach to Know Universe");
                        prepareListData(10);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.event.setText("Nano-technology:Concepts and Application");
                        prepareListData(11);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.event.setText("Smart Material Application in Space Present & Future");
                        prepareListData(12);
                    default:
                }
            case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.event.setText("Green Building");
                        prepareListData(20);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.event.setText("Building Information Modeling");
                        prepareListData(21);
                    default:
                }
            case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.event.setText("Indian power scenario and opportunities");
                        prepareListData(30);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.event.setText("Indian power scenario and opportunities");
                        prepareListData(31);
                    default:
                }
            case TransportMediator.FLAG_KEY_MEDIA_PLAY /*4*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.event.setText("LEAGLE ASPECTS OF ENVIRONMENT POLLUTION CONTROL LAWS");
                        prepareListData(40);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.event.setText("USE OF SPECIALTY RUBBER IN INDUSTRY");
                        prepareListData(41);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.event.setText("COLOUR MATER BATCHES SPECIALITY ADITIVES AND POLYMER");
                        prepareListData(42);
                    case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                        this.event.setText("SOLID WASTE MANAGEMENT");
                        prepareListData(43);
                    default:
                }
            case FragmentManagerImpl.ANIM_STYLE_FADE_ENTER /*5*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.event.setText("MASTERING EMOTIONAL INTELLIGENCE FOR SUCCESS");
                        prepareListData(50);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.event.setText("INNOVATION VERSUS INVENTION & INTERNET OF THINGS");
                        prepareListData(51);
                    default:
                }
            default:
        }
    }

    private void prepareListData(int i) {
        this.lcontact.add("Akshat Shah" + System.getProperty("line.separator") + "Mobile No: +91-9427274879" + System.getProperty("line.separator") + "Email Id: akshatshah3879@gmail.com" + System.getProperty("line.separator") + "Darshit Shah" + System.getProperty("line.separator") + "Mobile No: +91-9924106321" + System.getProperty("line.separator") + "Email Id: shahdarshit6321@yahoo.com");
        switch (i) {
            case DialogFragment.STYLE_NORMAL /*0*/:
                setParent();
                this.description.add("Paresh Shah");
                setChild();
                this.desig.add("Director, Value Chain Solution and Supply Chain Consultant");
            case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                setParent();
                this.description.add("Deep Patel");
                this.desig.add("CEO & CO-FOUNDER OF INTERESTSHIP");
                setChild();
            case WindowCompat.FEATURE_ACTION_MODE_OVERLAY /*10*/:
                setParent();
                this.description.add("Dr Manojkumar Gupta");
                this.desig.add("J-grade scientist Institute of Plasma Research");
                setChild();
            case 11:
                setParent();
                this.description.add("Dr. Utpal Joshi");
                this.desig.add("Associate Professor of Physics,Gujarat University");
                setChild();
            case 12:
                setParent();
                this.description.add("Dr. B. S. Munjal");
                this.desig.add("Head, Structures system division, SAC(Space Application Center), ISRO");
                setChild();
            case 20:
                setParent();
                this.description.add("Sameer Sinha");
                this.desig.add("M.D, Savvy Infrastructure Ltd");
                setChild();
            case 21:
                setParent();
                this.description.add("Anand Shah");
                this.desig.add("Founder & Director,DELF\u00a0Consulting Engineers (India) Pvt Ltd.");
                setChild();
            case 30:
                setParent();
                this.description.add("Yogesh patel");
                this.desig.add("Manager CMC,Torrent Power Ltd");
                setChild();
            case 31:
                setParent();
                this.description.add("Nitin Joshi");
                this.desig.add("Asst GM, Operation and Maintainance");
                setChild();
            case 40:
                setParent();
                this.description.add("Jayesh Vyas");
                this.desig.add("Chief Engg, Gujarat Pollution Control Board");
                setChild();
            case 41:
                setParent();
                this.description.add("Atul Shah");
                this.desig.add("MD,Pioneer Industries");
                setChild();
            case 42:
                setParent();
                this.description.add("Chetan Shah");
                this.desig.add("MD, Dhrishti Polytech");
                setChild();
            case 43:
                setParent();
                this.description.add("Dr. S. R. Maley");
                this.desig.add("Director and CEO,ECO save systems Pvt Ltd");
                setChild();
            case 50:
                setParent();
                this.description.add("Anurag Lakhlani");
                this.desig.add("Author of Manage Your Mind");
                setChild();
            case 51:
                setParent();
                this.description.add("Pradip Subramaniam");
                this.desig.add("Founder and Director,Growtech Innovations India Private Limited");
                setChild();
            default:
        }
    }

    private void setChild() {
        this.listDataChild.put((String) this.listDataHeader.get(0), this.description);
        this.listDataChild.put((String) this.listDataHeader.get(1), this.desig);
        this.listDataChild.put((String) this.listDataHeader.get(2), this.lcontact);
    }

    private void setParent() {
        this.listDataHeader.add("Speaker");
        this.listDataHeader.add("Designation");
        this.listDataHeader.add("Contact");
    }

    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        return false;
    }

    public void onGroupExpand(int groupPosition) {
        if (groupPosition != this.previousGroup) {
            this.expListView.collapseGroup(this.previousGroup);
        }
        this.previousGroup = groupPosition;
    }
}
