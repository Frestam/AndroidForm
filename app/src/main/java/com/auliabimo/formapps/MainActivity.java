package com.auliabimo.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Log
    private void showLog(String text){
        Log.d(getPackageName(), text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputName = (EditText) findViewById(R.id.idInputName);
        final EditText inputEmail = (EditText) findViewById(R.id.idInputEmail);
        final EditText inputPhone = (EditText) findViewById(R.id.idInputPhone);
        final EditText inputPwd = (EditText) findViewById(R.id.idInputPwd);

        Button btnSave = (Button) findViewById(R.id.idButtonSave);
        btnSave.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){

               Log.d("--Nama--", inputName.getText().toString());
               Log.d("--Email--", inputEmail.getText().toString());
               Log.d("--Nomor HP--", inputPhone.getText().toString());
               Log.d("--Password--", inputPwd.getText().toString());

           }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLog("Activity Started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("Activity Restarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showLog("Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("Activity Destroyed");
    }
}