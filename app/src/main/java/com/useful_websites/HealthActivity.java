package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class HealthActivity extends AppCompatActivity {
    cardClass[] detailsArray = new cardClass[]{
            new cardClass("Nutri Fit", "Whether you're looking for diet meals to help you lose weight or hearty, healthy meals for weight gain, NutriFit will create a plan specifically for you.","Health and Fitness", "https://www.nutrifitonline.com/","",""),

            new cardClass("National Institutes of Health", "The National Institutes of Health (NIH) is the largest source of medical research funding in the world and to compliment its operations it boasts one of the internet’s most popular health-care websites.","Health and Fitness", "http://www.nih.gov/","",""),

            new cardClass("KidsHealth", "Your source of accurate, reliable information about children's health.","Health and Fitness", "http://kidshealth.org/","",""),

            new cardClass("WebMD", "WebMD is an American corporation known primarily as an online publisher of news and information pertaining to human health and well-being.","Health and Fitness", "http://www.webmd.com/","",""),

            new cardClass("Drugs", "Drugs.com is the most popular, comprehensive and up-to-date source of drug information online","Health and Fitness", "http://www.drugs.com/","",""),

            new cardClass("Yahoo! Health", "A Health advisory website by Yahoo!. The main features of the website include a symptom checker, a ‘Find a Doctor’ tool and BMI calculator and the website also presents the latest news, articles and expert opinion.","Health and Fitness", "http://health.yahoo.net/","",""),

            new cardClass("Weight Watchers ", "Weight Watchers is a global company that offers various products and services to assist in healthy habits, including weight loss and maintenance, fitness, and mindset.","Health and Fitness", "http://www.weightwatchers.com/","",""),

            new cardClass("Net Doctor", "Net Doctor is a source for expert health tips, weight loss strategies, nutrition advice, and trusted information about medicines and health conditions.","Health and Fitness", "http://www.netdoctor.co.uk/","",""),

            new cardClass("Mayo Clinic", "The Mayo Clinic is a nonprofit academic medical center focused on integrated clinical practice, education, and research.","Health and Fitness", "http://www.mayoclinic.com/","",""),

            new cardClass("Men’s Health", "Men's Health is the brand men live by for fitness, nutrition, health, sex, style, grooming, tech, weight loss, and more.","Health and Fitness", "http://www.menshealth.com/","",""),

            new cardClass("American Cancer Society", "Dedicated to helping people who face cancer. Learn about cancer research, patient services, early detection, treatment and education at cancer.org.","Health and Fitness", "http://www.cancer.org/","",""),

            new cardClass("CDC", "The Centers for Disease Control and Prevention (CDC) is the leading national public health institute of the United States.","Health and Fitness", "http://www.cdc.gov/","",""),

            new cardClass("Department of Health and Human Services", "The United States Department of Health & Human Services, also known as the Health Department, is a cabinet-level department of the U.S. federal government with the goal of protecting the health of all Americans and providing essential human services.","Health and Fitness", "https://www.hhs.gov/","",""),

            new cardClass("Everyday Health", "Everyday Health inspires and empowers people to live their healthiest lives, every day, through trusted, medically reviewed information and expert health advice.","Health and Fitness", "http://www.everydayhealth.com/","",""),

            new cardClass("Healthline", "Healthline Media, Inc. is a privately owned provider of health information headquartered in San Francisco, CA","Health and Fitness", "http://www.healthline.com/","",""),

            new cardClass("Medilexicon", "Search over 200,000 medical terms, ICD-10 codes, hospitals, and more.","Health and Fitness", "http://www.medilexicon.com/","",""),

            new cardClass("MedicineNet", "MedicineNet is a medical website that provides detailed information about diseases, conditions, medications and general health.","Health and Fitness", "http://www.medicinenet.com/","",""),

            new cardClass("Medline plus", "Diseases, symptoms, injuries, and more with photographs and illustrations.","Health and Fitness", "https://medlineplus.gov/","",""),

            new cardClass("Merck Manuals", "The world's most widely-used medical guides, available online.","Health and Fitness", "http://www.merckmanuals.com/home","",""),

            new cardClass("RxList", "Medications and prescription drug information for consumers and medical health professionals. Online database of the most popular drugs and their side effects.","Health and Fitness", "http://www.rxlist.com/","",""),

            new cardClass("UpToDate", "UpToDate is a subscription-based resource designed to provide physicians access to current clinical information. It addresses specific clinical issues in the form of topic reviews.","Health and Fitness", "http://uptodate.com/","",""),

            new cardClass("WebMd", "The leading source for trustworthy and timely health and medical news and information. ","Health and Fitness", "http://www.webmd.com/","",""),

            new cardClass("care Dash", "Compare and review doctors and hospitals on the fastest growing healthcare search directory. ","Health and Fitness", "http://caredash.com/","",""),

            new cardClass("Castle Connoly", "Top doctors based on peer nomination and review by a physician-directed research team.","Health and Fitness", "http://www.castleconnolly.com/","",""),

            new cardClass("Health Grades", "Healthgrades is the leading online resource for comprehensive information about physicians and hospitals.","Health and Fitness", "http://healthgrades.com/","",""),

            new cardClass("Zocdoc", "Zocdoc is an online medical care appointment booking service, providing free of charge medical care search facility for end users by integrating information about medical practices and doctors' individual schedules in a central location.","Health and Fitness", "http://www.zocdoc.com/","",""),

            new cardClass("BioMed Central", "Provides open access to hundreds of peer-reviewed medical journals.","Health and Fitness", "http://www.biomedcentral.com/","",""),

            new cardClass("Free Medical Journals", "Site that promotes and links to free full-text medical journals and resources.","Health and Fitness", "http://www.freemedicaljournals.com/","",""),

            new cardClass("Girls Health", "Reliable, supportive health information for girls.","Health and Fitness", "http://girlshealth.gov/","",""),

            new cardClass("Partnership for Drug-Free Kids", "The Partnership for Drug-Free Kids, is a non-profit organization which runs campaigns to prevent teenage drug and alcohol abuse in the United States.","Health and Fitness", "http://www.drugfree.org/","",""),

            new cardClass("Pregnancy Birth and Baby", "Education and information for those experiencing pregnancy related issues.","Health and Fitness", "https://www.pregnancybirthbaby.org.au/","",""),

            new cardClass("Teen Health", "Honest information and advice about health, relationships, and growing up.","Health and Fitness", "http://www.kidshealth.org/teen","",""),

            new cardClass("The Loneliness Quiz", "Being lonely can lead to some serious health problems. To check how lonely(not alone) you are take The Loneliness Quiz.","Health and Fitness", "https://psychcentral.com/quizzes/loneliness-quiz/","",""),

            new cardClass("Fit Day", "Track your Health online. Here you can track your weight, blood pressure, and keep updated your data.","Health and Fitness", "https://www.fitday.com/","",""),

            new cardClass("Eat This Much", "Put your diet on autopilot.","Health and Fitness", "https://www.eatthismuch.com/","",""),

            new cardClass("Examine", "Nutrition and supplement info based on science","Health and Fitness", "https://www.examine.com/","",""),

            new cardClass("On The Regimen", "Fitness blog by Mike Vacanti.","Health and Fitness", "https://www.ontheregimen.com/","",""),
    };

    private ListView Listview;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/7117566794") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        Listview = findViewById(R.id.list_for_health);
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
