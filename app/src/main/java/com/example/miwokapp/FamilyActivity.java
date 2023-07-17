package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father", "باپ"));
        words.add(new Word("Mother", "ماں"));
        words.add(new Word("Son", "بیٹا"));
        words.add(new Word("Daughter", "بیٹی"));
        words.add(new Word("GrandFather", "دادا جان"));
        words.add(new Word("GrandMother", "دادی"));
        words.add(new Word("Older Brother", "بڑا بھائی"));
        words.add(new Word("Older Sister", "بڑی بہن"));
        words.add(new Word("Younger Sister", "چھوٹی بہن"));
        words.add(new Word("Younger Brother", "چھوٹا بھائی"));


        WordAdapter Adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}