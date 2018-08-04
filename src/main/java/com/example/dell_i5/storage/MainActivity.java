package com.example.dell_i5.storage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPref sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         sharedPref=new SharedPref(this);
    }



    public void savaData(View view) {
        EditText user=findViewById(R.id.email);
        EditText pass=findViewById(R.id.password);
        sharedPref.saveData(user.getText().toString(),pass.getText().toString());

    }

    public void loadData(View view) {
        String info=sharedPref.retrieveData();
        Toast.makeText(this, "username"+info+" "+"password"+info, Toast.LENGTH_SHORT).show();
    }
}
