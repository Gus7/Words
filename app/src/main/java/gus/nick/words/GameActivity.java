package gus.nick.words;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {
    protected static int time;
    protected static int difficulty;
    protected static boolean timer_appear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyDraw(this));
    }
    /*<Chronometer
        android:id="@+id/chronometer"
        android:textSize="50dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true"
                />
        final Chronometer time = (Chronometer)findViewById(R.id.chronometer);

        time.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                long elapsedMillis = SystemClock.elapsedRealtime()
                        - time.getBase();

                if (elapsedMillis > 5000) {
                    String strElapsedMillis = "Прошло больше 5 секунд";
                    Toast.makeText(getApplicationContext(),
                            strElapsedMillis, Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
        public void onStartClick(View view) {
        mChronometer.setBase(SystemClock.elapsedRealtime());
        mChronometer.start();
    }

    public void onStopClick(View view) {
        mChronometer.stop();
    }

    public void onResetClick(View view) {
        mChronometer.setBase(SystemClock.elapsedRealtime());
    }
}   */
}
