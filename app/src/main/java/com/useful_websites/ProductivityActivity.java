package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class ProductivityActivity extends AppCompatActivity {

    cardClass[] detailsArray = new cardClass[]{
            new cardClass("A Soft Murmur", "Want to increase your productivity ? Well listening to soft music can help a lot. Softmurmur.com gives you the option to choose from a list of various types of sounds (rain, waves, birds, coffee shop).", "Productivity", "https://asoftmurmur.com","",""),

            new cardClass("Power Searching With Google","Learn how to Google.","Productivity","https://coursebuilder.withgoogle.com/sample/","",""),

            new cardClass("Zapier Guides","Easy automation for busy people. Zapier moves info between your web apps automatically, so you can focus on your most important work.","Productivity","https://zapier.com","",""),

            new cardClass("Speaking.io","A free course on public speaking because, as we all know, public speaking is scary AF.","Productivity","https://speaking.io/","",""),

            new cardClass("FirstSearch","FirstSearch is a website that collects the best content from around the web and organizes them into lists to help you learn certain topics faster.","Productivity","https://search.firstround.com","",""),

            new cardClass("Workflowy", "Workflowy is a super simple website where you can quickly make lists for projects, notes, whatever.","Productivity", "https://workflowy.com/","",""),

            new cardClass("Trello", "Trello is a web-based list-making application. Make visual elements for your team on the project.","Productivity", "https://trello.com","",""),

            new cardClass("Brain.fm", "Brain.fm is a freemium focus tool.\n" + "The website features music that will help you either focus, relax, or sleep — whatever your heart desires.","Productivity", "http://brain.fm/","",""),

            new cardClass("Rescuetime", "RescueTime helps you understand where your time goes each day. Optimize your energy. And take back control of your day.","Productivity", "https://www.rescuetime.com/","",""),

            new cardClass("If This Then That (IFTTT)", "IFTTT, is a free web-based service to create chains of simple conditional statements, called applets. An applet is triggered by changes that occur within other web services such as Gmail, Facebook, Telegram, Instagram, or Pinterest.","Productivity", "ifttt.com","",""),

            new cardClass("Ikonick", "Turn empty walls into inspiration. Entrepreneur-inspired art and canvas prints perfect for gyms, offices, real estate offices, man caves, lady dens, and more.","Productivity", "https://ikonick.com","",""),

            new cardClass("Insight Quiz", "The 5-minute Insight Quiz will help you learn more about how you—and someone who knows you well—view your self-awareness. You’ll complete a survey and send one to a friend.*","Productivity", "https://www.insight-book.com/Quiz.aspx","",""),

            new cardClass("Noisli", "Ambient noises to help you improve focus and boost productivity.","Productivity", "https://www.noisli.com/","",""),

            new cardClass("TED", "TED is a nonprofit devoted to spreading ideas, usually in the form of short, powerful talks (18 minutes or less).","Productivity", "www.ted.com","",""),

            new cardClass("Computer Hope", "Keyboard shortcuts can drastically increase your productivity. Computer Hope teaches the basic shortcut keys as well as lists the shortcuts for various software that are used by an average computer user.","Productivity", "https://www.computerhope.com/shortcut.htm","",""),

            new cardClass("Dillinger", "Dillinger is an online cloud-enabled HTML5 Markdown editor. Using Dillinger, you can export clean markdown to HTML, drag and drop images and more. Dillinger is perfect for bloggers and developers alike.","Productivity", "https://dillinger.io/","",""),

            new cardClass("Infogram", "Create stunning infographics charts, reports, social media visuals and a custom dashboard to keep track of the inner as well as outer workings of your business.","Productivity", "https://infogram.com/","",""),

            new cardClass("Stickk", "Want to stick to a Goal ? If yes, then let Stickk help you reach your goals. It makes use of commitment contracts to empower you to better your lifestyle.","Productivity", "http://www.stickk.com/","",""),

            new cardClass("Mermise", "Learn something in a interesting way with Memrise. The additive nature of gaming combined with memory improvement makes this an excellent resource.","Productivity", "https://www.memrise.com/","",""),

            new cardClass("750 Words", "This website advises you aspiring creatives to start each morning with three pages of stream-of-consciousness writing to clear away the mental clutter.","Productivity", "http://750words.com/","",""),

            new cardClass("Bubbl.us", "Create mind-maps, brainstorm ideas in the browser.","Productivity", "https://bubbl.us/","",""),
    };

    private ListView mListView;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productivity);

        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/7967614035") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        mListView = findViewById(R.id.list_for_productivity);
        mAdapter = new cardAdapter(getApplicationContext(), R.layout.card_layout, detailsArray);

        if (mListView != null) {
            mListView.setAdapter(mAdapter);
        }
    }
    @Override
    public void onBackPressed(){
        mInterAd.show();
        super.onBackPressed();
    }
}
