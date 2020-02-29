package com.synnlabz.SyPad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import org.billthefarmer.mididriver.MidiDriver;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener , MidiDriver.OnMidiStartListener {

    private MidiDriver midiDriver;
    private byte[] event;
    private int[] config;
    private Button buttonPlayNote1 , buttonPlayNote2 , buttonPlayNote3 , buttonPlayNote4 , buttonPlayNote5 , buttonPlayNote6 , buttonPlayNote7 , buttonPlayNote8 , buttonPlayNote9 , buttonPlayNote10 , buttonPlayNote11 , buttonPlayNote12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlayNote1 = (Button)findViewById(R.id.buttonPlayNote1);
        buttonPlayNote1.setOnTouchListener(this);

        buttonPlayNote2 = (Button)findViewById(R.id.buttonPlayNote2);
        buttonPlayNote2.setOnTouchListener(this);

        buttonPlayNote3 = (Button)findViewById(R.id.buttonPlayNote3);
        buttonPlayNote3.setOnTouchListener(this);

        buttonPlayNote4 = (Button)findViewById(R.id.buttonPlayNote4);
        buttonPlayNote4.setOnTouchListener(this);

        buttonPlayNote5 = (Button)findViewById(R.id.buttonPlayNote5);
        buttonPlayNote5.setOnTouchListener(this);

        buttonPlayNote5 = (Button)findViewById(R.id.buttonPlayNote6);
        buttonPlayNote5.setOnTouchListener(this);

        buttonPlayNote7 = (Button)findViewById(R.id.buttonPlayNote7);
        buttonPlayNote7.setOnTouchListener(this);

        buttonPlayNote8 = (Button)findViewById(R.id.buttonPlayNote8);
        buttonPlayNote8.setOnTouchListener(this);

        buttonPlayNote9 = (Button)findViewById(R.id.buttonPlayNote9);
        buttonPlayNote9.setOnTouchListener(this);

        buttonPlayNote10 = (Button)findViewById(R.id.buttonPlayNote10);
        buttonPlayNote10.setOnTouchListener(this);

        buttonPlayNote11 = (Button)findViewById(R.id.buttonPlayNote11);
        buttonPlayNote11.setOnTouchListener(this);

        buttonPlayNote12 = (Button)findViewById(R.id.buttonPlayNote12);
        buttonPlayNote12.setOnTouchListener(this);

        midiDriver = new MidiDriver();

        midiDriver.setOnMidiStartListener(this);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(v.getId() == R.id.buttonPlayNote1){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote1();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote1();
            }

        }

        if(v.getId() == R.id.buttonPlayNote2){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote2();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote2();
            }

        }

        if(v.getId() == R.id.buttonPlayNote3){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote3();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote3();
            }

        }

        if(v.getId() == R.id.buttonPlayNote4){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote4();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote4();
            }

        }

        if(v.getId() == R.id.buttonPlayNote5){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote5();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote5();
            }

        }

        if(v.getId() == R.id.buttonPlayNote6){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote6();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote6();
            }

        }

        if(v.getId() == R.id.buttonPlayNote7){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote7();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote7();
            }

        }

        if(v.getId() == R.id.buttonPlayNote8){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote8();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote8();
            }

        }

        if(v.getId() == R.id.buttonPlayNote9){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote9();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote9();
            }

        }

        if(v.getId() == R.id.buttonPlayNote10){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote10();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote10();
            }

        }

        if(v.getId() == R.id.buttonPlayNote11){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote11();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote11();
            }

        }

        if(v.getId() == R.id.buttonPlayNote12){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                playNote12();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                stopNote12();
            }

        }

        return false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        midiDriver.start();
        midiDriver.config();
    }

    @Override
    protected void onPause() {
        super.onPause();
        midiDriver.stop();
    }

    @Override
    public void onMidiStart() {

    }

    private void playNote1(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x3A);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote1(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x3A);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote2(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x4A);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote2(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x4A);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote3(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x5A);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote3(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x5A);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote4(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x3B);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote4(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x3B);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote5(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x4B);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote5(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x4B);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote6(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x5B);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote6(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x5B);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote7(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x3C);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote7(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x3C);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote8(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x4C);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote8(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x4C);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote9(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x5C);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote9(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x5C);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote10(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x3D);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote10(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x3D);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote11(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x5D);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote11(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x5D);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void playNote12(){
        event = new byte[3];
        event[0] = (byte) (0x90 | 0x00);
        event[1] = (byte) (0x4D);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }

    private void stopNote12(){
        event = new byte[3];
        event[0] = (byte) (0x80 | 0x00);
        event[1] = (byte) (0x4D);
        event[2] = (byte) (0x7F);

        midiDriver.write(event);
    }


    //Designed & Developed by Synn~Labz

    //Contact us for more information

    //synnlabz@gmail.com


}
