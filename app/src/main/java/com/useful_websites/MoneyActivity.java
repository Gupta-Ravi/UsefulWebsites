package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MoneyActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("Fiverr", "Fiverr is an online marketplace for freelance services. The company provides a platform for freelancers to offer services to customers worldwide.","Money", "https://www.fiverr.com/","",""),

            new cardClass("Etsy", "Etsy is an e-commerce website focused on handmade or vintage items and craft supplies.","Money", "https://www.etsy.com/\n","",""),

            new cardClass("Task Rabbit", "TaskRabbit is an online and mobile marketplace that matches freelance labor with local demand, allowing consumers to find immediate help with everyday tasks, including cleaning, moving, delivery and handyman work.","Money", "https://www.taskrabbit.com","",""),

            new cardClass("Wonder", "People come to this site when they need research done. You can apply for your research and if they think you have the skills to do research, you'll get access to their dashboard","Money", "https://askwonder.com","",""),

            new cardClass("Thred UP", "Thred UP is the world's largest online thrift store where you can buy and sell high-quality secondhand clothes.","Money", "https://www.thredup.com/","",""),

            new cardClass("Swap", "Swap is an online consignment store. After you send in used clothes and kids toys and games, Swap will sell them for you.","Money", "https://www.swap.com/","",""),

            new cardClass("Gazelle", "If you have an old cellphone, you can sell your electronics here. The website will give you a cash offer for your device.","Money", "https://www.gazelle.com/","",""),

            new cardClass("Cardpool", "Cardpool is a Gift Card exchange service.","Money", "https://www.cardpool.com/","",""),

            new cardClass("Offer Up", "Instantly connect with local buyers and sellers on OfferUp! Buy and sell everything from cars and trucks, electronics, furniture, and more.","Money", "https://offerup.com","",""),

            new cardClass("GoTranscript","Work freelance transcription jobs from home and earn competitive rates.","Money","https://gotranscript.com","",""),

            new cardClass("Patreon", "Patreon is a community for creatives/self-employed individuals who want to make money of their passion.", "Money", "https://www.patreon.com/", "", ""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/5018372282") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_money);
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
