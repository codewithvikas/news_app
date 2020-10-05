package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import data.NewsItem;

public class MainActivity extends AppCompatActivity {

    NewsListAdapter mNewsListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNewsListAdapter = new NewsListAdapter();
        RecyclerView newsRecyclerView = findViewById(R.id.news_list_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        newsRecyclerView.setLayoutManager(layoutManager);
        newsRecyclerView.setAdapter(mNewsListAdapter);
        loadNews();
    }

    private void loadNews(){
        mNewsListAdapter.setNewsItems(new ArrayList<NewsItem>());
    }
}