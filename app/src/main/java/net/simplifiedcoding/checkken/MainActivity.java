package net.simplifiedcoding.checkken;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox Football, Tennis, Hockey, Cricket, Basketball;
    private Button button, clear;
    private TextView tev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Football = (CheckBox) findViewById(R.id.checkBox);
        Tennis = (CheckBox) findViewById(R.id.checkBox2);
        Hockey = (CheckBox) findViewById(R.id.checkBox3);
        Cricket = (CheckBox) findViewById(R.id.checkBox4);
        Basketball = (CheckBox) findViewById(R.id.checkBox5);
        button = (Button) findViewById(R.id.button);
        clear = (Button) findViewById(R.id.button2);
        tev = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tev.setText("");
                tev.setText("CODES: ");
                if (Football.isChecked()) {
                    tev.append("\n FB: Football");
                }
                if (Tennis.isChecked()) {
                    tev.append("\n TT: Table Tennis");
                }
                if (Basketball.isChecked()) {
                    tev.append("\n BB: Basketball");
                }
                if (Hockey.isChecked()) {
                    tev.append("\n HK: Hockey");
                }
                if (Cricket.isChecked()) {
                    tev.append("\n CK: Cricket");
                }
            }
        });

    }
}