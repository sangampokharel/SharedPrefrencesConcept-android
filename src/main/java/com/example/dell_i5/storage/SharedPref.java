package com.example.dell_i5.storage;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {

    private SharedPreferences sharedPreferences;
    public SharedPref(Context context) {
    sharedPreferences=context.getSharedPreferences("myref",Context.MODE_PRIVATE);
    }


    public void saveData(String username,String password){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("Username",username);
        editor.putString("password",password);
        editor.commit();
    }


    public String  retrieveData(){
        String data=sharedPreferences.getString("Username","No data");
        data+=sharedPreferences.getString("password","no data");
        return data;
    }
}
