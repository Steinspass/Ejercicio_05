package com.example.ndpsh.ejercicio_05.Splash;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.example.ndpsh.ejercicio_05.Activities.LoginActivity;
import com.example.ndpsh.ejercicio_05.Activities.MainActivity;
import com.example.ndpsh.ejercicio_05.Utils.Util;

public class SplashSrceenActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        Intent intentlogin = new Intent(this, LoginActivity.class);
        Intent intentMain = new Intent(this, MainActivity.class);

        if(!TextUtils.isEmpty(Util.getUserMailPrefs(prefs)) &&
                !TextUtils.isEmpty(Util.getUserPassPrefs(prefs))) {
            startActivity(intentMain);
        }else {
            startActivity(intentlogin);
        }
        finish();
    }
}
