package anil884.squarejump;

import android.animation.ObjectAnimator;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.view.animation.Animation;




public class MainActvity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_actvity);

    }

    public void Jump(View view){
        //System.out.println("Coming Here2");
        ImageView sq= (ImageView)findViewById(R.id.imageView);

        ObjectAnimator jump = ObjectAnimator.ofFloat(sq, "translationY",0f, -500.0f, 0f);
        jump.setInterpolator(new BounceInterpolator());
        jump.setDuration(2000);
        jump.start();

    }
}
