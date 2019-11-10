package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class HandActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("Internet Archive", "See the history of any website.", "Hand Pics", "https://archive.org/web/", "", ""),

            new cardClass("Bored Button", "Go ahead, and press the Bored Button.", "Hand Pics", "https://www.boredbutton.com", "", ""),

            new cardClass("Move Now Think Later", "Just wait and Listen.", "Hand Pics", "https://www.movenowthinklater.com", "", ""),

            new cardClass("Free Flashlight", "Free Online Flashlight is the best way to use your computer, phone, or laptop as a flashlight or light. The site have some other links such as Online Mirror, Online Notepad.", "Hand Pics", "https://www.freeonlineflashlight.com/", "", ""),

            new cardClass("Birthday Star", "Find a star in the Sky which is your age light years away.", "Hand Pics", "http://freeant.net/birthdaystar/", "", ""),

            new cardClass("Do Nothing for 2 Minutes", "Literally, Do Nothing for 2 Minutes.", "Hand Pics", "http://www.donothingfor2minutes.com/", "", ""),

            new cardClass("Mind the Minutes", "Wait a minute ! Yeah lets see if you can just wait exactly for a minute.", "Hand Pics", "https://toggle.com/time-perception-game/", "", ""),

            new cardClass("Movie Music Quiz", "Select the category and guess the name of the Movie or Video game.", "Hand Pics", "https://www.movie-music-quiz.com/", "", ""),

            new cardClass("What does one TRILLION dollars look like?", "Compare What does one TRILLION dollars look like to you.", "Hand Pics", "http://www.pagetutor.com/trillion/index.html", "", ""),

            new cardClass("Information is Beautiful", "A Trillions dollar chart showin what Trillions dollar means in the World.", "Hand Pics", "https://informationisbeautiful.net/visualizations/trillions-what-is-a-trillion-dollars/", "", ""),

            new cardClass("Morse code Trainer", "Heard of Morse code ? If you want to learn it this site is for you.", "Hand Pics", "https://morse.withgoogle.com/learn/", "", ""),

            new cardClass("Timeline Of Earth", "Walk through the timeline of Earth through a simple and Beautiful Website.", "Hand Pics", "http://timelineofearth.com", "", ""),

            new cardClass("Space is Cool", "Yeah ! that's pretty much it.", "Hand Pics", "http://www.spaceis.cool", "", ""),

            new cardClass("Tectonics.js", "Play with earth's projection.", "Hand Pics", "http://davidson16807.github.io/tectonics.js/", "", ""),

            new cardClass("Conserve the sound", "This website conserves the sound of old day to day electronic machines.", "Hand Pics", "https://www.conservethesound.de/", "", ""),

            new cardClass("History of the US Dollar Design", "A blog by Daniel Wesley.", "Hand Pics", "https://www.debtconsolidation.com/us-currency-design/", "", ""),

            new cardClass("Explore Your Inner Animals", "Ghosts of our ancestors are present in our bodies today.", "Hand Pics", "https://media.hhmi.org/biointeractive/click/explore-your-inner-animals/?_ga=2.177473253.1301542994.1518480581-699706204.1518480581", "", ""),

            new cardClass("Bellwoods", "Just Realx ... ! and listen to the music.", "Hand Pics", "https://bellwoods.xyz/", "", ""),

            new cardClass("SculptGL", "Create your own sculpture with this \"clay sculpture\" simulator.", "Hand Pics", "https://stephaneginier.com/sculptgl/", "", ""),

            new cardClass("LatLong", "Reverse geocoding is the process to convert the latitude and longitude coordinates to a readable address. Type the lat long coordinates and press Convert button.", "Hand Pics", "https://www.latlong.net/Show-Latitude-Longitude.html", "", ""),

            new cardClass("Under the Sun", "Get the position of the sun over the earth.", "Hand Pics", "http://projects.truth-and-beauty.net/under-the-sun/", "", ""),

            new cardClass("Keyboard", "Play musical nodes by hovering the mouse or by waving yor head.", "Hand Pics", "https://creatability.withgoogle.com/keyboard/", "", ""),

            new cardClass("This to That", "Attach this to that.", "Hand Pics", "https://www.thistothat.com/", "", ""),

            new cardClass("Destroy the WEB", "Destroy the WEB", "Hand Pics", "https://kickassapp.com/", "", ""),

            new cardClass("GIPHY", "Create and search GIFs.", "Hand Pics", "https://giphy.com/", "", ""),

            new cardClass("Img Flip", "For meme lovers.", "Hand Pics", "https://imgflip.com/", "", ""),

            new cardClass("Neal Fun", "A fun website by Neal Agarwal","Hand Pics", "https://neal.fun/","",""),

            new cardClass("Human Terrain", "Visualizing the world's population in 3D.","Hand Pics", "https://pudding.cool/2018/10/city_3d/","",""),

            new cardClass("Notable Women", "Notable Women is an AR Experiment that lets anyone see 100 historic American women where they've historically been left out: U.S. currency.","Hand Pics", "https://notablewomen.withgoogle.com","",""),

            new cardClass("Experiments with Google", "Here are collections of thousands of amazing experiments coders have created using Chrome, Android, AI, Web VR, AR and more.","Hand Pics", "https://experiments.withgoogle.com/","",""),

            new cardClass("The Oddly Satisfying Spa", "It combines oddly satisfying videos with the element of physical touch.","Hand Pics", "https://luxuryescapism.com","",""),

            new cardClass("Snap Bubbles", "Have you ever received a gift that came with bubble wrap and it was better than the gift itself?","Hand Pics", "http://www.snapbubbles.com/","",""),

            new cardClass("Kaleidoscope Painter", "Draw some symmetric drawings.","Hand Pics", "https://permadi.com/java/spaint/spaint.html","",""),

            new cardClass("Traffic Simulation", "Traffic Simulation.","Hand Pics", "http://www.traffic-simulation.de/","",""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand);
        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/4598186993") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_hand);
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
