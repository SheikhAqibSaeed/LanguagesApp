package com.example.urduenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mComplitionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One",  "ایک",R.drawable.number_one, R.raw.one));
        words.add(new Word("Two", "دو",R.drawable.number_two,R.raw.two));
        words.add(new Word("Three", "تین",R.drawable.number_three, R.raw.three));
        words.add(new Word("Four", "چار",R.drawable.number_four, R.raw.four));
        words.add(new Word("Five", "پانچ",R.drawable.number_five, R.raw.five));
        words.add(new Word("Six", "چھ",R.drawable.number_six, R.raw.six));
        words.add(new Word("Seven", "سات",R.drawable.number_seven, R.raw.seven));
        words.add(new Word("Eight", "آٹھ",R.drawable.number_eight, R.raw.eight));
        words.add(new Word("Nine", "نو",R.drawable.number_nine, R.raw.nine));
        words.add(new Word("Ten", "دس",R.drawable.number_ten, R.raw.ten));


        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        WordAdapter Adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudtioResource());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mComplitionListener);
//                Toast.makeText(NumbersActivity.this, "List Item Clicked", Toast.LENGTH_SHORT).show();
            }
        });

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

    @Override
    protected void onStop(){
        super.onStop();
        releaseMediaPlayer();
    }
    private void releaseMediaPlayer(){
        if(mMediaPlayer!=null){
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}