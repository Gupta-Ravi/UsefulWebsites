package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SubmitWebsiteActivity extends AppCompatActivity {

    EditText feedback, webLink;
    String feedB;
    ImageView send ;
    private AdView madview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_website);

        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        madview = findViewById(R.id.adView) ;
        AdRequest adRequest = new AdRequest.Builder().build() ;
        madview.loadAd(adRequest);

        feedback = (EditText) findViewById(R.id.feedback);
        webLink = (EditText) findViewById(R.id.web_link);
        send = (ImageView) findViewById(R.id.sendEmail) ;

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "ravigupta3282@gmail.com";
                String subject = "Useful Website From User";
                String fb = feedback.getText().toString().trim();
                String link = webLink.getText().toString().trim();

                feedB = "Link or Name : " + link + "\n\n" + "Feedback : " + fb;

                sendWebsite(email, subject, feedB);
            }
        });
    }

    private void sendWebsite(String email, String subject, String fb) {
        Intent I = new Intent(Intent.ACTION_SEND);
        I.setData(Uri.parse("mailto:"));
        I.setType("text/plain");
        I.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        I.putExtra(Intent.EXTRA_SUBJECT, subject);
        I.putExtra(Intent.EXTRA_TEXT, fb);

        try {
            startActivity(Intent.createChooser(I, "choose an email client :"));
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}

