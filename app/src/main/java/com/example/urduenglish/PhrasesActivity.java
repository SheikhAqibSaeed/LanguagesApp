package com.example.urduenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("what is your name?", "آپ کا نام کیا ہے؟"));
        words.add(new Word("what are you doing?", "تم کیا کر رہے ہو؟"));
        words.add(new Word("where are you going?", "آپ کہاں جا رہے ہیں؟"));
        words.add(new Word("my name is..", "میرا نام ہے.."));
        words.add(new Word("how are you feeling?", "آپ کیسا محسوس کر رہے ہیں؟"));
        words.add(new Word("i'm feeling good.", "میں اچھا محسوس کر رہا ہوں."));
        words.add(new Word("are you coming?", "کیا آپ آ رہے ہو؟"));
        words.add(new Word("yes, i am coming.", "ہاں، میں آ رہا ہوں۔"));
        words.add(new Word("you play circket?", "تم کرکٹ کھیلتے ہو؟"));


        WordAdapter Adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}