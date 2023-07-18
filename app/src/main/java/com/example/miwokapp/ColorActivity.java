package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Black", "سیاہ",R.drawable.color_black));
        words.add(new Word("White", "سفید",R.drawable.color_white));
        words.add(new Word("Dusty Yellow", "دھوڑی پیلا",R.drawable.color_dusty_yellow));
        words.add(new Word("Brown","براؤن",R.drawable.color_brown));
        words.add(new Word("Mustard Yellow", "سرسوں پیلا",R.drawable.color_mustard_yellow));
        words.add(new Word("Red", "سرخ",R.drawable.color_red));
        words.add(new Word("Gray", "گرے",R.drawable.color_gray));
        words.add(new Word("Green", "سبز",R.drawable.color_green));


        WordAdapter Adapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}