package com.useful_websites;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CategoryListActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ListView listView;
//                       00              01              02           03           04       05       06          07           08       09        10
    String mTitle[] = {"Travel", "Health and Fitness", "News", "Food and Drinks","Money" ,"Tools", "Games", "Productivity", "Learn","Career","Hand Picks"};
    int images[] = {R.drawable.travel,R.drawable.health,R.drawable.news,R.drawable.food,R.drawable.money,R.drawable.tool,R.drawable.game,R.drawable.productivity,R.drawable.study,R.drawable.career,R.drawable.hand};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        Toolbar toolbar = findViewById(R.id.toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        /////////////////////////////////////////////////////////////
        listView = findViewById(R.id.categoryList);
        MyAdapter adapter = new MyAdapter(this, mTitle, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent I = new Intent(CategoryListActivity.this, TravelActivity.class);
                    startActivity(I);
                } else if (position == 5) {
                    Intent I = new Intent(CategoryListActivity.this, ToolsActivity.class);
                    startActivity(I);
                } else if (position == 7) {
                    Intent I = new Intent(CategoryListActivity.this, ProductivityActivity.class);
                    startActivity(I);
                } else if (position == 2) {
                    Intent I = new Intent(CategoryListActivity.this, NewsActivity.class);
                    startActivity(I);
                } else if (position == 8) {
                    Intent I = new Intent(CategoryListActivity.this, StudyActivity.class);
                    startActivity(I);
                } else if (position == 1) {
                    Intent I = new Intent(CategoryListActivity.this, HealthActivity.class);
                    startActivity(I);
                } else if (position == 3) {
                    Intent I = new Intent(CategoryListActivity.this, FoodActivity.class);
                    startActivity(I);
                } else if (position == 4) {
                    Intent I = new Intent(CategoryListActivity.this, MoneyActivity.class);
                    startActivity(I);
                } else if (position == 6) {
                    Intent I = new Intent(CategoryListActivity.this, GameActivity.class);
                    startActivity(I);
                } else if (position == 10) {
                    Intent I = new Intent(CategoryListActivity.this, HandActivity.class);
                    startActivity(I);
                } else if (position == 9) {
                    Intent I = new Intent(CategoryListActivity.this, CareerActivity.class);
                    startActivity(I);
                }

            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        int rImgs[];

        MyAdapter(Context c, String title[], int imgs[]) {
            super(c, R.layout.category_list_layout, R.id.maincate, title);
            this.context = c;
            this.rTitle = title;
            this.rImgs = imgs;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.category_list_layout, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.maincate);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            return row;
        }
    }
//////////////////////////////////////////////////////////////////////////////////
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.rate) {
            try{
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="+getPackageName() )));
            }
            catch (ActivityNotFoundException e)
            {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id="+getPackageName() )));
            }
        } else if (id == R.id.submit) {
            Intent I = new Intent(CategoryListActivity.this, SubmitWebsiteActivity.class);
            startActivity(I);
        } else if (id == R.id.share) {
            Intent share = new Intent() ;
            share.setAction(Intent.ACTION_SEND) ;
            share.putExtra(Intent.EXTRA_TEXT,"Check out this amazing app *Useful Websites* \nDownload it from here : https://play.google.com/store/apps/details?id="+getPackageName()) ;
            share.setType("text/plain") ;
            startActivity(Intent.createChooser(share,"share via"));
        } else if (id == R.id.about) {
            Intent I = new Intent(CategoryListActivity.this, AboutActivity.class);
            startActivity(I);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
