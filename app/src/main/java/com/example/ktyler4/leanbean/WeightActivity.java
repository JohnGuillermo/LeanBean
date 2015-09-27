package com.example.ktyler4.leanbean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class WeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
    }

    public void buttonOnClick(View v) {
        switch(v.getId())
        {
            case R.id.btnProfile:
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                break;
            case R.id.btnWeight:
                startActivity(new Intent(getApplicationContext(), WeightActivity.class));
                break;
            case R.id.btnFood:
                startActivity(new Intent(getApplicationContext(), FoodActivity.class));
                break;
            case R.id.btnExercise:
                startActivity(new Intent(getApplicationContext(), ExerciseActivity.class));
                break;
            case R.id.btnProgress:
                startActivity(new Intent(getApplicationContext(), ProgressActivity.class));
                break;
            case R.id.btnCredit:
                startActivity(new Intent(getApplicationContext(), CreditActivity.class));
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_weight, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
