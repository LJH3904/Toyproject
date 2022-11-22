package org.techtown.toyproject_championselector;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.media.AudioManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_kih extends AppCompatActivity {
Button btn_play;
Button btn_stop;

MediaPlayer mediaPlayer;

//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        if(mediaPlayer != null){
//            mediaPlayer.release();
//            mediaPlayer = null;
//
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kih);
        
        ListView listView = findViewById(R.id.listView);
        List<String> list = new ArrayList<>();
        list.add("그럴수도 있긴해");
        list.add("네~!");
        list.add("당했다 ..");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list){
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView tv = (TextView)view.findViewById(android.R.id.text1);
                tv.setTextColor(Color.GRAY);
                return view;
            }
        };
        listView.setAdapter(adapter);


            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    if (position == 0) {
                        mediaPlayer =
                                MediaPlayer.create(MainActivity_kih.this, R.raw.kih_1);
                        mediaPlayer.start();
                        //그럴수도 있긴해
                    }
                    if (position == 1) {
                        mediaPlayer = MediaPlayer.create(MainActivity_kih.this, R.raw.kih_2);
                        mediaPlayer.start();
                        //네 !~
                    }
                    if (position == 2) {
                        mediaPlayer = MediaPlayer.create(MainActivity_kih.this, R.raw.kih_3);
                        mediaPlayer.start();
                        //아 협박까지 당했다 ..
                    }
                }
            });


    }
}