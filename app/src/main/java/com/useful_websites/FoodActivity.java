package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class FoodActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("NTY Cooking", "NYT Cooking is the digital source for thousands of the best recipes from The New York Times along with how-to guides for home cooks at every skill level.","Food and Drinks", "http://cooking.nytimes.com/","",""),

            new cardClass("Epicurious", "Epicurious has been the ultimate food resource for the home cook, with daily kitchen tips, fun cooking videos, and, oh yeah, over 33000 recipes.","Food and Drinks", "http://www.epicurious.com/","",""),

            new cardClass("Oola", "Oola Provides you some good recipes along with productivity and day-to-day life tips.","Food and Drinks", "http://www.oola.com/","",""),

            new cardClass("Yummly", "The smart cooking sidekick that learns what you like and customizes the experience to your personal tastes, nutritional needs, skill level, and more.","Food and Drinks", "http://www.yummly.com/","",""),

            new cardClass("Food Republic", "Food Republic explores the culture of food through stories, interviews, global conversations, and experiences.","Food and Drinks", "http://www.foodrepublic.com/","",""),

            new cardClass("Jamie Oliver", "Explore this huge selection of delicious recipes that includes easy desserts, delicious vegan and vegetarian dinner ideas from very famous cook James Trevor Oliver","Food and Drinks", "http://www.jamieoliver.com/","",""),

            new cardClass("Taste Spotting", "TasteSpotting is a mouth-watering photo collection of recipes, cooking, baking, kitchen adventures, food industry and media news created by a community.","Food and Drinks", "http://www.tastespotting.com/","",""),

            new cardClass("Waiter on the Way", "Waiter on the Way is your premier food delivery service in Fort Wayne, IN.","Food and Drinks", "http://www.waiterontheway.biz/","",""),

            new cardClass("Food Gawker", "Foodgawker is an online platform that enables its users to search and share recipes, techniques, and ingredients with others.","Food and Drinks", "http://foodgawker.com/","",""),

            new cardClass("Le Pain Quotidien", "Le Pain Quotidien is a bakery-restaurant group founded in 1990 by Alain Coumont. It is an international chain of bakery-restaurants. It carries an array of baked goods and coffee drinks as well as a dine-in food menu.","Food and Drinks", "https://www.lepainquotidien.com/","",""),

            new cardClass("Food Print", "Curious how to make your favorite recipe in ways that are good for both your family and the planet? Food Print have the solution for your problem.","Food and Drinks", "https://foodprint.org/","",""),

            new cardClass("Perennial Plate", "Watch documentaries related to food.","Food and Drinks", "http://www.theperennialplate.com/","",""),

            new cardClass("Gluten-Free Mall", "Shop online for gluten-free foods. Gluten-Free Mall is a United States based online shoping company that ships worldwide. It provides gluten-free and wheat-free health foods.","Food and Drinks", "http://www.glutenfreemall.com/","",""),

            new cardClass("Matching Food & Wine", "Matching food and wine: The web's most comprehensive food and wine pairing resource with thousands of expert ideas and tips on food and wine pairing.","Food and Drinks", "https://www.matchingfoodandwine.com","",""),

            new cardClass("The Cook's Thesaurus", "The Cook's Thesaurus is a cooking encyclopedia that covers thousands of ingredients and kitchen tools.","Food and Drinks", "http://www.foodsubs.com/","",""),

            new cardClass("Antique Roman Dishes", "Antique Roman Dishes","Food and Drinks", "https://www.cs.cmu.edu/~mjw/recipes/ethnic/historical/ant-rom-coll.html","",""),

            new cardClass("Lowcarb-Recipes", "Get some Low carbohydrate recipes.","Food and Drinks", "http://www.lowcarbluxury.com/lowcarb-recipes.html","",""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/3210111372") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_food);
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
