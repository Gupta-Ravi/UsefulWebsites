package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AboutActivity extends AppCompatActivity {

    private AdView madview ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        madview = findViewById(R.id.adView) ;
        AdRequest adRequest = new AdRequest.Builder().build() ;
        madview.loadAd(adRequest);

        TextView updates = (TextView) findViewById(R.id.aboutUpdates) ;
        TextView terms = (TextView) findViewById(R.id.aboutTerms) ;
        TextView privacy = (TextView) findViewById(R.id.aboutPrivacy) ;
        TextView linkedin = (TextView) findViewById(R.id.aboutLinkedin) ;
        TextView email = (TextView) findViewById(R.id.aboutEmail) ;
        TextView about = (TextView) findViewById(R.id.aboutMe) ;

        updates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(AboutActivity.this, pop.class);
                startActivity(I);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/uw-by-ravi--/about")) ;
                startActivity(i);
            }
        });

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/uw-by-ravi-/terms-and-conditions")) ;
                startActivity(i);
            }
        });

        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/uw-by-ravi/privacy-policy")) ;
                startActivity(i);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/ravi-gupta-849345114/")) ;
                startActivity(i);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "ravigupta3282@gmail.com";
                String subject = "Connect with me";
                sendWebsite(email, subject);
            }
        });
    }

    @SuppressLint("IntentReset")
    private void sendWebsite(String email, String subject) {
        Intent I = new Intent(Intent.ACTION_SEND);
        I.setData(Uri.parse("mailto:"));
        I.setType("text/plain");
        I.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        I.putExtra(Intent.EXTRA_SUBJECT, subject);
        try {
            startActivity(Intent.createChooser(I, "choose an email client :"));
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}