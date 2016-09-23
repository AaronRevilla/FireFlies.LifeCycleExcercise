package com.example.aaron.lifecycleexcercise;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_CAT = "AR   Activity 1 ----->";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(LOG_CAT, "OnStart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_CAT, "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_CAT, "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_CAT, "OnDestroy");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(LOG_CAT, "OnPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LOG_CAT, "OnPostResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_CAT, "OnRestart");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(LOG_CAT, "OnBackPressed");
    }

    public void onGo(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void goToA2(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        //i.putExtra("Name", personName.getText().toString());
        startActivityForResult(i, 1);
        //startActivity(i);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1){
            if(resultCode == RESULT_OK){
                //String tmp = data.getStringExtra("Name");
                //personName.setText(tmp);
                Log.d(LOG_CAT, "Result return OK" + RESULT_OK);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //outState.putString("TheName", editText.getText().toString());
        Log.d(LOG_CAT, "OnSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //txtView.setText(savedInstanceState.getString("TheName", "Default"));
        Log.d(LOG_CAT, "OnRestoreInstanceState");
    }
}
