package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class StudyActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("HubSpot Academy", "HubSpot Academy is a great place to start learning marketing for free.\n" + "Take courses on anything from design to social media and lots more.","Learn", "https://academy.hubspot.com","",""),

            new cardClass("Interneting is Hard", "Do you think creating a website is hard ? No more, get HTML, CSS, and JavaScript tutorials in the most interesting way (diagrams, hands-on). It's free.","Learn", "https://internetingishard.com","",""),

            new cardClass("Blinkist", "Blinkist is a really cool website that turns 2,500+ popular, non-fiction books into 15-minute quick summaries.","Learn", "https://www.blinkist.com","",""),

            new cardClass("Actionable Books", "This is similar to Blinkist but free, contains over 1155 summaries, although it’s not regularly updated anymore.","Learn", "www.actionablebooks.com","",""),

            new cardClass("Duolingo", "Want to learn a new language ? Duolingo offers you the easiest and funniest way to learn a new language — for free.","Learn", "https://www.duolingo.com/","",""),

            new cardClass("Codecademy", "The best place to learn coding online.","Learn", "http://codeacademy.com/","",""),

            new cardClass("Smashing Magazine", "Latest trends in Web design and development and links to free resources.","Learn", "https://www.smashingmagazine.com/","",""),

            new cardClass("Khan Academy", "Khan Academy is a online learning platform where you can learn things like coding, designing, writing, etc for free.","Learn", "https://www.khanacademy.com/","",""),

            new cardClass("Brightstorm", "Learn any subject Mathematics, History, Science, prepare for entrance exam with experienced teachers.","Learn", "https://www.brightstorm.com/","",""),

            new cardClass("Howcast", "Howcast is the best source for fun, free and useful how-t- videos and guides.","Learn", "https://www.howcast.com","",""),

            new cardClass("Solo Learn", "One of the best place to earn coding for free.","Learn", "https://www.sololearn.com/","",""),

            new cardClass("Typing Club","Learn touch typing online using Typing Club's free courses.","Learn","https://www.typingclub.com","",""),

            new cardClass("Study Tonight", "Learn Programming Languages.","Learn", "https://www.studytonight.com/","",""),

            new cardClass("Justin Guitar", "Learn to play a GUITAR.","Learn", "https://www.justinguitar.com/","",""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/7967614035") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_study);
        mAdapter = new cardAdapter(getApplicationContext(), R.layout.card_layout, detailsArray);

        if (Listview != null) {
            Listview.setAdapter(mAdapter);
        }
    }
    @Override
    public void onBackPressed(){
        mInterAd.show();
        super.onBackPressed();
    }
}
