package com.example.widgetdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner spinner = findViewById(R.id.colo_spinner);
        Button btn  = findViewById(R.id.btn);
       final CheckBox checkbox = findViewById(R.id.check_conditions);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "the selected item :" + spinner.getSelectedItem(), Toast.LENGTH_SHORT).show();


                if (checkbox.isChecked()){
                    Log.i("spinner","conditions accepted");
                }
                else{
                    Log.i("spinner","conditions must be accepted");
                }

            }
        });
//        RadioGroup radiogroup = findViewById(R.id.radio_group);
//        int id = radiogroup.getCheckedRadioButtonId();
       // Log.i("idradio","itemchecked" + id);




    }

    public void itemchecked(View view){
        RadioGroup radiogroup = findViewById(R.id.radio_group);
        int id = view.getId();
        Log.i("idradio","itemchecked" + id);
        Log.i("test","just for test");
        switch(id){
            case R.id.yellow:
                Toast.makeText(this, "yellow", Toast.LENGTH_SHORT).show();;
                break;
            case R.id.blue:
                Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();;
                break;
            case R.id.black:
                Toast.makeText(this, "Black", Toast.LENGTH_SHORT).show();;
                break;
            case R.id.green:
                Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();;
                break;
        }
    }
}
