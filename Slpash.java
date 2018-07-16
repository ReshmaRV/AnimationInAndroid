package hotelapp.syntaxsoft.com.hotelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class Slpash extends AppCompatActivity {
    Animation animBlink,animzoomIn,animFadein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slpash);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        animzoomIn= AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_in);
        animFadein= AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        ((TextView)findViewById(R.id.textView)).setVisibility(View.VISIBLE);
        ((TextView)findViewById(R.id.textView)).startAnimation(animFadein);

       ((ImageView)findViewById(R.id.imgview1)).startAnimation(animFadein);

    }
}
