package com.example.android.singlescreenapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     *
     * This method links the Instagram icon to the site.
     *
     */
    public void onClick(View view) {


        Uri uri = Uri.parse(getString(R.string.Insagram_link));


        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage(getString(R.string.Instagram_setPackage));

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {

            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(getString(R.string.Instagram_link))));
        }
    }
}
