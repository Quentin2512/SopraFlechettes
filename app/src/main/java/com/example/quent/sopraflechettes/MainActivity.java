package com.example.quent.sopraflechettes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button seeVideoDessus;
    Button seeVideoFace;
    Button seeVideoDroite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seeVideoDessus = (Button) findViewById(R.id.btSeeVideoDessus);
        seeVideoFace = (Button) findViewById(R.id.btSeeVideoFace);
        seeVideoDroite = (Button) findViewById(R.id.btSeeVideoDroite);

        seeVideoDessus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SeeVideoDessus.class);
                startActivityForResult(myIntent, 0);
            }
        });

        seeVideoFace.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SeeVideoFace.class);
                startActivityForResult(myIntent, 0);
            }
        });

        seeVideoDroite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SeeVideoDroite.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
