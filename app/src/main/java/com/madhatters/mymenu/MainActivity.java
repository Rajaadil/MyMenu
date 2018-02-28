package com.madhatters.mymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.file_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.about_item:
                Toast.makeText(MainActivity.this,"About US are comming soon",Toast.LENGTH_LONG).show();
                break;
            case R.id.setting_item:
                Toast.makeText(MainActivity.this,"Setting are comming soon",Toast.LENGTH_LONG).show();
                break;
            case R.id.Sort_item:
                Toast.makeText(MainActivity.this,"Sort are comming soon", Toast.LENGTH_LONG).show();
            case R.id.Galaxy_item:
                Toast.makeText(MainActivity.this,"Galaxy essential are comming soon", Toast.LENGTH_LONG).show();
            case R.id.Book_item:
                Toast.makeText(MainActivity.this,"Book item are comming soon", Toast.LENGTH_LONG).show();
            case R.id.Share_item:
                Toast.makeText(MainActivity.this,"Share are comming soon", Toast.LENGTH_LONG).show();
            case R.id.REcent_itemt:
                Toast.makeText(MainActivity.this,"Recent are comming soon", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
