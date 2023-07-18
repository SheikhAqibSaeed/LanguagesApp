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

        words.add(new Word("Father", "باپ",R.drawable.family_father));
        words.add(new Word("Mother", "ماں",R.drawable.family_mother));
        words.add(new Word("Son", "بیٹا",R.drawable.family_son));
        words.add(new Word("Daughter", "بیٹی",R.drawable.family_daughter));
        words.add(new Word("GrandFather", "دادا جان",R.drawable.family_grandfather));
        words.add(new Word("GrandMother", "دادی",R.drawable.family_grandmother));
        words.add(new Word("Older Brother", "بڑا بھائی",R.drawable.family_older_brother));
        words.add(new Word("Older Sister", "بڑی بہن",R.drawable.family_older_sister));
        words.add(new Word("Younger Sister", "چھوٹی بہن",R.drawable.family_younger_sister));
        words.add(new Word("Younger Brother", "چھوٹا بھائی",R.drawable.family_younger_brother));


        WordAdapter Adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}