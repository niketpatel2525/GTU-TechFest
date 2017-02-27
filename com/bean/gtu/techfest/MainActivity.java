package com.bean.gtu.techfest;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.DialogFragment;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.WindowCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    CustomDrawerAdapter adapter;
    List<Slider_List_Bean> dataList;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private CharSequence mDrawerTitle;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mTitle;
    Vibrator vibe;

    private class DrawerItemClickListener implements OnItemClickListener {
        private DrawerItemClickListener() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            MainActivity.this.SelectItem(position);
        }
    }

    /* renamed from: com.bean.gtu.techfest.MainActivity.1 */
    class C00641 extends ActionBarDrawerToggle {
        C00641(Activity $anonymous0, DrawerLayout $anonymous1, int $anonymous2, int $anonymous3, int $anonymous4) {
            super($anonymous0, $anonymous1, $anonymous2, $anonymous3, $anonymous4);
        }

        public void onDrawerClosed(View view) {
            MainActivity.this.invalidateOptionsMenu();
        }

        public void onDrawerOpened(View drawerView) {
            MainActivity.this.invalidateOptionsMenu();
        }
    }

    public void onBackPressed() {
        SelectItem(0);
        Toast.makeText(getApplicationContext(), "Press Home To Exit", 0).show();
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0049R.layout.activity_main);
        this.dataList = new ArrayList();
        CharSequence title = getTitle();
        this.mDrawerTitle = title;
        this.mTitle = title;
        this.mDrawerLayout = (DrawerLayout) findViewById(C0049R.id.drawer_layout);
        this.mDrawerList = (ListView) findViewById(C0049R.id.left_drawer);
        this.mDrawerLayout.setDrawerShadow((int) C0049R.drawable.drawer_shadow, (int) GravityCompat.START);
        this.vibe = (Vibrator) getSystemService("vibrator");
        addList();
        this.adapter = new CustomDrawerAdapter(this, C0049R.layout.slider_list, this.dataList);
        this.mDrawerList.setAdapter(this.adapter);
        this.mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        this.mDrawerToggle = new C00641(this, this.mDrawerLayout, C0049R.drawable.ic_drawer, C0049R.string.drawer_open, C0049R.string.drawer_close);
        this.mDrawerLayout.setDrawerListener(this.mDrawerToggle);
        if (savedInstanceState == null) {
            SelectItem(0);
        }
    }

    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        this.mDrawerToggle.syncState();
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.mDrawerToggle.onConfigurationChanged(newConfig);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (this.mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return false;
    }

    private void addList() {
        this.dataList.add(new Slider_List_Bean("Event"));
        this.dataList.add(new Slider_List_Bean("Quizzes"));
        this.dataList.add(new Slider_List_Bean("Workshop"));
        this.dataList.add(new Slider_List_Bean("Symposiums"));
        this.dataList.add(new Slider_List_Bean("Exhibition"));
        this.dataList.add(new Slider_List_Bean("GTU"));
        this.dataList.add(new Slider_List_Bean("LDCE"));
        this.dataList.add(new Slider_List_Bean("Registration"));
        this.dataList.add(new Slider_List_Bean("Developers"));
        this.dataList.add(new Slider_List_Bean("Contact us"));
    }

    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    public void SelectItem(int position) {
        this.vibe.vibrate(20);
        getActionBar().setTitle(((Slider_List_Bean) this.dataList.get(position)).getItem().toString());
        Fragment fragment = null;
        switch (position) {
            case DialogFragment.STYLE_NORMAL /*0*/:
                fragment = new FragmentList(getApplicationContext());
                break;
            case CursorAdapter.FLAG_AUTO_REQUERY /*1*/:
                fragment = new Quizzes();
                break;
            case CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER /*2*/:
                fragment = new Workshop();
                break;
            case FragmentManagerImpl.ANIM_STYLE_CLOSE_ENTER /*3*/:
                fragment = new Symposiums(getApplicationContext());
                break;
            case TransportMediator.FLAG_KEY_MEDIA_PLAY /*4*/:
                fragment = new Exhibition();
                break;
            case FragmentManagerImpl.ANIM_STYLE_FADE_ENTER /*5*/:
                fragment = new GTUInfo();
                break;
            case FragmentManagerImpl.ANIM_STYLE_FADE_EXIT /*6*/:
                fragment = new LDCEInfo();
                break;
            case MotionEventCompat.ACTION_HOVER_MOVE /*7*/:
                fragment = new Register();
                break;
            case TransportMediator.FLAG_KEY_MEDIA_PLAY_PAUSE /*8*/:
                fragment = new Aboutus();
                break;
            case WindowCompat.FEATURE_ACTION_BAR_OVERLAY /*9*/:
                fragment = new Contactus();
                break;
        }
        getFragmentManager().beginTransaction().replace(C0049R.id.content_frame, fragment).commit();
        this.mDrawerList.setItemChecked(position, true);
        this.mDrawerLayout.closeDrawer(this.mDrawerList);
    }
}
