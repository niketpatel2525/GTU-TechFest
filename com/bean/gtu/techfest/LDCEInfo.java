package com.bean.gtu.techfest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class LDCEInfo extends Fragment {
    WebView tvLDCE;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(C0049R.layout.ldce, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.tvLDCE = (WebView) view.findViewById(C0049R.id.tvLDCE);
        this.tvLDCE.loadData(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("<html><body bgcolor='#000000' text='#FFFFFF' align='justify'><p align=\"justify\">" + "L.D. College of Engineering, Ahmedabad is one of the most prestigious engineering colleges inthe state of Gujarat as well as India. ")).append("</p>").toString())).append("<p>").toString())).append("The institution today stands at one of the highest points of credit for it has been successfullyimparting an elevated level of technical education and facilitated research and training in variousfields of engineering and technology to budding engineering students. Legend speaks of the fact thatthis father figure of a technical institution is the oldest engineering college in the state. L.D. Collegeof Engineering as it is commonly addressed has been named after Sheth Shree Lalbhai Dalpatbhai, theperson who pioneered in laying the foundation of the institution. Way back in 1948 with a munificentgift of Rs. 25 lacs and 31.2 hectares of land by the then textile magnate Shri Kasturbhai Lalbhai, thefirst brick of construction was laid leading to the dawn of a new era in learning and application ofthat learning in the technical direction. The institution as of today, finds its existence in the map ofAhmedabad as the heart of many a leading institution in various streams like Physical ResearchLaboratory (PRL), Ahmedabad Textile Industry\u2019s Research Association (ATIRA), ISRO, Indian Instituteof Management Ahmedabad, Center for Environmental Planning and Technology University (CEPT),Gujarat University, etc.").toString())).append("</p>").toString())).append("<p>").toString())).append("The institution is affiliated to Gujarat Technological University, Ahmedabad and is administered by the department of Technical Education, Gujarat based in Gandhinagar. However, it is interesting to know that this very institution was not affiliated to at the time of establishment. Initially, the college enjoyed its status under the jurisdiction of the then Bombay University. The first batch of students was a mere 75 for undergraduate scheme but gradually these 75 students paved way for the future batches to increase the growth of technical community. In June 1955, the number of seats into different disciplines was increased to 150 and further to 300 an 1957. Post Graduation Program was first introduced in the college in the Electrical Department in 1954 and soon in 1963, the degree and diploma institutions were separated administratively.").toString())).append("</p>").toString())).append("<p>").toString())).append("At present the college boasts of strength of 14 undergraduate, 12 post graduate and 4 part-time diploma degree programs. The students community is approximately 3300 strong with more than 2950(full time) and 350 (part time). ").toString())).append("</p>").toString())).append("<p>").toString())).append("The college enjoys the recognition of the Indian Government as leading institute under TEQIP (Technical Education Quality Improvement Program) and has been sanctioned Rs.30crores by the World Bank for Laboratory modernization and development.").toString())).append("</p>").toString())).append("<p>").toString())).append("All the departments of L.D. College of Engineering have been accredited by AICTE which makes it the lone nominee in Gujarat to rule as a college whose all departments have been given such status. ").toString())).append("</p>").toString())).append("<p>").toString())).append("The institution is in constant liaison with major industries and institutes like CII, IPCL, IFFCO, GNFC, GEB, NID, SAC, CBRI, PWD, AEC, ONGS, PRL, GEDA, WALMI, SISI, IIM-A, INSTITUE OF Engineers, Institute of Chemical Engineers and many more.").toString())).append("</p>").toString())).append("</body></html>").toString(), "text/html", "utf-8");
    }
}