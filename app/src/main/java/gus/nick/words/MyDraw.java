package gus.nick.words;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by User on 01.07.2017.
 */

class MyDraw extends SurfaceView implements SurfaceHolder.Callback, SensorEventListener
{

    public MyDraw(Context context) {
        super(context);
        getHolder().addCallback(this);

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }
    int r = 0;
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        Thread thread = new Thread(){
            public void run(){
                while (true) {
                    Canvas canvas = getHolder().lockCanvas();
                    if (canvas != null) {
                        canvas.drawColor(Color.YELLOW);
                        if (r == 1) {
                            paint.setColor(Color.RED);

                            canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, Math.min(canvas.getHeight() / 2, canvas.getWidth() / 2), paint);
                        }
                        getHolder().unlockCanvasAndPost(canvas);
                    }
                    if (r == 0){r = 1;}
                    else {r = 0;}
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

    }
    Paint paint = new Paint();


    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
    }



    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
