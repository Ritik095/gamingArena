package com.example.gamingarena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SlideGamelv extends AppCompatActivity {
    TextView puzzle,easy,medium,hard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_gamelv);
        puzzle=(TextView)findViewById(R.id.puzzletv);
        easy=(TextView)findViewById(R.id.easytv);
        medium=(TextView)findViewById(R.id.mediumtv);
        hard=(TextView)findViewById(R.id.hardtv);
    }
    public void easylv(View v){
        startActivity(new Intent(SlideGamelv.this,SlideGame1.class));
    }

    public void mediumlv(View v){
        startActivity(new Intent(SlideGamelv.this,SlideGame2.class));
    }

    public void hardlv(View v){
        startActivity(new Intent(SlideGamelv.this,SlideGame3.class));
    }
}
