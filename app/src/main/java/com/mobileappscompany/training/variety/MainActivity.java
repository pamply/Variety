package com.mobileappscompany.training.variety;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by admin on 3/1/2016.
 */
public class MainActivity extends AppCompatActivity {

    private ImageView photo;
    private TextView textViewContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVars();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Resources res = getResources();

        String[] arrays =  res.getStringArray(R.array.media_names);
        for (String mediaName : arrays) {
            textViewContent.append(mediaName + "/");
        }
    }

    private void initVars() {
        photo = (ImageView) findViewById(R.id.image_view_photo);
        Glide.with(this).load("http://goo.gl/gEgYUd").into(photo);
        textViewContent = (TextView) findViewById(R.id.text_view_content);
    }

    public void goLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
