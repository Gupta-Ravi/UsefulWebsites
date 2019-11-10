package com.useful_websites;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class ToolsActivity extends AppCompatActivity {

    cardClass[] detailsArray = new cardClass[]{
            new cardClass("Zamzar", "Want to convert one file format to another ? With over 1,200 file support Zamzar is for you. No sing-up required. Upload your file choose the format and you are good to go.","Tools","https://www.zamzar.com","",""),

            new cardClass("PrivNote", "PrivNote.com lets you send a text note to anyone using email, MS or chat and you can set the note to be deleted as soon as it gets read. You can even choose to have the note destroy after a specific time.","Tools","https://privnote.com","",""),

            new cardClass("Printfriendly", "Get a modifiable, printable page of any webpage in a few seconds. Just paste the url in the website. Printfriendly also offer free extensions for Firefox, Chrome, Internet Explorer and Safari.","Tools","https://www.printfriendly.com","",""),

            new cardClass("Disposablewebpage", "As the name suggests, Disposablewebpage.com lets you create a page without any coding. You are good to go after a simple sign-up. The webpage and all its content will be automatically deleted after 90 days.","Tools","https://disposablewebpage.com","",""),

            new cardClass("AccountKiller", "Deleting a social media accounts is a tricky process with hoops of questions and steps. AccountKiller.com shows you a guided steps as to how to delete your account. Clicking on a website name opens up a page with details and direct links for deactivation and deletion as well handy tips regarding what to keep in mind while closing the account.","Tools","https://www.accountkiller.com","",""),

            new cardClass("Smallpdf", "Pdfunlock.com is super helpful if you want to make changes to a protected PDF. Once you enter the password, you will get an unprotected PDF to download. The service is free -if you find it useful, you can donate a little via PayPal.","Tools","https://smallpdf.com","",""),

            new cardClass("ManualsLib", "ManualsLib.com is a free repository for product manuals across devices categories. Simply type the name of the product and get the manual to read and download.","Tools","https://www.manualslib.com/","",""),

            new cardClass("BugMeNot", "Enter the URL of the site you need a login for, and see if someone else already shared their login credentials, saving you an account registration.","Tools", "http://bugmenot.com/","",""),

            new cardClass("ReviewMeta", "ReviewMeta.com is a free web tool that analyzes millions of reviews and helps you decide which ones to trust. Simply copy and paste any Amazon product URL into the search bar on ReviewMeta.com for a full analysis.","Tools", "https://reviewmeta.com","",""),

            new cardClass("Invoice Generator", "Make attractive, professional invoices in a single click with the invoice generator trusted by millions of people.","Tools", "https://invoice-generator.com/","",""),

            new cardClass("Product Hunt", "Product Hunt is the best product directory. Every day, new products launch, and you can upvote them or leave comments for the founders.","Tools", "https://www.producthunt.com/","",""),

            new cardClass("StackExchange", "Stack Exchange is a network of question-and-answer websites on topics in diverse fields, each site covering a specific topic.","Tools", "https://stackexchange.com","",""),

            new cardClass("Kisspng", "Search for more than one million PNG images absolutely free. This website provides free high definition images without the background with unlimited downloads.","Tools", "https://www.kisspng.com/","",""),

            new cardClass("Mega", "15GB of Google Drive is less for you ? Then get 50GB of free storage by creating an account on this website.","Tools", "https://mega.nz/","",""),

            new cardClass("Diff Checker", "Compare two pieces of text and check if the document has been changed by someone.","Tools", "https://www.diffchecker.com/","",""),

            new cardClass("Dictation.io", "Dictation.io accurately transcribes speech to text in real time. It allows you to add smileys, paragraphs and even punctuations using the voice commands!","Tools", "https://dictation.io/","",""),

            new cardClass("Pdf Escape", "Edit a PDF or a PDF form online without using Adobe Acrobat or any other software. Did we mention that it’s free?","Tools", "http://www.pdfescape.com/","",""),

            new cardClass("Slide.ly", "It is the only digital video service that provides you with premium video footages, licensed music, and amazing copy to create instant promotional videos at affordable prices.","Tools", "https://slide.ly/","",""),

            new cardClass("Get Notify", "This website tracks whether the emails sent by you were opened and read by the receiver. Moreover, it also provides the recipient’s IP Address, location, browser details, and more.","Tools", "http://www.getnotify.com/","",""),

            new cardClass("Livestream", "Livestream allows you to watch and broadcast events live to viewers on any platform.","Tools", "https://new.livestream.com/","",""),

            new cardClass("scr.im", "scr.im converts your email address into a short custom URLs, so that you can share your e-mail id without worrying about spam.","Tools", "http://scr.im/","",""),

            new cardClass("Tiny Eye", "TinEye is a Reverse Image search tool which is as accurate as Google’s Reverse Image search tool.","Tools", "https://www.tineye.com/","",""),

            new cardClass("Boxoh", "Boxoh can track the status of any shipment package on Google Maps.","Tools", "http://www.boxoh.com/","",""),

            new cardClass("Pic Monkey", "PicMonkey is an online Image editor, that allows you to touch up your images. You can apply different effects, fonts, and designs to your images.","Tools", "http://www.picmonkey.com/","",""),

            new cardClass("Short Reckonings", "Short Reckonings is an online tool to keep track of shared expenses.A clean, ad-free interface adds to the charm of this simple website.","Tools", "http://www.shortreckonings.com/sr#mysheets","",""),

            new cardClass("Google Fonts", "The best collection of open source fonts that you can use anywhere without restrictions.","Tools", "https://fonts.google.com/","",""),

            new cardClass("Instructables", "Instructables provides instructions to help you build just about anything you can imagine.","Tools", "https://www.instructables.com/","",""),

            new cardClass("join.me", "join.me provides an online platform to share desktop screens. Record audio for meetings with participants not in the same room.It is a simple tool to share your screen with just about anybody on the web.","Tools", "https://www.join.me/","",""),

            new cardClass("Sync", "Sync.in allows multiple people to edit documents and notes in real time.","Tools", "http://sync.in/","",""),

            new cardClass("Scribble Maps", "Want to write some notes on a Map ? Even though Google Maps does not allow that, ScribbleMaps does, and it does a great job at it.","Tools", "http://scribblemaps.com/","",""),

            new cardClass("Autodraw", "Create freehand doodles and watch them magically transform into beautiful drawings powered by maching learning.","Tools", "https://www.autodraw.com/","",""),

            new cardClass("Screenshot Guru", "Take high-resolution screenshots of web pages on mobile and desktops.","Tools", "https://screenshot.guru/","",""),

            new cardClass("Reverse Photo", "Image search made easy with Reverse Photo. Upload an image and find similar pictures on the web.","Tools", "https://reverse.photos/","",""),

            new cardClass("Copy Char", "Copy special characters and emojis that aren’t on your keyboard.","Tools", "http://copychar.cc/","",""),

            new cardClass("Font Construct", "Draw and build your own fonts and use them in any application.","Tools", "https://fontstruct.com/","",""),

            new cardClass("IconFinder", "Millions of icons for all kinds of projects. Also try icons8.com and flaticon.com.","Tools", "http://www.iconfinder.com/","",""),

            new cardClass("Jotti", "Jotti's malware scan is a free service that lets you scan suspicious files with several anti-virus programs.","Tools", "https://virusscan.jotti.org/en","",""),

            new cardClass("Wolframalpha", "Solve any type of Math problems here.","Tools", "https://www.wolframalpha.com","",""),

            new cardClass("Flightstats", "Track flight status at airports worldwide.","Tools", "https://www.flightstats.com/v2/","",""),

            new cardClass("Random", "True randomness is bit difficult therefore Random.org Pick random numbers, flip coins, and more.","Tools", "http://www.random.org/","",""),

            new cardClass("Egg Timer", "A simple online timer.","Tools", "http://e.ggtimer.com/","",""),

            new cardClass("My Fonts", "Upload an image of any text and quickly determine the font family.","Tools", "http://new.myfonts.com/WhatTheFont/","",""),

            new cardClass("Calligraphr", "Transform your handwriting into a real font.","Tools", "https://www.calligraphr.com/en/","",""),

            new cardClass("Remotedesktop", "Access your friends computers or allow them to remote access your computer over the Internet.","Tools", "https://remotedesktop.google.com","",""),

            new cardClass("Home Styler", "Design from scratch or re-model your home in 3D.","Tools", "https://www.homestyler.com/int/","",""),

            new cardClass("Draw.io", "Create diagrams, wireframe and flowcharts in the browser.","Tools", "https://www.draw.io/","",""),

            new cardClass("Skype", "Make voice and video calls in your browser with Skype( You need to have a Microsoft account).","Tools", "https://web.skype.com/","",""),

            new cardClass("Online OCR", "Recognize text from scanned PDFs","Tools", "http://www.onlineocr.net/","",""),

            new cardClass("Wetransfer", "Share BIG files online","Tools", "https://www.wetransfer.com/","",""),

            new cardClass("File Pizza", "Peer to peer file transfer over WebRTC without any middleman.","Tools", "https://file.pizza/","",""),

            new cardClass("Snap drop", "Share files directly between devices in the same network without having to upload them to any server first.","Tools", "https://onedoes.github.io/snapdrop/","",""),

            new cardClass("100 Zeros", "Download free Kindle books from here.","Tools", "http://hundredzeros.com/","",""),

            new cardClass("Note Flight", "Print music sheets, write your own music online","Tools", "http://www.noteflight.com/","",""),

            new cardClass("Similar Sites", "Discover new sites that are similar to what you like already.","Tools", "https://www.similarsites.com/","",""),

            new cardClass("Canva", "Make beautiful graphics, presentations, resumes and more with readymade template designs.","Tools", "https://canva.com/","",""),

            new cardClass("Midomi", "Liking a song but not knowing the title, or any of the lyrics can be frustrating if you'd like to listen to it again. One site that exists to help you with this is Midomi.","Tools", "https://beta.midomi.com/","",""),

            new cardClass("Squoosh", "Compress images on the fly. Site works offline as well.","Tools", "https://squoosh.app/","",""),

            new cardClass("Gtmetrix", "The perfect tool for measuring your site performance online.","Tools", "http://gtmetrix.com/","",""),

            new cardClass("Urban Dictionary", "Online Dictionary","Tools", "https://www.urbandictionary.com/","",""),

            new cardClass("Built With", "Build lists of websites from over 35212+ web technologies. Filter by location, traffic, vertical and more.","Tools", "https://builtwith.com/","",""),

            new cardClass("SeatGuru", "consult this website before booking a seat for your Flight.","Tools", "https://www.seatguru.com/","",""),

            new cardClass("Typing", "Improve your typing skills with this tool","Tools", "https://www.typing.com/","",""),

            new cardClass("Tall Tweets", "Tall Tweets turns your Google Slides into GIF and Tweets.","Tools", "https://talltweets.com/","",""),

            new cardClass("Namechk", "Search for your desired USERNAME across different platform.","Tools", "https://namechk.com/","",""),

            new cardClass("PowToon", "Create engaging whiteboard videos and animation with your own voice over.","Tools", "https://www.powtoon.com","",""),

            new cardClass("Clyp", "Online platform for creators to share thier Audio","Tools", "https://clyp.it/","",""),

            new cardClass("Carrd", "Build a fully responsive one-page website that look good on every screen.","Tools", "https://carrd.co/","",""),

            new cardClass("Adobe Spark", "Make stunning videos amd presentations with voice narration for free.","Tools", "https://spark.adobe.com/home/","",""),

            new cardClass("Anchor.fm", "The easiest way to record a podcast that you can distribute on any platform without paying for Hosting.","Tools", "https://anchor.fm/","",""),

            new cardClass("Infogram", "make data-driven graphics, charts and infographics.","Tools", "https://infogram.com/","",""),

            new cardClass("Biteable", "make marketing videos and branded stories for Instagram, Facebook and YouTube trailers.","Tools", "https://biteable.com/","",""),

            new cardClass("Html Mail", "Send rich-text emails with gmail mail merge.","Tools", "https://htmlmail.pro/","",""),

            new cardClass("Wirecutter", "Whether you need a Juicer or a Headphone, this is the best product recommendation website on the Internet.","Tools", "https://thewirecutter.com/","",""),

            new cardClass("CamelCamelCamel", "Track prices of of thousands of products on Amazon, setup price alerts for price drop, see price history of a product and many more.","Tools", "https://camelcamelcamel.com/","",""),

            new cardClass("Mockaroo", "Download mock data to fill the rows in your Excel spreadsheet.","Tools", "https://mockaroo.com/","",""),

            new cardClass("Asciiflow", "A WYSIWYG editor to draw ASCII diagrams that you can embed in emails and tweets.","Tools", "http://asciiflow.com/","",""),

            new cardClass("Sway", "Create and share interactive reports, newsletters, presentations in minutes.","Tools", "https://www.sway.com/","",""),

            new cardClass("Apify", "The perfect web scraping tool that lets you extract data from nearly any website.","Tools", "https://www.apify.com/","",""),

            new cardClass("Alexa", "Get access to some of the best tools from the SEO perspective and rank websites according to their traffic","Tools", "https://www.alexa.com/","",""),

            new cardClass("Alternative To", "AlternativeTo comes in handy when you wish to find out alternatives to the software and apps that you already know of.","Tools", "https://alternativeto.net/","",""),

            new cardClass("Cheatography", "Build your very own cheat sheet or share one from this huge repository of cheatsheets known as Cheatography.","Tools", "https://www.cheatography.com/","",""),

            new cardClass("Clip Convert", "Free online media recorder application which allows you to record and convert nearly any audio or video URL ( YouTube, VeOh) to common formats.","Tools", "http://www.clipconverter.cc/","",""),
    };

    private ListView mListView;
    private cardAdapter mAdapter;
    private InterstitialAd mInterAd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        MobileAds.initialize(this,"ca-app-pub-5159801479844134~9147349243");
        mInterAd = new InterstitialAd(this) ;
        mInterAd.setAdUnitId("ca-app-pub-5159801479844134/4754099665") ;
        mInterAd.loadAd(new AdRequest.Builder().build()) ;

        mListView = findViewById(R.id.list_for_tools);
        mAdapter = new cardAdapter(getApplicationContext(), R.layout.card_layout, detailsArray);

        if (mListView != null) {
            mListView.setAdapter(mAdapter);
        }

    }// on create
    @Override
    public void onBackPressed(){
        mInterAd.show();
        super.onBackPressed();
    }
} //activity
