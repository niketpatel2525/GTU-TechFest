package com.bean.gtu.techfest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.WindowCompat;
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
import com.gtu.centralfest.staticentry.EventJudgeClass;
import com.gtu.centralfest.staticentry.EventNameClass;
import com.gtu.centralfest.staticentry.EventProblem;
import com.gtu.centralfest.staticentry.EventRulesClass;
import com.gtu.centralfest.staticentry.EventSloganClass;
import com.gtu.centralfest.staticentry.EventTeamClass;
import com.gtu.centraltechfest.workshopEntry.WorkshopSlogan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DescriptionActivity extends Fragment implements OnGroupExpandListener, OnChildClickListener {
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
    List<String> problem;
    List<String> rules;
    TextView slogan;
    TextView team;

    public DescriptionActivity() {
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
        this.listDataHeader = new ArrayList();
        this.listDataChild = new HashMap();
        this.description = new ArrayList();
        this.rules = new ArrayList();
        this.problem = new ArrayList();
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
            case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.roboshuttle_image);
                        this.event.setText(EventNameClass.robo);
                        this.slogan.setText(WorkshopSlogan.tallbuilding_slogan_work);
                        this.team.setText(EventTeamClass.robo_team);
                        this.fee.setText(EventFeeClass.robo_fee);
                        prepareListData(1000);
                    default:
                }
            case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.foodfactory_image);
                        this.event.setText(EventNameClass.food_factory);
                        this.slogan.setText(EventSloganClass.food_factory_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.roverruns_fee);
                        prepareListData(10);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.marsmission_image);
                        this.event.setText(EventNameClass.mars_mission);
                        this.slogan.setText(WorkshopSlogan.tallbuilding_slogan_work);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.roverruns_fee);
                        prepareListData(11);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.robowar_image);
                        this.event.setText(EventNameClass.robowars);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.roverruns_fee);
                        prepareListData(12);
                    case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                        this.img.setImageResource(C0049R.drawable.roverrun);
                        this.event.setText(EventNameClass.roverrun);
                        this.slogan.setText(EventSloganClass.roverrun_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.roverruns_fee);
                        prepareListData(13);
                    case TransportMediator.FLAG_KEY_MEDIA_PLAY /*4*/:
                        this.img.setImageResource(C0049R.drawable.roverrun);
                        this.event.setText(EventNameClass.galaxy_runners);
                        this.slogan.setText(EventSloganClass.galaxy_runners_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.roverruns_fee);
                        prepareListData(14);
                    default:
                }
            case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.junkyardwars_image);
                        this.event.setText(EventNameClass.junkyard_wars);
                        this.slogan.setText(EventSloganClass.junkyard_wars_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(0);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.autodexterous_image);
                        this.event.setText(EventNameClass.autodexteros);
                        this.slogan.setText(EventSloganClass.autodexteros_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(1);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.thoxophilite_image);
                        this.event.setText(EventNameClass.thoxiphilite);
                        this.slogan.setText(EventSloganClass.thoxiphilite_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(2);
                    case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                        this.img.setImageResource(C0049R.drawable.goldbergsmechanism_image);
                        this.event.setText(EventNameClass.goldberg);
                        this.slogan.setText(EventSloganClass.goldberg_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(3);
                    case TransportMediator.FLAG_KEY_MEDIA_PLAY /*4*/:
                        this.img.setImageResource(C0049R.drawable.goldbergsmechanism_image);
                        this.event.setText(EventNameClass.cad_maestro);
                        this.slogan.setText(EventSloganClass.cad_maestro_slogan);
                        this.team.setText(EventTeamClass.wolf_of_street_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(3);
                    default:
                }
            case TransportMediator.FLAG_KEY_MEDIA_PLAY /*4*/:
                switch (childPosition) {
                    case -999:
                        this.img.setImageResource(C0049R.drawable.tremotremor_image);
                        this.event.setText(EventNameClass.tremor_terror);
                        this.slogan.setText(WorkshopSlogan.tallbuilding_slogan_work);
                        this.team.setText(EventTeamClass.tremor_terror_team);
                        this.fee.setText(EventTeamClass.tremor_terror_team);
                        prepareListData(51);
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.bridgeit_image);
                        this.event.setText(EventNameClass.bridge_it);
                        this.slogan.setText(EventSloganClass.bridge_it_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(50);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.urbanista_image);
                        this.event.setText(EventNameClass.urbanista);
                        this.slogan.setText(EventSloganClass.urbanista_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(52);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.makeyourway_image);
                        this.event.setText(EventNameClass.make_ur_way);
                        this.slogan.setText(EventSloganClass.urbanista_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(53);
                    default:
                }
            case FragmentManagerImpl.ANIM_STYLE_FADE_ENTER /*5*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.styleoelectra_image);
                        this.event.setText(EventNameClass.styloelectra);
                        this.slogan.setText(EventSloganClass.styloelectra_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(70);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.electrotrade_image);
                        this.event.setText(EventNameClass.electrotrade);
                        this.slogan.setText(EventSloganClass.electrotrade_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(71);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.crackit_image);
                        this.event.setText(EventNameClass.crackit);
                        this.slogan.setText(EventSloganClass.crackit_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(72);
                    case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                        this.img.setImageResource(C0049R.drawable.technothon_image);
                        this.event.setText(EventNameClass.technathon);
                        this.slogan.setText(EventSloganClass.technathon_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(73);
                    default:
                }
            case FragmentManagerImpl.ANIM_STYLE_FADE_EXIT /*6*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.questography_image);
                        this.event.setText(EventNameClass.questography);
                        this.slogan.setText(EventSloganClass.questography_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(20);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.kicknclimb_image);
                        this.event.setText(EventNameClass.kick_n_climb);
                        this.slogan.setText(EventSloganClass.kick_n_climb_slogan);
                        this.team.setText(EventTeamClass.wolf_of_street_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(21);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.algowizards_image);
                        this.event.setText(EventNameClass.algo_wizards);
                        this.slogan.setText(EventSloganClass.algo_wizards_slogan);
                        this.team.setText(EventTeamClass.wolf_of_street_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(22);
                    case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                        this.img.setImageResource(C0049R.drawable.filesavvy_image);
                        this.event.setText(EventNameClass.file_savvy);
                        this.slogan.setText(EventSloganClass.file_savvy_slogan);
                        this.team.setText(EventTeamClass.wolf_of_street_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(23);
                    case TransportMediator.FLAG_KEY_MEDIA_PLAY /*4*/:
                        this.img.setImageResource(C0049R.drawable.codesquare_image);
                        this.event.setText(EventNameClass.code_square);
                        this.slogan.setText(EventSloganClass.code_square_slogan);
                        this.team.setText(EventTeamClass.wolf_of_street_team);
                        this.fee.setText(EventFeeClass.code_square_fee);
                        prepareListData(24);
                    default:
                }
            case MotionEventCompat.ACTION_HOVER_MOVE /*7*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.greensoul_image);
                        this.event.setText(EventNameClass.green_soul);
                        this.slogan.setText(EventSloganClass.green_soul_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(40);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.waterroadies_images);
                        this.event.setText(EventNameClass.water_roadies);
                        this.slogan.setText(EventSloganClass.water_roadies_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(41);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.smile_image);
                        this.event.setText(EventNameClass.smile);
                        this.slogan.setText(EventSloganClass.smile_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(42);
                    default:
                }
            case TransportMediator.FLAG_KEY_MEDIA_PLAY_PAUSE /*8*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.retroingenierie_image);
                        this.event.setText(EventNameClass.retro_inginerie);
                        this.slogan.setText(EventSloganClass.retro_inginerie_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(30);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.chemofreeze_image);
                        this.event.setText(EventNameClass.chemo_freeze);
                        this.slogan.setText(EventSloganClass.chemo_freeze_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(31);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.chemocar_image);
                        this.event.setText(EventNameClass.chem_e_car);
                        this.slogan.setText(EventSloganClass.chem_e_car_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(32);
                    default:
                }
            case WindowCompat.FEATURE_ACTION_BAR_OVERLAY /*9*/:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.stampoblock_image);
                        this.event.setText(EventNameClass.stasmp);
                        this.slogan.setText(EventSloganClass.stasmp_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(60);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.beataroundtheloom_image);
                        this.event.setText(EventNameClass.beat_the_around_loom);
                        this.slogan.setText(EventSloganClass.beat_the_around_loom_slogan);
                        this.team.setText(EventTeamClass.thoxopilite_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(61);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.maquetti);
                        this.event.setText(EventNameClass.maquet_tex);
                        this.slogan.setText(EventSloganClass.maquet_tex_slogan);
                        this.team.setText(EventTeamClass.urbanista_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(61);
                    default:
                }
            case 11:
                switch (childPosition) {
                    case DialogFragment.STYLE_NORMAL /*0*/:
                        this.img.setImageResource(C0049R.drawable.aceofempire_image);
                        this.event.setText(EventNameClass.ace_of_empire);
                        this.slogan.setText(EventSloganClass.ace_of_empire_slogan);
                        this.team.setText(EventTeamClass.water_roadies_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(90);
                    case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                        this.img.setImageResource(C0049R.drawable.bizplan_image);
                        this.event.setText(EventNameClass.biz_plan);
                        this.slogan.setText(EventSloganClass.biz_plan_slogan);
                        this.team.setText(EventTeamClass.whiz_a_biz_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(91);
                    case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                        this.img.setImageResource(C0049R.drawable.estude_image);
                        this.event.setText(EventNameClass.estidio_de_case);
                        this.slogan.setText(EventSloganClass.estidio_de_case_slogan);
                        this.team.setText(EventTeamClass.estidio_de_case_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(92);
                    case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                        this.img.setImageResource(C0049R.drawable.undebate_image);
                        this.event.setText(EventNameClass.un_debate);
                        this.slogan.setText(EventSloganClass.un_debate_slogan);
                        this.team.setText(EventTeamClass.wolf_of_street_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(93);
                    case TransportMediator.FLAG_KEY_MEDIA_PLAY /*4*/:
                        this.img.setImageResource(C0049R.drawable.wallstreet_image);
                        this.event.setText(EventNameClass.wolf_of_wall_street);
                        this.slogan.setText(EventSloganClass.wolf_of_wall_stree_t_slogan);
                        this.team.setText(EventTeamClass.wolf_of_street_team);
                        this.fee.setText(EventFeeClass.wolf_of_street_fee);
                        prepareListData(94);
                    default:
                }
            default:
        }
    }

    private void prepareListData(int i) {
        if (i == 1000) {
            setParent1();
        } else {
            setParent();
        }
        switch (i) {
            case DialogFragment.STYLE_NORMAL /*0*/:
                this.description.add(EventDescClass.junkyard_wars_Desc);
                this.rules.add(EventRulesClass.junkyard_rules);
                this.judge.add(EventJudgeClass.junkyard_wars_judge);
                this.lcontact.add(EventContactClass.junkyard_contact);
                this.problem.add(EventProblem.junkyard_wars_prostate);
                break;
            case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                this.description.add(EventDescClass.autodexteros_Desc);
                this.rules.add(EventRulesClass.autodextros_rules);
                this.judge.add(EventJudgeClass.autodexteros_judge);
                this.lcontact.add(EventContactClass.autodextros_contact);
                this.problem.add(EventProblem.auto_dexterous_prostate);
                break;
            case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                this.description.add(EventDescClass.thoxiphilite_Desc);
                this.rules.add(EventRulesClass.thoxophilite_rules);
                this.judge.add(EventJudgeClass.thoxiphilite_judge);
                this.lcontact.add(EventContactClass.thoxophilite_contact);
                this.problem.add(EventProblem.thoxophilite_prostate);
                break;
            case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                this.description.add(EventDescClass.goldberg_Desc);
                this.rules.add(EventRulesClass.goldberg_rules);
                this.judge.add(EventJudgeClass.goldberg_judge);
                this.problem.add(EventProblem.goldberg_prostate);
                this.lcontact.add(EventContactClass.goldberg_contact);
                break;
            case TransportMediator.FLAG_KEY_MEDIA_PLAY /*4*/:
                this.description.add(EventDescClass.cad_maestro_Desc);
                this.rules.add(EventRulesClass.cad_maestro_rules);
                this.judge.add(EventJudgeClass.cad_maestro_judge);
                this.problem.add(EventProblem.cad_maestro_prostate);
                this.lcontact.add(EventContactClass.cad_maestro_contact);
                break;
            case WindowCompat.FEATURE_ACTION_MODE_OVERLAY /*10*/:
                this.description.add(EventDescClass.food_factory_Desc);
                this.rules.add(EventRulesClass.food_factory_rules);
                this.judge.add(EventJudgeClass.food_factory_judge);
                this.problem.add(EventProblem.food_factory_prostate);
                this.lcontact.add(EventContactClass.food_factory_contact);
                break;
            case 11:
                this.description.add(EventDescClass.mars_mission_Desc);
                this.rules.add(EventRulesClass.mars_mission_rules);
                this.judge.add(EventJudgeClass.mars_mission_judge);
                this.lcontact.add(EventContactClass.mars_mission_contact);
                break;
            case 12:
                this.description.add(EventDescClass.robowars_Desc);
                this.rules.add(EventRulesClass.robowars_rules);
                this.judge.add(EventJudgeClass.robowars_judge);
                this.lcontact.add(EventContactClass.robowars_contact);
                this.problem.add(EventProblem.robowars_prostate);
                break;
            case 13:
                this.description.add(EventDescClass.roverrun_Desc);
                this.rules.add(EventRulesClass.roverrun_rules);
                this.judge.add(EventJudgeClass.roverrun_judge);
                this.lcontact.add(EventContactClass.roverrun_contact);
                this.problem.add(EventProblem.roverrun_prostate);
                break;
            case 14:
                this.description.add(EventDescClass.galaxy_runners_Desc);
                this.rules.add(EventRulesClass.galaxy_runner_rules);
                this.judge.add(EventJudgeClass.galaxy_runners_judge);
                this.lcontact.add(EventContactClass.galaxy_runner_contact);
                this.problem.add(EventProblem.galaxy_runner_prostate);
                break;
            case 20:
                this.description.add(EventDescClass.questography_Desc);
                this.rules.add(EventRulesClass.questography_rules);
                this.judge.add(EventJudgeClass.questography_judge);
                this.lcontact.add(EventContactClass.questography_contact);
                this.problem.add(EventProblem.questography_prostate);
                break;
            case 21:
                this.description.add(EventDescClass.kick_n_climb_Desc);
                this.rules.add(EventRulesClass.kicknclimb_rules);
                this.judge.add(EventJudgeClass.kick_n_climb_judge);
                this.lcontact.add(EventContactClass.kicknclimb_contact);
                this.problem.add(EventProblem.kick_n_climb_prostate);
                break;
            case 22:
                this.description.add(EventDescClass.algo_wizards_Desc);
                this.rules.add(EventRulesClass.algowizard_rules);
                this.judge.add(EventJudgeClass.algo_wizards_judge);
                this.problem.add(EventProblem.algo_wizards_prostate);
                this.lcontact.add(EventContactClass.algowizard_contact);
                break;
            case 23:
                this.description.add(EventDescClass.file_savvy_Desc);
                this.rules.add(EventRulesClass.filesavvy_rules);
                this.judge.add(EventJudgeClass.file_savvy_judge);
                this.lcontact.add(EventContactClass.filesavvy_contact);
                this.problem.add(EventProblem.file_savvy_prostate);
                break;
            case 24:
                this.description.add(EventDescClass.code_square_Desc);
                this.rules.add(EventRulesClass.code_square_rules);
                this.judge.add(EventJudgeClass.code_square_judge);
                this.lcontact.add(EventContactClass.code_square_contact);
                this.problem.add(EventProblem.code_square_prostate);
                break;
            case 30:
                this.description.add(EventDescClass.retro_inginerie_Desc);
                this.rules.add(EventRulesClass.retro_ingenierie_rules);
                this.judge.add(EventJudgeClass.retro_inginerie_judge);
                this.lcontact.add(EventContactClass.retro_ingrnierie_contact);
                this.problem.add(EventProblem.retro_inginerie_prostate);
                break;
            case 31:
                this.description.add(EventDescClass.chemo_freeze_Desc);
                this.rules.add(EventRulesClass.chemo_freeze_rules);
                this.judge.add(EventJudgeClass.chemo_freeze_judge);
                this.lcontact.add(EventContactClass.chemo_freeze_contact);
                this.problem.add(EventProblem.chemo_freeze_prostate);
                break;
            case TransportMediator.FLAG_KEY_MEDIA_STOP /*32*/:
                this.description.add(EventDescClass.chem_e_car_Desc);
                this.rules.add(EventRulesClass.chem_e_car_rules);
                this.judge.add(EventJudgeClass.chem_e_car_judge);
                this.lcontact.add(EventContactClass.chem_e_car_contact);
                this.problem.add(EventProblem.chem_e_car_prostate);
                break;
            case 40:
                this.description.add(EventDescClass.green_soul_Desc);
                this.rules.add(EventRulesClass.green_soul_rules);
                this.judge.add(EventJudgeClass.green_soul_judge);
                this.problem.add(EventProblem.green_soul_prostate);
                this.lcontact.add(EventContactClass.green_soul_contact);
                break;
            case 41:
                this.description.add(EventDescClass.water_roadies_Desc);
                this.rules.add(EventRulesClass.water_roadies_rules);
                this.judge.add(EventJudgeClass.water_roadies_judge);
                this.problem.add(EventProblem.water_roadies_prostate);
                this.lcontact.add(EventContactClass.water_roadies_contact);
                break;
            case 42:
                this.description.add(EventDescClass.smile_Desc);
                this.rules.add(EventRulesClass.smile_rules);
                this.judge.add(EventJudgeClass.smile_judge);
                this.problem.add(EventProblem.smile_prostate);
                this.lcontact.add(EventContactClass.smile_contact);
                break;
            case 50:
                this.description.add(EventDescClass.bridge_it_Desc);
                this.rules.add(EventRulesClass.bridge_it_rules);
                this.judge.add(EventJudgeClass.bridge_it_judge);
                this.lcontact.add(EventContactClass.bridge_it_contact);
                this.problem.add(EventProblem.bridge_it_prostate);
                break;
            case 52:
                this.description.add(EventDescClass.urbanista_Desc);
                this.rules.add(EventRulesClass.urbanista_rules);
                this.judge.add(EventJudgeClass.urbanista_judge);
                this.problem.add(EventProblem.urbanista_prostate);
                this.lcontact.add(EventContactClass.urbanista_contact);
                break;
            case 53:
                this.description.add(EventDescClass.make_ur_way_Desc);
                this.rules.add(EventRulesClass.make_ur_way_rules);
                this.problem.add(EventProblem.make_ur_way_prostate);
                this.judge.add(EventJudgeClass.make_ur_way_judge);
                this.lcontact.add(EventContactClass.make_ur_way_contact);
                break;
            case 60:
                this.description.add(EventDescClass.stasmp_Desc);
                this.rules.add(EventRulesClass.stasmp_rule);
                this.judge.add(EventJudgeClass.stasmp_judge);
                this.problem.add(EventProblem.stasmp_prostate);
                this.lcontact.add(EventContactClass.stamp_contact);
                break;
            case 61:
                this.description.add(EventDescClass.beat_the_around_loom_Desc);
                this.problem.add(EventProblem.beat_the_around_loom_prostate);
                this.rules.add(EventRulesClass.beat_the_around_loom_rules);
                this.judge.add(EventJudgeClass.beat_the_around_loom_judge);
                this.lcontact.add(EventContactClass.beat_the_around_loom_contact);
                break;
            case 62:
                this.description.add(EventDescClass.maquet_tex_Desc);
                this.rules.add(EventRulesClass.maquet_tex_rules);
                this.judge.add(EventJudgeClass.maquet_tex_judge);
                this.problem.add(EventProblem.maquet_tex_prostate);
                this.lcontact.add(EventContactClass.maquet_tex_contact);
                break;
            case 70:
                this.description.add(EventDescClass.styloelectra_Desc);
                this.rules.add(EventRulesClass.styloelectra_rules);
                this.judge.add(EventJudgeClass.styloelectra_judge);
                this.problem.add(EventProblem.styloelectra_prostate);
                this.lcontact.add(EventContactClass.styloelectra_contact);
                break;
            case 71:
                this.description.add(EventDescClass.electrotrade_Desc);
                this.rules.add(EventRulesClass.electrotrade_rules);
                this.judge.add(EventJudgeClass.electrotrade_judge);
                this.problem.add(EventProblem.electrotrade_Desc);
                this.lcontact.add(EventContactClass.electrotrade_contact);
                break;
            case 72:
                this.description.add(EventDescClass.crackit_Desc);
                this.rules.add(EventRulesClass.crackit_rules);
                this.judge.add(EventJudgeClass.crackit_judge);
                this.problem.add(EventProblem.crackit_prostate);
                this.lcontact.add(EventContactClass.crackit_contact);
                break;
            case 73:
                this.description.add(EventDescClass.technathon_Desc);
                this.rules.add(EventRulesClass.technathon_rules);
                this.judge.add(EventJudgeClass.technathon_judge);
                this.lcontact.add(EventContactClass.technathon_contact);
                this.problem.add(EventProblem.technathon_Desc);
                break;
            case 80:
                this.description.add(EventDescClass.armagaddon_Desc);
                this.rules.add(EventRulesClass.armagaddon_rules);
                this.judge.add(WorkshopSlogan.tallbuilding_slogan_work);
                this.lcontact.add(EventContactClass.armagaddon_contact);
                break;
            case 81:
                this.description.add(EventDescClass.bit_coin_Desc);
                this.rules.add(EventRulesClass.bitcoin_rules);
                this.judge.add(WorkshopSlogan.tallbuilding_slogan_work);
                this.lcontact.add(EventContactClass.bitcoin_contact);
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
            case 90:
                this.description.add(EventDescClass.ace_of_empire_Desc);
                this.rules.add(EventRulesClass.ace_of_empire_rules);
                this.judge.add(EventJudgeClass.ace_of_empire_judge);
                this.lcontact.add(EventContactClass.ace_of_empire_contact);
                this.problem.add(EventProblem.ace_of_empire_prostate);
                break;
            case 91:
                this.description.add(EventDescClass.biz_plan_Desc);
                this.rules.add(EventRulesClass.whiz_a_biz_rules);
                this.judge.add(EventJudgeClass.biz_plan_judge);
                this.lcontact.add(EventContactClass.whiz_a_biz_contact);
                this.problem.add(EventProblem.biz_plan_prostate);
                break;
            case 92:
                this.description.add(EventDescClass.estidio_de_case_Desc);
                this.rules.add(EventRulesClass.estudio_de_caso_rules);
                this.judge.add(EventJudgeClass.estidio_de_case_judge);
                this.lcontact.add(EventContactClass.estudio_de_caso_contact);
                this.problem.add(EventProblem.estidio_de_case_prostate);
                break;
            case 93:
                this.description.add(EventDescClass.un_debate_Desc);
                this.rules.add(EventRulesClass.un_quiz_rules);
                this.judge.add(EventJudgeClass.un_debate_judge);
                this.lcontact.add(EventContactClass.un_quiz_contact);
                this.problem.add(EventProblem.un_debate_prostate);
                break;
            case 94:
                this.description.add(EventDescClass.wolf_of_wall_street_Desc);
                this.rules.add(EventRulesClass.wolf_of_street_rules);
                this.judge.add(EventJudgeClass.wolf_of_wall_street_judge);
                this.lcontact.add(EventContactClass.wolf_of_street_contact);
                this.problem.add(EventProblem.wolf_of_wallstreet_prostate);
                break;
            case 1000:
                this.description.add(EventDescClass.robo_Desc);
                this.rules.add(EventRulesClass.robo_rules);
                this.judge.add(EventJudgeClass.robo_judge);
                this.lcontact.add(EventContactClass.robo_contact);
                this.problem.add(WorkshopSlogan.tallbuilding_slogan_work);
                break;
        }
        if (i == 1000) {
            setChild1();
        } else {
            setChild();
        }
    }

    private void setChild1() {
        this.listDataChild.put((String) this.listDataHeader.get(0), this.description);
        this.listDataChild.put((String) this.listDataHeader.get(1), this.rules);
        this.listDataChild.put((String) this.listDataHeader.get(2), this.judge);
        this.listDataChild.put((String) this.listDataHeader.get(3), this.lcontact);
    }

    private void setParent1() {
        this.listDataHeader.add("Description");
        this.listDataHeader.add("Specification & Rules");
        this.listDataHeader.add("Judging Criteria");
        this.listDataHeader.add("Contact");
    }

    private void setChild() {
        this.listDataChild.put((String) this.listDataHeader.get(0), this.description);
        this.listDataChild.put((String) this.listDataHeader.get(1), this.problem);
        this.listDataChild.put((String) this.listDataHeader.get(2), this.rules);
        this.listDataChild.put((String) this.listDataHeader.get(3), this.judge);
        this.listDataChild.put((String) this.listDataHeader.get(4), this.lcontact);
    }

    private void setParent() {
        this.listDataHeader.add("Description");
        this.listDataHeader.add("Problem Statement");
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
