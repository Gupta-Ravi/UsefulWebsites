package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class NewsActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("Newsmap", "Get access to the latest and trending news headlines of the world on a single web page. You can switch off a particular category from appearing or drill down to country-specific news.\n" + "Larger the box the more the news is trending.","News", "https://newsmap-js.herokuapp.com","",""),

            new cardClass("Pocket", "Pocket, previously known as Read It Later, is an application and web service for managing a reading list of articles and videos from the Internet.","News", "https://getpocket.com","",""),

            new cardClass("Revue Discover", "Discover the best curated newsletters by influencers in a wide variety of spaces.","News", "https://discover.getrevue.co/","",""),

            new cardClass("Medium", "Medium taps into the brains of the world’s most insightful writers, thinkers, and storytellers to bring you the smartest takes on topics that matter.","News", "https://medium.com/","",""),

            new cardClass("Hacker News (HN)", "Hacker News is the really popular niche forum for developers, but they usually have a few interesting links to non-dev focused content.","News", "http://news.ycombinator.com/","",""),

            new cardClass("Snopes", "Snopes claims to be one of the first online fact-checking websites. It has been described as a \"well-regarded source for sorting out myths and rumors\" on the Internet.","News", "https://www.snopes.com/","",""),

            new cardClass("Google News", "Google News is a news aggregator and app developed by Google. It presents a continuous, customizable flow of articles organized from thousands of publishers and magazines.","News", "https://news.google.com/","",""),

            new cardClass("Yahoo News","Yahoo! News is a news website that originated as an internet-based news aggregator by Yahoo!.","News","http://news.yahoo.com/","",""),

            new cardClass("HuffPost", "HuffPost is an American news and opinion website and blog, with localized and international editions. It is edited from a left wing political perspective.","News", "http://www.huffingtonpost.com/","",""),

            new cardClass("AllSides", "AllSides dedicates itself to exposing bias news and providing multiple perspectives on issues. AllSides is itself a great place to get news, as it clearly labels each story as left-leaning, center, or right-leaning.","News", "http://www.allsides.com/","",""),

            new cardClass("AP News", "If you read a lot of news, you’ll see the AP credited all over the place. AP is a non-profit, has no corporate sponsorship, and is not government-funded.","News", "https://www.apnews.com/","",""),

            new cardClass("BBC", "The British Broadcasting Corporation is the largest broadcaster in the world. BBC has a history of over 90 years with a well-earned reputation for accurate, unbiased reporting.","News", "http://www.bbc.com/news","",""),

            new cardClass("C-SPAN", "The channel provides unbiased news coverage of the United States federal government, U.S. political events, and limited coverage from the governments of the U.K., Canada, and Australia.","News", "https://www.c-span.org/","",""),

            new cardClass("ProPublica", "Like the AP, ProPublica is a non-profit, non-government-funded news organization. It was the first online news organization to win a Pulitzer Prize.","News", "https://www.propublica.org/","",""),

            new cardClass("Reuters", "Like the AP, other news outlets often cite Reuters—and that’s largely because it has a long and solid reputation for good reporting. The organization is owned by Thomson Reuters. This gives it added resistance to corporate influence.","News", "http://www.reuters.com/news","",""),

            new cardClass("FAIR", "Another Interesting News Website.","News", "http://fair.org/","",""),

            new cardClass("Bloomberg", "Global financial data, news, and analytics.","News", "https://www.bloomberg.com/asia","",""),

            new cardClass("Feedly", "Feedly is a news aggregator application for various web browsers and mobile devices running iOS and Android.","News", "https://feedly.com/i/welcome","",""),

            new cardClass("Flipboard", "Flipboard curates the world's stories so you can focus on investing in yourself, staying informed, and getting involved.","News", "https://flipboard.com/","",""),

            new cardClass("Inoreader", "One place to keep up with all your information sources.","News", "https://www.inoreader.com/","",""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/8693344671") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_news);
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
