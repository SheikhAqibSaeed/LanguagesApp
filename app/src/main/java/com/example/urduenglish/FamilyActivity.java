package com.example.urduenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
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

        words.add(new Word("Father", "باپ",R.drawable.family_father, R.raw.father));
        words.add(new Word("Mother", "ماں",R.drawable.family_mother, R.raw.mother));
        words.add(new Word("Son", "بیٹا",R.drawable.family_son, R.raw.son));
        words.add(new Word("Daughter", "بیٹی",R.drawable.family_daughter, R.raw.daughter));
        words.add(new Word("GrandFather", "دادا جان",R.drawable.family_grandfather, R.raw.grandfather));
        words.add(new Word("GrandMother", "دادی",R.drawable.family_grandmother, R.raw.grandmother));
        words.add(new Word("Older Brother", "بڑا بھائی",R.drawable.family_older_brother, R.raw.olderbrother));
        words.add(new Word("Older Sister", "بڑی بہن",R.drawable.family_older_sister, R.raw.oldersister));
        words.add(new Word("Younger Sister", "چھوٹی بہن",R.drawable.family_younger_sister, R.raw.youngersister));
        words.add(new Word("Younger Brother", "چھوٹا بھائی",R.drawable.family_younger_brother, R.raw.youngerborther));


        WordAdapter Adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudtioResource());
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