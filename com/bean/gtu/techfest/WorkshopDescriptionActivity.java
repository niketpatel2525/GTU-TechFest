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
import com.gtu.centraltechfest.workshopEntry.WorkshopBenefits;
import com.gtu.centraltechfest.workshopEntry.WorkshopConduct;
import com.gtu.centraltechfest.workshopEntry.WorkshopContact;
import com.gtu.centraltechfest.workshopEntry.WorkshopContent;
import com.gtu.centraltechfest.workshopEntry.WorkshopDesc;
import com.gtu.centraltechfest.workshopEntry.WorkshopDuration;
import com.gtu.centraltechfest.workshopEntry.WorkshopFee;
import com.gtu.centraltechfest.workshopEntry.WorkshopName;
import com.gtu.centraltechfest.workshopEntry.WorkshopParticipants;
import com.gtu.centraltechfest.workshopEntry.WorkshopSlogan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorkshopDescriptionActivity extends Fragment implements OnGroupExpandListener, OnChildClickListener {
    public static final String CHILD = "child";
    public static final String PARENT = "parent";
    List<String> benefits;
    int child;
    List<String> conductedBy;
    TextView contact;
    List<String> courseContent;
    List<String> description;
    List<String> duration;
    TextView event;
    ExpandableListView expListView;
    TextView fee;
    int group;
    ImageView img;
    List<String> lcontact;
    ExpandableListAdapter listAdapter;
    HashMap<String, List<String>> listDataChild;
    List<String> listDataHeader;
    int previousGroup;
    TextView slogan;
    TextView team;
    TextView venue;

    public WorkshopDescriptionActivity() {
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
        this.courseContent = new ArrayList();
        this.benefits = new ArrayList();
        this.conductedBy = new ArrayList();
        this.duration = new ArrayList();
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
                        this.img.setImageResource(C0049R.drawable.homeautomation_workshop);
                        this.event.setText(WorkshopName.home_name_work);
                        this.slogan.setText(WorkshopSlogan.tallbuilding_slogan_work);
                        this.team.setText(WorkshopParticipants.home_parti_work);
                        this.fee.setText(WorkshopFee.home_fees_work);
                        prepareListData(80);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.mobilemaking_image);
                        this.event.setText(WorkshopName.mobilemaking_name_work);
                        this.slogan.setText(WorkshopSlogan.tallbuilding_slogan_work);
                        this.team.setText(WorkshopParticipants.tallbuilding_parti_work);
                        this.fee.setText(WorkshopFee.mobilemaking_fees_work);
                        prepareListData(81);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.tall);
                        this.event.setText(WorkshopName.tallbuilding_name_work);
                        this.slogan.setText(WorkshopSlogan.tallbuilding_slogan_work);
                        this.team.setText(WorkshopParticipants.tallbuilding_parti_work);
                        this.fee.setText(WorkshopFee.tallbuilding_fees_work);
                        prepareListData(82);
                    case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                        this.img.setImageResource(C0049R.drawable.javacodetogether);
                        this.event.setText(WorkshopName.oracle_name_work);
                        this.slogan.setText(WorkshopSlogan.oracle_slogan_work);
                        this.team.setText(WorkshopParticipants.tallbuilding_parti_work);
                        this.fee.setText(WorkshopFee.oracle_fees_work);
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
                this.description.add(WorkshopDesc.homeautomation_Desc_work);
                this.benefits.add(WorkshopBenefits.homeautomation_Ben_work);
                this.courseContent.add(WorkshopContent.home_course_work);
                this.conductedBy.add(WorkshopConduct.homeautomation_cond_work);
                this.duration.add(WorkshopDuration.tallbuilding_dur_work);
                this.lcontact.add(WorkshopContact.homeautomation_cont_work);
                this.listDataHeader.remove(3);
                setChild2();
            case 81:
                this.description.add(WorkshopDesc.mobilemaking_Desc_work);
                this.benefits.add(WorkshopBenefits.mobilemaking_Ben_work);
                this.courseContent.add(WorkshopContent.mobilemaking_course_work);
                this.conductedBy.add(WorkshopConduct.mobilemaking_cond_work);
                this.duration.add(WorkshopDuration.tallbuilding_dur_work);
                this.lcontact.add(WorkshopContact.tallbuiliding_cont_work);
                this.listDataHeader.remove(3);
                setChild2();
            case 82:
                this.description.add(WorkshopDesc.tallbuiliding_Desc_work);
                this.benefits.add(WorkshopBenefits.tallbuiliding_Ben_work);
                this.courseContent.add(WorkshopContent.tallbuilding_course_work);
                this.conductedBy.add(WorkshopConduct.tallbuiliding_cond_work);
                this.duration.add(WorkshopDuration.tallbuilding_dur_work);
                this.lcontact.add(WorkshopContact.tallbuiliding_cont_work);
                this.listDataHeader.remove(3);
                setChild2();
            case 83:
                this.description.add(WorkshopDesc.oracle_Desc_work);
                this.benefits.add(WorkshopBenefits.oracle_Ben_work);
                this.courseContent.add(WorkshopContent.oracle_course_work);
                this.conductedBy.add(WorkshopConduct.oracle_cond_work);
                this.duration.add(WorkshopDuration.oracle_dur_work);
                this.lcontact.add(WorkshopContact.oracle_cont_work);
                setChild();
            default:
        }
    }

    private void setChild2() {
        this.listDataChild.put((String) this.listDataHeader.get(0), this.description);
        this.listDataChild.put((String) this.listDataHeader.get(1), this.courseContent);
        this.listDataChild.put((String) this.listDataHeader.get(2), this.benefits);
        this.listDataChild.put((String) this.listDataHeader.get(3), this.duration);
        this.listDataChild.put((String) this.listDataHeader.get(4), this.lcontact);
    }

    private void setChild() {
        this.listDataChild.put((String) this.listDataHeader.get(0), this.description);
        this.listDataChild.put((String) this.listDataHeader.get(1), this.courseContent);
        this.listDataChild.put((String) this.listDataHeader.get(2), this.benefits);
        this.listDataChild.put((String) this.listDataHeader.get(3), this.conductedBy);
        this.listDataChild.put((String) this.listDataHeader.get(4), this.duration);
        this.listDataChild.put((String) this.listDataHeader.get(5), this.lcontact);
    }

    private void setParent() {
        this.listDataHeader.add("Description");
        this.listDataHeader.add("Course Content");
        this.listDataHeader.add("Benefits");
        this.listDataHeader.add("Conducted By");
        this.listDataHeader.add("Duration");
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
