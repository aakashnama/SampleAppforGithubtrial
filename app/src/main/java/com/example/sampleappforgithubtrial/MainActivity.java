package com.example.sampleappforgithubtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void ShowToast(View v)
    {
        Toast.makeText(getApplicationContext(),"Hello User",Toast.LENGTH_SHORT).show();
    }
}
