package com.example.alertapplication;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivityBig extends AppCompatActivity {
    ListViewAdapter adapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_big);

        ImageView imageView = (ImageView) findViewById(R.id.plus_btn);
        GradientDrawable drawable=(GradientDrawable) getDrawable(R.drawable.back_round);
        imageView.setBackground(new ShapeDrawable(new OvalShape()));
        imageView.setClipToOutline(true);

        adapter = new ListViewAdapter() ;
        final ListView listview = findViewById(R.id.listview);
        listview.setAdapter(adapter);
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.drug_base_img),
                "혈압약", "복용") ;
    }
}
