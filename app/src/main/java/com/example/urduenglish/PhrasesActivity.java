package com.example.urduenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
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

        words.add(new Word("what is your name?", "آپ کا نام کیا ہے؟", R.raw.what_is_your_name));
        words.add(new Word("what are you doing?", "تم کیا کر رہے ہو؟", R.raw.what_are_you_doing));
        words.add(new Word("where are you going?", "آپ کہاں جا رہے ہیں؟", R.raw.where));
        words.add(new Word("my name is..", "میرا نام ہے..", R.raw.myname));
        words.add(new Word("how are you feeling?", "آپ کیسا محسوس کر رہے ہیں؟",R.raw.feeling));
        words.add(new Word("i'm feeling good.", "میں اچھا محسوس کر رہا ہوں.", R.raw.feelinggood));
        words.add(new Word("are you coming?", "کیا آپ آ رہے ہو؟", R.raw.coming));
        words.add(new Word("yes, i am coming.", "ہاں، میں آ رہا ہوں۔", R.raw.yescoming));
        words.add(new Word("you play circket?", "تم کرکٹ کھیلتے ہو؟", R.raw.playcircket));


        WordAdapter Adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudtioResource());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mComplitionListener);
                //Toast.makeText(FamilyActivity.this, "List Item Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void releaseMediaPlayer(){
        if(mMediaPlayer!=null){
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}