package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_about;
    Button button_start;
    TextView txt_start;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_about = (Button) findViewById(R.id.about_button);
        button_start = (Button) findViewById(R.id.start_button);
        image= (ImageView) findViewById(R.id.imageView3);
        txt_start = (TextView) findViewById(R.id.txt_animation);
        txt_start.setSelected(true);

        button_about.setOnClickListener(new Click());
        button_start.setOnClickListener(new Click());

    }

    public class Click implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.about_button:
                    Toast.makeText(getApplicationContext(), "You chose About the game", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, Main3Activity.class));
                    break;
                case R.id.start_button:
                    Toast.makeText(getApplicationContext(), "You chose START", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    break;
                default:

            }


        }
    }
}
