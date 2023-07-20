package com.example.urduenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mComplitionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Black", "سیاہ",R.drawable.color_black, R.raw.black));
        words.add(new Word("White", "سفید",R.drawable.color_white,R.raw.white));
        words.add(new Word("Dusty Yellow", "دھوڑی پیلا",R.drawable.color_dusty_yellow, R.raw.dusty_yellow));
        words.add(new Word("Brown","براؤن",R.drawable.color_brown, R.raw.brwon));
        words.add(new Word("Mustard Yellow", "سرسوں پیلا",R.drawable.color_mustard_yellow, R.raw.musterd_yellow));
        words.add(new Word("Red", "سرخ",R.drawable.color_red, R.raw.red));
        words.add(new Word("Gray", "گرے",R.drawable.color_gray, R.raw.gray));
        words.add(new Word("Green", "سبز",R.drawable.color_green, R.raw.green));


        WordAdapter Adapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(ColorActivity.this, word.getAudtioResource());
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(mComplitionListener);
                //Toast.makeText(ColorActivity.this, "List Item Clicked", Toast.LENGTH_SHORT).show();
            }
        });
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