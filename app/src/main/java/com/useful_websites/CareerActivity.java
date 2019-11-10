package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class CareerActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("PayScale", "PayScale has this interactive survey/quiz, which will help you determine how much you’re worth, whether you want to know if you’re underpaid or just evaluating a job offer or two.", "Career", "www.payscale.com", "s", "v"),

            new cardClass("Remote Stories", "Share your experiences, thoughts, concerns, opinions as a \"remote\" worker on Remote Stories.", "Career", "https://www.remotestories.com", "", ""),

            new cardClass("Quartz at Work", "Quartz at Work is a blog that teaches you how to be a better manager, build your career, and navigate the modern workplace.", "Career", "qz.com", "", ""),

            new cardClass("80,000 Hours", "80,000 Hours is a organisation that conducts research on which careers have the largest positive social impact and provides career advice based on that research. It provides this advice on their website and podcast, and through one-on-one advice sessions.", "Career", "https://80000hours.org", "", ""),

            new cardClass("50 Ways to Get a Job", "Searching your dream Job ? Then this site is for you. This interactive website features useful exercises for you. You don’t have to go in any particular order. Start with blocks that best fit you and where you currently are in life. There’s no perfectly linear path.", "Career", "https://50waystogetajob.com", "", ""),

            new cardClass("Chef2Chef", "Chef2Chef brings together an interactive community of culinary professionals and foodies alike, connecting them through in-depth news stories, student blogs, recipe sharing and job opportunity listings.", "Career", "", "", ""),

            new cardClass("Startup Jobs", "Here’s another great website for finding startup jobs—remote and in-office.", "Career", "https://startup.jobs/", "", ""),

            new cardClass("AngelList Jobs", "AngelList is a great place to find startup jobs. Just filter by location, compensation, and/or “skill” or position type.", "Career", "https://angel.co/jobs", "", ""),

            new cardClass("Authentic Jobs", "AuthenticJobs is the leading job board to hire UI/UX designers, developers, and creative professionals. Used by New York Times, Tesla, Mercedes and many more.", "Career", "https://authenticjobs.com/", "", ""),

            new cardClass("Freelance Writing Jobs", "Freelance Writing Jobs is an aggregator of all the freelance writing/editing jobs found on the Internet.", "Career", "https://www.freelancewriting.com/jobs/", "", ""),

            new cardClass("We Work Remotely", "We Work Remotely is the largest remote work community in the world. With over 2.5M monthly visitors, WWR is the destination to find and list incredible remote jobs.", "Career", "https://weworkremotely.com/", "", ""),

            new cardClass("key: values", "This website helps you generate a list of relevant questions to ask in your job interview, which will make you not only look smart, but will also help you decide if a job is the right fit for you.", "Career", "https://www.keyvalues.com/", "", ""),

            new cardClass("Resume Worded", "Probably the hardest part of developing a resume is generating creative, impressive bullet points.\n" + "Resume Worded with its directory of “resume bullets” based on skill and industry and job positions solves your problem.", "Career", "https://resumeworded.com/?ref=producthunt", "", ""),

            new cardClass("Crystal Knows", "If you are about to meet someone and don't know much about him/her then this app is extremely useful when reaching out to people you don’t know.", "Career", "https://www.crystalknows.com/", "", ""),

            new cardClass("CV Maker", "Build a professional Resume.", "Career", "https://www.cvmkr.com/", "", ""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);
        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/5836274714") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_career);
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
