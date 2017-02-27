package com.bean.gtu.techfest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.widget.TextView;

public class Launcher extends Activity {
    TextView tvGTU;

    /* renamed from: com.bean.gtu.techfest.Launcher.1 */
    class C00481 extends Thread {
        C00481() {
        }

        public void run() {
            super.run();
            try {
                C00481.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Intent openMainActivity = new Intent(Launcher.this.getApplicationContext(), MainActivity.class);
                openMainActivity.setFlags(67108864);
                openMainActivity.addFlags(268435456);
                Launcher.this.startActivity(openMainActivity);
            }
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
        setContentView(C0049R.layout.front_activity);
        this.tvGTU = (TextView) findViewById(C0049R.id.tvGTU);
        this.tvGTU.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ethno.ttf"));
        new C00481().start();
    }
}
