package org.akshanshgusain.walkinganimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   private ImageView mImageView;
   AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.anime_ImageView);
        if(mImageView==null) throw new AssertionError();

        animationDrawable =(AnimationDrawable)mImageView.getBackground();
        animationDrawable.start();

    }

}
