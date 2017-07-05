package gus.nick.words;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import static gus.nick.words.GameActivity.difficulty;
import static gus.nick.words.GameActivity.time;
import static gus.nick.words.GameActivity.timer_appear;


public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button back= (Button)findViewById(R.id.back);
        back.setOnClickListener((View.OnClickListener) this);
        CheckBox timer = (CheckBox)findViewById(R.id.timer);
        timer.setOnClickListener(checker);
        Button start= (Button)findViewById(R.id.start);
        start.setOnClickListener((View.OnClickListener) this);

        RadioButton sec20 = findViewById(R.id.radio_20);
        sec20.setOnClickListener(radio);

        RadioButton sec30 = findViewById(R.id.radio_30);
        sec30.setOnClickListener(radio);

        RadioButton sec40 = findViewById(R.id.radio_40);
        sec40.setOnClickListener(radio);

        RadioButton sec50 = findViewById(R.id.radio_50);
        sec50.setOnClickListener(radio);

        RadioButton dif1 = findViewById(R.id.radio_1);
        dif1.setOnClickListener(radio);
        RadioButton dif2= findViewById(R.id.radio_2);
        dif2.setOnClickListener(radio);
        RadioButton dif3= findViewById(R.id.radio_3);
        dif3.setOnClickListener(radio);
    }
    CompoundButton.OnCheckedChangeListener checker = new CompoundButton.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) timer_appear = true;
            else timer_appear = false;
        }
    };
    View.OnClickListener radio = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.radio_20:
                    time = 20;
                case R.id.radio_30:
                    time = 30;
                case R.id.radio_40:
                    time = 40;
                case R.id.radio_50:
                    time = 20;
                case R.id.radio_1:
                    difficulty = 1;
                case R.id.radio_2:
                    difficulty = 2;
                case R.id.radio_3:
                    difficulty = 3;

            }
        }
    };
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start:
                Intent intent = new Intent(SettingsActivity.this, SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.back:
                intent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
