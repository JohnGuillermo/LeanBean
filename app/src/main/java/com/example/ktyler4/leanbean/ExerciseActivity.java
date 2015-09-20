package com.example.ktyler4.leanbean;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity extends Activity {
    List<String> listCal=new ArrayList<String>();
    EditText txtCal;

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle("Test");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Spinner dynamicSpinner = (Spinner) findViewById(R.id.dynamic_spinner);
        txtCal=(EditText)findViewById(R.id.editTextCal);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View v = super.getView(position, convertView, parent);
                if (position == getCount()) {
                    ((TextView)v.findViewById(android.R.id.text1)).setText("");
                    ((TextView)v.findViewById(android.R.id.text1)).setHint(getItem(getCount())); //"Hint to be displayed"
                }

                return v;
            }

            @Override
            public int getCount() {
                return super.getCount()-1; // you dont display last item. It is used as hint.
            }

        };

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("Aerobics, High Imp");
        adapter.add("Aerobics, Low Imp");
        adapter.add("Aerobics, Water");
        adapter.add("Basketball");
        adapter.add("Bicycling");
        adapter.add("Hiking");
        adapter.add("Ice Skating");
        adapter.add("Running, 5mph");
        adapter.add("Running, 8mph");
        adapter.add("Skiing, cross-country");
        adapter.add("Skiing, downhill");
        adapter.add("Skiing, Water");
        adapter.add("Swimming, Moderate");
        adapter.add("Swimming, Vigorous");
        adapter.add("Tennis");
        adapter.add("Walking, 2mph");
        adapter.add("Walking, 3.5mph");
        adapter.add("Yoga");
        adapter.add("Other, Manual");
        adapter.add("SELECT EXERCISE"); //This is the text that will be displayed as hint.

        listCal.add("533");
        listCal.add("365");
        listCal.add("402");
        listCal.add("584");
        listCal.add("292");
        listCal.add("438");
        listCal.add("511");
        listCal.add("606");
        listCal.add("861");
        listCal.add("496");
        listCal.add("314");
        listCal.add("438");
        listCal.add("423");
        listCal.add("715");
        listCal.add("584");
        listCal.add("204");
        listCal.add("314");
        listCal.add("292");
        listCal.add("0");
        listCal.add("0");

        dynamicSpinner.setAdapter(adapter);
        dynamicSpinner.setSelection(adapter.getCount()); //set the hint the default selection so it appears on launch.
        //  dynamicSpinner.setOnItemSelectedListener(this);

        dynamicSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                String strCal=listCal.get(position).toString();
                txtCal.setText(strCal);
                Log.v("item", (String) parent.getItemAtPosition(position));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }
}
