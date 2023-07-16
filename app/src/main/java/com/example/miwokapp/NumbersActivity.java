package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Saven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        words.add("Five");
        words.add("Six");
        words.add("Saven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

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