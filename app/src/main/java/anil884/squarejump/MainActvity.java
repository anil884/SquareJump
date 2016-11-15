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
        System.out.println("Coming Here2");
        ImageView sq= (ImageView)findViewById(R.id.imageView);
        /*Animation sqjump =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.sjump);*/
        ObjectAnimator up = ObjectAnimator.ofFloat(sq, "translationY",0f, -500.0f, 0f);
        //up.setFillAfter(true);
        //up.setInterpolator(new BounceInterpolator());
        up.setDuration(1500);
        up.start();
        //up.setRepeatMode(2);
        //sq.startAnimation(up);
        /*
        Animation down = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, -3.0f, Animation.RELATIVE_TO_SELF, 0.0f
        );
        down.setFillAfter(true);
        down.setDuration(1000);

        sq.startAnimation(down);*/
    }
}
