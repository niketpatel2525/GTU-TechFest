package com.bean.gtu.techfest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.gtu.centralfest.staticentry.EventContactClass;
import com.gtu.centralfest.staticentry.EventDescClass;
import com.gtu.centralfest.staticentry.EventFeeClass;
import com.gtu.centralfest.staticentry.EventNameClass;
import com.gtu.centralfest.staticentry.EventRulesClass;
import com.gtu.centralfest.staticentry.EventSloganClass;
import com.gtu.centralfest.staticentry.EventTeamClass;
import com.gtu.centraltechfest.workshopEntry.WorkshopSlogan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuizzesDescriptionActivity extends Fragment implements OnGroupExpandListener, OnChildClickListener {
    public static final String CHILD = "child";
    public static final String PARENT = "parent";
    int child;
    TextView contact;
    List<String> description;
    TextView event;
    ExpandableListView expListView;
    TextView fee;
    int group;
    ImageView img;
    List<String> judge;
    List<String> lcontact;
    ExpandableListAdapter listAdapter;
    HashMap<String, List<String>> listDataChild;
    List<String> listDataHeader;
    int previousGroup;
    List<String> rules;
    TextView slogan;
    TextView team;
    TextView venue;

    public QuizzesDescriptionActivity() {
        this.previousGroup = -1;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(C0049R.layout.event_description, container, false);
        this.group = getArguments().getInt(PARENT);
        this.child = getArguments().getInt(CHILD);
        return rootView;
    }

    public void onViewCreated(View rootView, Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);
        this.expListView = (ExpandableListView) rootView.findViewById(C0049R.id.lvExp2);
        this.img = (ImageView) rootView.findViewById(C0049R.id.eventimage);
        this.event = (TextView) rootView.findViewById(C0049R.id.event);
        this.slogan = (TextView) rootView.findViewById(C0049R.id.slogan);
        this.team = (TextView) rootView.findViewById(C0049R.id.team);
        this.fee = (TextView) rootView.findViewById(C0049R.id.fee);
        this.venue = (TextView) rootView.findViewById(C0049R.id.venue);
        this.venue.setVisibility(4);
        this.listDataHeader = new ArrayList();
        this.listDataChild = new HashMap();
        this.description = new ArrayList();
        this.rules = new ArrayList();
        this.judge = new ArrayList();
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
                        this.img.setImageResource(C0049R.drawable.bitcoin);
                        this.event.setText(EventNameClass.bit_coin);
                        this.slogan.setText(EventSloganClass.bit_coin_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(81);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.armageddon);
                        this.event.setText(EventNameClass.armagaddon);
                        this.slogan.setText(EventSloganClass.armagaddon_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(80);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.bazinga);
                        this.event.setText(EventNameClass.mela);
                        this.slogan.setText(EventSloganClass.mela_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(82);
                    case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                        this.img.setImageResource(C0049R.drawable.opengeneral);
                        this.event.setText(EventNameClass.open_gen);
                        this.slogan.setText(EventSloganClass.open_gen_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(83);
                    default:
                }
            default:
        }
    }

    private void prepareListData(int i) {
        setParent();
        switch (i) {
            case 80:
                this.description.add(EventDescClass.bit_coin_Desc);
                this.rules.add(EventRulesClass.bitcoin_rules);
                this.judge.add(WorkshopSlogan.tallbuilding_slogan_work);
                this.lcontact.add(EventContactClass.bitcoin_contact);
                break;
            case 81:
                this.description.add(EventDescClass.armagaddon_Desc);
                this.rules.add(EventRulesClass.armagaddon_rules);
                this.judge.add(WorkshopSlogan.tallbuilding_slogan_work);
                this.lcontact.add(EventContactClass.armagaddon_contact);
                break;
            case 82:
                this.description.add(EventDescClass.mela_Desc);
                this.rules.add(EventRulesClass.bazinga_rules);
                this.judge.add(WorkshopSlogan.tallbuilding_slogan_work);
                this.lcontact.add(EventContactClass.bazinga_contact);
                break;
            case 83:
                this.description.add(EventDescClass.open_gen_Desc);
                this.rules.add(EventRulesClass.open_gen_quiz_rules);
                this.judge.add(WorkshopSlogan.tallbuilding_slogan_work);
                this.lcontact.add(EventContactClass.open_gen_quiz_contact);
                break;
        }
        setChild();
    }

    private void setChild() {
        this.listDataChild.put((String) this.listDataHeader.get(0), this.description);
        this.listDataChild.put((String) this.listDataHeader.get(1), this.rules);
        this.listDataChild.put((String) this.listDataHeader.get(2), this.judge);
        this.listDataChild.put((String) this.listDataHeader.get(3), this.lcontact);
    }

    private void setParent() {
        this.listDataHeader.add("Description");
        this.listDataHeader.add("Specification & Rules");
        this.listDataHeader.add("Judging Criteria");
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
