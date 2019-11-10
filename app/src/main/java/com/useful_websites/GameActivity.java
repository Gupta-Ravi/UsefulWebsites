package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class GameActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("AirConsole", "AirConsole is an online video game console. Play over 130 multiplayer games. Your smartphones are the gamepads.","Games", "https://www.airconsole.com","",""),

            new cardClass("Ocean of Games", "Game Reviews and Download Games Free. Latest Games Features and Specifications.","Games", "http://oceanofgames.com/","",""),

            new cardClass("Fog", "Play the latest HTML5 games for free in your mobile browser without app store downloads. Play on any Android, iOS or Windows mobile device!","Games", "https://m.fog.com/","",""),

            new cardClass("Y8", "At Y8 Games, there are over 70000 games and videos available to play online.","Games", "https://www.y8.com/","",""),

            new cardClass("Addicting Games", "Play thousands of free online games: arcade games, puzzle games, funny games, sports games, shooting games, and more.","Games", "https://www.addictinggames.com/","",""),

            new cardClass("Armor Games", "Armor Games is a game portal website that hosts free Flash-based browser games across a wide variety of genres, including point-and-click adventure, arcade, puzzle, and MMO games.","Games", "https://armorgames.com/","",""),

            new cardClass("Space Is Key", "Stack different shapes with stability with Super Stacker","Games", "http://www.newcave.com/game/?id=3539","",""),

            new cardClass("Pass Me", "Don't drop the ball pass to other players.","Games", "http://osa.studio/passme/","",""),

            new cardClass("Geogee", "Test your knowledge of the world and learn along the way. Quiz modes include borders, trivia, flags, map shapes and populations.","Games", "https://geogee.me/","",""),

            new cardClass("Most Addicting", "Welcome to MostAddicting.com your home for the most addicting games you can find on the web.","Games", "http://www.mostaddicting.com","",""),

            new cardClass("Cursor 10", "Complete levels by failing in them and use your previous action to move to next level.","Games", "http://www.freewebarcade.com/game/cursor10/","",""),

            new cardClass("Down Is Up", "Work through different levels reaching the goal in reverse gravity mode.","Games", "http://www.digyourowngrave.com/down-is-up/","",""),

            new cardClass("The Dodge Game", "Dodge the red circles and touch the Blue square.","Games", "https://beedigital.net/coolgames/the-dodge-game/","",""),

            new cardClass("Impasse", "Anticipate the direction of the dot to reach the goal by avoiding everything around you.","Games", "https://www.bartbonte.com/portal/impasse.html","",""),

            new cardClass("Plume", "In an online advanture game help Plume to deliver a letter to Santa Clause.","Games", "https://plumegame.com/","",""),

            new cardClass("Gateway", "A logic Puzzle Game.","Games", "http://cockroach.se/gateway/","",""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/6447004021") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_game);
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
