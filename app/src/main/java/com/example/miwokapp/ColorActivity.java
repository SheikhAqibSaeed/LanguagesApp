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

        words.add(new Word("Black", "سیاہ"));
        words.add(new Word("White", "سفید"));
        words.add(new Word("Yellow", "پیلا"));
        words.add(new Word("Blue", "نیلا"));
        words.add(new Word("Pink", "گلابی"));
        words.add(new Word("Red", "سرخ"));
        words.add(new Word("Sky Blue", "آسمانی رنگ"));
        words.add(new Word("Green", "سبز"));


        WordAdapter Adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}