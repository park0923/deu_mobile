package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Context activityContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View v){
        int id = v.getId();
        Button button = (Button) v.findViewById(id);
        String tag = (String) button.getTag();

        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra("arg", tag);
        startActivity(intent);
    }
}