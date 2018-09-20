package com.example.sleepdebt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int weekday = 5;
        int weekend = 9;
        int optimalhours = 7*8;
        int actualHours = weekday*5;
        actualHours = actualHours + weekend * 2;
        int solution = optimalhours -actualHours;
        display(solution);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemsSelected(MenuItem item){
        int  id = item.getItemId();
        if(id == R.id.options){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void display(int i){
        TextView t =(TextView) findViewById(R.id.Display_Text_View);
        t.setText(""+i);
    }
}
