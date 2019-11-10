package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class TravelActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("Padmapper", "Apartment hunting is SO much more fun with Padmapper, which features a massive map you can easily move around and filter listings based on normal criteria like max rent, location, etc.","Travel", "https://www.padmapper.com/","",""),

            new cardClass("student.com", "Student housing made easy.\n" + "Book your perfect home in 400 cities worldwide.","Travel", "https://www.student.com","",""),

            new cardClass("Sky Scanner", "This is a perfect website to find cheaper flights that even Google doesn't shows on its list. Apart from the flights it also shows cheaper hotels and friendly car to hire.","Travel", "https://www.skyscanner.com/","",""),

            new cardClass("Spot a Home", "This site has people check for the properties personally, has a virtual video tour as well as HD pictures of the properties. (Currently, available in almost 30 cities in Europe).","Travel", "https://www.spotahome.com/","",""),

            new cardClass("Uniplaces", "Another great website for students looking for affordable accommodations in Europe with a bigger list of cities and an even more helpful staff.","Travel", "https://www.uniplaces.com/","",""),

            new cardClass("Flight Stats", "Track any flight all over the world from anywhere. Just enter the flight number and get the real-time location or status of the flight!","Travel", "http://www.flightstats.com/","",""),

            new cardClass("Every Time Zone", "Calculating different time zones can be a headache most of the time. This site is a less confusing view of the world’s time zones with reference to yours.","Travel", "http://www.everytimezone.com/","",""),

            new cardClass("Trip it", "TripIt is a painless way to organize all the details of your vacation or business trip.","Travel", "https://www.tripit.com/","",""),

            new cardClass("Hostel Bookers", "Hostel Bookers is one of the best search engines to search for cheap hostels and hotels while backpacking or traveling around the globe.","Travel", "http://www.hostelbookers.com/","",""),

            new cardClass("Bing Travel", "Bing lets you compare tickets across more than a hundred sources. It also analyzes historical data to predict whether the price you see on the screen is likely to rise (or drop) in the coming week.","Travel", "http://www.bing.com/travel/","",""),

            new cardClass("AutoSlash", "Reserve a vehicle from a favorite agency through the AutoSlash site, and the site will instantly begin tracking rate changes for your reservation. If a sale pops up it automatically locks in the lower price on your behalf.","Travel", "http://www.autoslash.com/","",""),

            new cardClass("Fly or Drive Calculator", "Determine the cheapest way to reach your destination.","Productivity", "http://www.befrugal.com/tools/fly-or-drive-calculator/","",""),

            new cardClass("Hipmunk", "Find best flights, hotels, cars etc at cheap rates. Compare different prices. Plan your Travel.","Travel", "http://www.hipmunk.com/","",""),

            new cardClass("TripIt", "TripIt is the travel organizing app that auto-magically creates a master itinerary for every trip so you can access all your travel plans, anytime, on any device.","Travel", "http://www.tripit.com/","",""),

            new cardClass("Award Wallet", "Award Wallet helps you track frequent flyer miles and hotel points as well as book rewarded tickets.","Travel", "https://awardwallet.com","",""),

            new cardClass("Blurb", "Custom book publisher Blurb lets you design and print a soft-cover or hardcover travel photo album using impressive design tools and high-quality inks, paper, and binding.","Travel", "http://www.blurb.com/","",""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/6353471427") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_travel);
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
