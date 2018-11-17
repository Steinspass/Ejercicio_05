package com.example.ndpsh.ejercicio_05.Utils;

import android.content.SharedPreferences;

public class Util {

    public static String getUserMailPrefs(SharedPreferences preferences) {
        return preferences.getString("email", "");
    }
    public static String getUserPassPrefs(SharedPreferences preferences) {
        return preferences.getString("pass", "");
    }
    public static void removeSharedPreferences(SharedPreferences preferences) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove("email");
        editor.remove("pass");
        editor.apply();
    }
}

