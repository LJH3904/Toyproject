package org.techtown.roulette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class endactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endactivity);

        int[] images = new int[] {
                R.drawable.burgerking,
                R.drawable.gunaesikdang,
                R.drawable.haewall,
                R.drawable.china,
                R.drawable.myungga,
                R.drawable.sundae,
                R.drawable.donkachu,
                R.drawable.naemyun
        };
        String[] images_name = new String[]{
                "햄버거",
                "구내식당",
                "만두국",
                "중국음식",
                "명가",
                "순대국",
                "돈까스",
                "냉면"
        };
        TextView textView = findViewById(R.id.textView_end_result);

        Intent get_Intent = new Intent(this.getIntent()); // ResultActivity에서 Intent 객체 받아옴
        int i = get_Intent.getIntExtra("Result_imageId",1); // ResultActivity에서 putExtra 를 받아옴 기본값은 1로
        ImageView imageView_food = (ImageView) findViewById(R.id.imageView_end_result);
        imageView_food.setBackgroundResource(images[i]);
        textView.setText(images_name[i]);
    }
}