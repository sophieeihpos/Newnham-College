package app.com.example.android.newnhamcollege;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap src = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.sidgwick_hall);
        int pixelvalue = src.getPixel(src.getWidth()/2, src.getHeight()/10);
        int r = Color.red(pixelvalue);
        int g = Color.green(pixelvalue);
        int b = Color.blue(pixelvalue);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
        scrollView.setBackgroundColor(Color.rgb(r,g,b));
    }
}
