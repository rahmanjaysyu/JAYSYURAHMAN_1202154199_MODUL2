package com.example.android.jaysyurahman_1202154199_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioPilihMenu);
        Toast.makeText(this,"JAYSYURAHMAN_1202154199",Toast.LENGTH_SHORT).show();
    }

    public void Submit(View view){
        int go = radioGroup.getCheckedRadioButtonId();
        switch (go){
            case R.id.takeaway:
                Toast.makeText(this,"Take Away",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,TakeAway.class)); break;
            case R.id.dinein:
                Toast.makeText(this,"Dine In",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,DineIn.class)); break;
            default:break;
        }
    }
}
