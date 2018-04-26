package com.thy.ex_instagram;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Feed> feeds = new ArrayList<>();

    RecyclerView recyclerView;
    FeedAdapter feedAdapter;
    GridFeedAdapter gridFeedAdapter;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        recyclerView = findViewById(R.id.recycler);
        feedAdapter = new FeedAdapter(this, feeds);
        recyclerView.setAdapter(feedAdapter);

        createListFeed();

        feedAdapter.notifyDataSetChanged();

        drawerLayout = findViewById(R.id.layout_drawer);
        navigationView = findViewById(R.id.nav);

        navigationView.setItemIconTintList(null);

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);

        drawerLayout.addDrawerListener(drawerToggle);

        drawerToggle.syncState();
    }

    public void createListFeed(){

        Feed feed = new Feed("androidprime",
                "Seoul, Korea",
                "http://imageshack.com/a/img924/3231/rv62A2.gif",
                "In this tutorial, I’m going to teach you how to use Android Context Menu and " +
                        "GridView. We’re going to creating a simple wallpaper application that " +
                        "will allow the users to choose and apply a wallpaper in our gallery.",
                "3 DAYS AGO", R.drawable.ch_luffy);
        feeds.add(0, feed);

        feed = new Feed("androidprime",
                "Seoul, Korea",
                "http://imageshack.com/a/img921/4021/wZaOP8.gif",
                "In this tutorial, I’m going to teach you how to use Android Context Menu and " +
                        "GridView. We’re going to creating a simple wallpaper application that " +
                        "will allow the users to choose and apply a wallpaper in our gallery.",
                "2 DAYS AGO", R.drawable.ch_chopa);
        feeds.add(0, feed);

        feed = new Feed("androidprime",
                "Seoul, Korea",
                "http://imageshack.com/a/img924/6593/aRddp8.gif",
                "In this tutorial, I’m going to teach you how to use Android Context Menu and " +
                        "GridView. We’re going to creating a simple wallpaper application that " +
                        "will allow the users to choose and apply a wallpaper in our gallery.",
                "1 DAYS AGO", R.drawable.ch_nami);
        feeds.add(0, feed);

        feed = new Feed("androidprime",
                "Seoul, Korea",
                "http://imageshack.com/a/img922/5727/EIRTCe.gif",
                "In this tutorial, I’m going to teach you how to use Android Context Menu and " +
                        "GridView. We’re going to creating a simple wallpaper application that " +
                        "will allow the users to choose and apply a wallpaper in our gallery.",
                "3 WEEkS AGO", R.drawable.ch_sandi);
        feeds.add(0, feed);

        feed = new Feed("androidprime",
                "Seoul, Korea",
                "http://imageshack.com/a/img923/9702/QbNuqq.gif",
                "In this tutorial, I’m going to teach you how to use Android Context Menu and " +
                        "GridView. We’re going to creating a simple wallpaper application that " +
                        "will allow the users to choose and apply a wallpaper in our gallery.",
                "2 WEEKS AGO", R.drawable.ch_usoup);
        feeds.add(0, feed);

        feed = new Feed("androidprime",
                "Seoul, Korea",
                "http://imageshack.com/a/img922/5038/2elaZ2.gif",
                "In this tutorial, I’m going to teach you how to use Android Context Menu and " +
                        "GridView. We’re going to creating a simple wallpaper application that " +
                        "will allow the users to choose and apply a wallpaper in our gallery.",
                "1 WEEKS AGO", R.drawable.ch_zoro);
        feeds.add(0, feed);
    }

    public void clickList(View v){
        //리사이클러뷰의 레이아웃매니져 설정
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(feedAdapter);
    }

    public void clickGrid(View v){
        //리사이클러뷰의 레이아웃매니져 설정
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        gridFeedAdapter = new GridFeedAdapter(this, feeds);
        recyclerView.setAdapter(gridFeedAdapter);
    }
}
