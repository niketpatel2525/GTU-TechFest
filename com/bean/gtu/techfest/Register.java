package com.bean.gtu.techfest;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class Register extends Fragment {
    WebView ourBrow;

    private class processWeb extends AsyncTask<Void, Void, Void> {
        private ProgressDialog progress;

        private processWeb() {
            this.progress = null;
        }

        protected Void doInBackground(Void... params) {
            Register.this.ourBrow.setWebViewClient(new ourViewClient());
            try {
                Register.this.ourBrow.loadUrl("http://techevents.gtu.ac.in/register/");
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        protected void onCancelled() {
            super.onCancelled();
        }

        protected void onPostExecute(Void result) {
            this.progress.dismiss();
            super.onPostExecute(result);
        }

        protected void onPreExecute() {
            this.progress = ProgressDialog.show(Register.this.getActivity(), null, "Loading Registration form...");
            super.onPreExecute();
        }

        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(C0049R.layout.register, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.ourBrow = (WebView) view.findViewById(C0049R.id.webRegister);
        setSettings();
        new processWeb().execute(new Void[0]);
    }

    private void setSettings() {
        this.ourBrow.getSettings().setJavaScriptEnabled(true);
        this.ourBrow.getSettings().setLoadWithOverviewMode(true);
        this.ourBrow.getSettings().setUseWideViewPort(true);
    }
}
