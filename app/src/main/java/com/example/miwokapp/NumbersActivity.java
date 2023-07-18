package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One",  "ایک",R.drawable.number_one));
        words.add(new Word("Two", "دو",R.drawable.number_two));
        words.add(new Word("Three", "تین",R.drawable.number_three));
        words.add(new Word("Four", "چار",R.drawable.number_four));
        words.add(new Word("Five", "پانچ",R.drawable.number_five));
        words.add(new Word("Six", "چھ",R.drawable.number_six));
        words.add(new Word("Seven", "سات",R.drawable.number_seven));
        words.add(new Word("Eight", "آٹھ",R.drawable.number_eight));
        words.add(new Word("Nine", "نو",R.drawable.number_nine));
        words.add(new Word("Ten", "دس",R.drawable.number_ten));


        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        WordAdapter Adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

        //3rd method is best method
//        for (int index=0; index<words.size(); index++){
//            TextView wordsView1 = new TextView(this);
//            wordsView1.setText(words.get(index));
//            rootView.addView(wordsView1);
//        }

//        int index = 0;
//
//        // Executing for 2nd method
//        while (index<words.size()){
//            TextView wordsView1 = new TextView(this);
//            wordsView1.setText(words.get(index));
//            rootView.addView(wordsView1);
//            index++;
//        }
        // Executing for 1s method
//        TextView wordsView1 = new TextView(this);
//        wordsView1.setText(words.get(index));
//        rootView.addView(wordsView1);
//        index++;
//
//        TextView wordsView2 = new TextView(this);
//        wordsView2.setText(words.get(index));
//        rootView.addView(wordsView2);
//        index++;
//
//        TextView wordsView3 = new TextView(this);
//        wordsView3.setText(words.get(index));
//        rootView.addView(wordsView3);
//        index++;
    }
}