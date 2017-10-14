package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class SpotActivity extends AppCompatActivity {

    int[] photoId = {R.drawable.photo00, R.drawable.photo01, R.drawable.photo02, R.drawable.photo03, R.drawable.photo04, R.drawable.photo05, R.drawable.photo06, R.drawable.photo07, R.drawable.photo08, R.drawable.photo09, R.drawable.photo10, R.drawable.photo11, R.drawable.photo12, R.drawable.photo13, R.drawable.photo14, R.drawable.photo15, R.drawable.photo16, R.drawable.photo17, R.drawable.photo18, R.drawable.photo19, R.drawable.photo20, R.drawable.photo21, R.drawable.photo22, R.drawable.photo23, R.drawable.photo24, R.drawable.photo25, R.drawable.photo26, R.drawable.photo27, R.drawable.photo28, R.drawable.photo29, R.drawable.photo30, R.drawable.photo31, R.drawable.photo32, R.drawable.photo33, R.drawable.photo34, R.drawable.photo35, R.drawable.photo36, R.drawable.photo37, R.drawable.photo38, R.drawable.photo39, R.drawable.photo40, R.drawable.photo41, R.drawable.photo42, R.drawable.photo43, R.drawable.photo44};
    int[] textId = {R.string.art0, R.string.art1, R.string.art2, R.string.art3, R.string.art4, R.string.art5, R.string.art6, R.string.art7, R.string.art8, R.string.art9, R.string.art10, R.string.art11, R.string.art12, R.string.art13, R.string.sport0, R.string.sport1, R.string.sport2, R.string.sport3, R.string.sport4, R.string.sport5, R.string.sport6, R.string.sport7, R.string.leisure0, R.string.leisure1, R.string.leisure2, R.string.leisure3, R.string.leisure4, R.string.leisure5, R.string.leisure6, R.string.leisure7, R.string.leisure8, R.string.leisure9, R.string.leisure10, R.string.eat0, R.string.eat1, R.string.eat2, R.string.eat3, R.string.eat4, R.string.eat5, R.string.eat6, R.string.eat7, R.string.eat8, R.string.eat9, R.string.eat10, R.string.eat11};
    int[] text2Id = {R.string.text_art0, R.string.text_art1, R.string.text_art2, R.string.text_art3, R.string.text_art4, R.string.text_art5, R.string.text_art6, R.string.text_art7, R.string.text_art8, R.string.text_art9, R.string.text_art10, R.string.text_art11, R.string.text_art12, R.string.text_art13, R.string.text_sport0, R.string.text_sport1, R.string.text_sport2, R.string.text_sport3, R.string.text_sport4, R.string.text_sport5, R.string.text_sport6, R.string.text_sport7, R.string.text_leisure0, R.string.text_leisure1, R.string.text_leisure2, R.string.text_leisure3, R.string.text_leisure4, R.string.text_leisure5, R.string.text_leisure6, R.string.text_leisure7, R.string.text_leisure8, R.string.text_leisure9, R.string.text_leisure10, R.string.text_eat0, R.string.text_eat1, R.string.text_eat2, R.string.text_eat3, R.string.text_eat4, R.string.text_eat5, R.string.text_eat6, R.string.text_eat7, R.string.text_eat8, R.string.text_eat9, R.string.text_eat10, R.string.text_eat11};

    //    I do three array to make a detailed detail of the option.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot);

        //     Charge the variable that I have transferred.

        Bundle data = this.getIntent().getExtras();
        int number = data.getInt("NUMBER");


        ImageView imageView = (ImageView) findViewById(R.id.image);
        TextView textView = (TextView) findViewById(R.id.text);
        TextView textView2 = (TextView) findViewById(R.id.text2);

        imageView.setImageResource(photoId[number]);
        textView.setText(textId[number]);
        textView2.setText(text2Id[number]);
    }

    public void back(View view) {
        finish();
    }
}

