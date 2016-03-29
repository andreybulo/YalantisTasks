package com.example.andrew.simpleactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
//[Comment] Bad design. Use recycler view. Bad colors. Scrollview should be match parent
public class MyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(ImageLoaderConfiguration.createDefault(this));
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageLoader.displayImage("http://i68.tinypic.com/viiq68.jpg", imageView);
        imageLoader.displayImage("http://i67.tinypic.com/2h2juyu.jpg", imageView2); //[Comment] Hardcode
        imageLoader.displayImage("drawable://"+R.drawable.foto3, imageView3);
        imageLoader.displayImage("drawable://"+R.drawable.foto4, imageView4);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {

            Toast.makeText(getApplicationContext(), R.string.button_toast, Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


}
