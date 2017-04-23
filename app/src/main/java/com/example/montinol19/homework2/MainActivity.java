package com.example.montinol19.homework2;

import android.widget.SeekBar;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 *
 * Created by Dylan on 3/25/2017.
 * Help from Dr. Nuxoll's TouchEventsDemo and Engineering Fellows
 *
 */

public class MainActivity extends AppCompatActivity
{
        private SeekBar redSeeker;
        private SeekBar greenSeeker;
        private SeekBar blueSeeker;
        private TextView elementName;
        //instance variables

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                elementName = (TextView)findViewById(R.id.elementName); //elements
                MySurfaceView canvasView = (MySurfaceView) findViewById(R.id.surfaceView); //surfaceview
                canvasView.setOnTouchListener(canvasView); //listen to surface

                redSeeker = (SeekBar) findViewById(R.id.redSeekBar);
                greenSeeker = (SeekBar) findViewById(R.id.greenSeekBar);
                blueSeeker = (SeekBar) findViewById(R.id.blueSeekBar);
                redSeeker.setOnSeekBarChangeListener(canvasView);
                greenSeeker.setOnSeekBarChangeListener(canvasView);
                blueSeeker.setOnSeekBarChangeListener(canvasView);
                //sets seekbars

                canvasView.setTextView(elementName,redSeeker, greenSeeker, blueSeeker);
        }
}