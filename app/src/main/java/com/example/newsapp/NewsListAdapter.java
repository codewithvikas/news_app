package com.example.newsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import data.NewsItem;

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsViewHolder> {

        ArrayList<NewsItem> mNewsItems;

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.news_list_item,parent,false);

        return new NewsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {

    }

    public void setNewsItems(ArrayList<NewsItem> newsItems){
        mNewsItems = newsItems;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return mNewsItems.size();
    }

     class NewsViewHolder extends RecyclerView.ViewHolder{

    public NewsViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    void bindView(NewsItem news){

    }
}
}
