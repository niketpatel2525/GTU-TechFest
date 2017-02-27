package com.bean.gtu.techfest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class GTUInfo extends Fragment {
    WebView tvGTUInfo;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(C0049R.layout.gtu, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.tvGTUInfo = (WebView) view.findViewById(C0049R.id.tvGTUInfo);
        this.tvGTUInfo.loadData(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("<html><body bgcolor='#000000' text='#FFFFFF' align='justify'><p align=\"justify\">" + "\tTechfest is the annual science and technology festival of GUJARAT TECHNOLOGICALICAL UNIVERSITY. It also refers to the independent body of students who organize this event along with many other social initiatives and outreach programs round the year. Techfest is known for hosting a variety of events that include competitions, exhibitions, lectures as well as workshops. It is among the very few student organizations to have received patronage from VARIOUS NON GOVERMENTAL ORGANISATIONS,for promotion of technical know-how and the social causes taken up through ideate competitions and other initiatives over the years.")).append("</p><p>").toString())).append("\tStarted two years before, with the aim of providing a platform for the student community to develop and showcase their technical powers, it has now grown into Gujarat's largest college Science and Technology festival. The activities culminate in a grand three day festival event in the month of March on the campus of L.D.COLLEGE OF ENGINEERING which attracts people from all over Gujarat and India, including students, academia, corporates and the general public. ").toString())).append("</p><p>").toString())).append("\tAs market shifts and rapidly changing technologies transform business, youth with up-to-date and involving skills and set well sustained. The Central GTU Techfest 2015, funded by Gujarat Technical University itself hosted by L.D College of Engineering , is a platform for holistic and overall development for the students. ").toString())).append("</p><p>").toString())).append("\tThe Central GTU Techfest\u201914 comprised of 60+ events related to technical and non-tech fields  encouraging participation from all the GTU affiliated colleges as well as other colleges, institutions and schools. The main highlights of this event were ATV championship, Robotics and other technical events. The concept of ATV championship was introduced for the very first time in Gujarat. Students from more than 500 colleges participated in this fest. The main sponsors for the very cause were Airtel and Polaris. The entire execution was done by LDites and the campus was a big center of attraction for techies from all the state. This year we strive to take this event to a bigger platform. We intend to bring in more innovation and surprises this year. ").toString())).append("</p><p>").toString())).append("\tThe primary foundation of the GTU Central Techfest comprises of zonal techfest being conducted in 5 different zones of Gujarat. ").toString())).append("</p>").toString())).append("</body></html>").toString(), "text/html", "utf-8");
    }
}
