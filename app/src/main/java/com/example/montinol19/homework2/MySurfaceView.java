package com.example.montinol19.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 *
 * Created by Dylan on 3/25/2017.
 * Help from Dr. Nuxoll's TouchEventsDemo and Engineering Fellows
 *
 */

public class MySurfaceView extends SurfaceView implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener
{
    int xCor = 1500;
    int yCor = 1500;
    CustomElement current = null;
    CustomRect bottom, body, leftLeg, rightLeg, bar,leftArm, rightArm, mouth, box, tooth1,
            tooth2, tooth3, tooth4, head;
    CustomCircle leftEye, rightEye;
    TextView nameOf;
    SeekBar redBar;
    SeekBar greenBar;
    SeekBar blueBar;
    //instance variables

    private void myInitializations()
    {
        setWillNotDraw(false);

    }

    public MySurfaceView(Context context)
    {
        super(context);
        myInitializations();
    }

    public MySurfaceView(Context context, AttributeSet set)
    {
        super(context, set);
        myInitializations();

        int lightBlue = Color.rgb(105,209,230);
        int teal = Color.rgb(81,190,202);
        int rose = Color.rgb(255,182,214);
        int pink = Color.rgb(247,124,177);
        int floor = Color.rgb(22,138,151);
        //Custom made colors

        head = new CustomRect("HEAD",lightBlue,600, 50,1000 ,350);
        leftEye = new CustomCircle("LEFT EYE",rose, 700,120, 40);
        rightEye = new CustomCircle("RIGHT EYE",rose, 900,120, 40);
        mouth = new CustomRect("MOUTH",pink,650,200, 950 ,250 );
        body = new CustomRect("BODY",teal,400, 350,1200 ,1000);
        bar = new CustomRect("STORAGE UNIT",rose,500,400 ,1100 ,500 );
        box = new CustomRect("TANK",pink,500,600 ,1100 ,1000 );
        tooth1 = new CustomRect("FIRST BAR",Color.WHITE,550, 600,600 ,1000 );
        tooth2 = new CustomRect("SECOND BAR",Color.WHITE,700, 600,750 ,1000);
        tooth3 = new CustomRect("THIRD BAR",Color.WHITE,850, 600,900 ,1000 );
        tooth4 = new CustomRect("FOURTH BAR",Color.WHITE,1000, 600,1050 ,1000 );
        leftArm = new CustomRect("LEFT ARM",Color.WHITE,200,550 ,400 ,600 );
        rightArm = new CustomRect("RIGHT ARM",Color.WHITE,1200,550 ,1400 ,600 );
        leftLeg = new CustomRect("LEFT LEG", Color.WHITE,650, 1000,700 ,1300);
        rightLeg = new CustomRect("RIGHT LEG",Color.WHITE,900, 1000,950 ,1300 );
        bottom = new CustomRect("GROUND",floor,0, 1200,2100 ,1400 );
        //Sets all circles and rectangles on surface view with colors and size
    }

    public MySurfaceView(Context context, AttributeSet attrs, int defStyle)
    {

        super(context, attrs, defStyle);
        myInitializations();
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        head.drawMe(canvas);
        leftEye.drawMe(canvas);
        rightEye.drawMe(canvas);
        mouth.drawMe(canvas);
        body.drawMe(canvas);
        bar.drawMe(canvas);
        box.drawMe(canvas);
        tooth1.drawMe(canvas);
        tooth2.drawMe(canvas);
        tooth3.drawMe(canvas);
        tooth4.drawMe(canvas);
        leftArm.drawMe(canvas);
        rightArm.drawMe(canvas);
        bottom.drawMe(canvas);
        leftLeg.drawMe(canvas);
        rightLeg.drawMe(canvas);

        //draws all elements on the surface view

        if(leftEye.containsPoint(xCor,yCor)) //if eye was touched from x and y
        {
            current = leftEye; //sets element to current
            leftEye.drawHighlight(canvas); //highlights element tapped
            nameOf.setText(leftEye.getName()); //sets name on TextView
            redBar.setProgress(Color.red(leftEye.getColor()));
            greenBar.setProgress(Color.green(leftEye.getColor()));
            blueBar.setProgress(Color.blue(leftEye.getColor()));
            //gets the color of the element

        }
        else if(rightEye.containsPoint(xCor,yCor))
        {
            current = rightEye;
            rightEye.drawHighlight(canvas);
            nameOf.setText(rightEye.getName());
            redBar.setProgress(Color.red(rightEye.getColor()));
            greenBar.setProgress(Color.green(rightEye.getColor()));
            blueBar.setProgress(Color.blue(rightEye.getColor()));

        }
        else if(tooth1.containsPoint(xCor,yCor))
        {
            current = tooth1;
            tooth1.drawHighlight(canvas);
            nameOf.setText(tooth1.getName());
            redBar.setProgress(Color.red(tooth1.getColor()));
            greenBar.setProgress(Color.green(tooth1.getColor()));
            blueBar.setProgress(Color.blue(tooth1.getColor()));

        }
        else if(tooth2.containsPoint(xCor,yCor))
        {
            current = tooth2;
            tooth2.drawHighlight(canvas);
            nameOf.setText(tooth2.getName());
            redBar.setProgress(Color.red(tooth2.getColor()));
            greenBar.setProgress(Color.green(tooth2.getColor()));
            blueBar.setProgress(Color.blue(tooth2.getColor()));

        }
        else if(tooth3.containsPoint(xCor,yCor))
        {
            current = tooth3;
            tooth3.drawHighlight(canvas);
            nameOf.setText(tooth3.getName());
            redBar.setProgress(Color.red(tooth3.getColor()));
            greenBar.setProgress(Color.green(tooth3.getColor()));
            blueBar.setProgress(Color.blue(tooth3.getColor()));

        }
        else if(tooth4.containsPoint(xCor,yCor))
        {
            current = tooth4;
            tooth4.drawHighlight(canvas);
            nameOf.setText(tooth4.getName());
            redBar.setProgress(Color.red(tooth4.getColor()));
            greenBar.setProgress(Color.green(tooth4.getColor()));
            blueBar.setProgress(Color.blue(tooth4.getColor()));

        }
        else if(box.containsPoint(xCor,yCor))
        {
            current = box;
            box.drawHighlight(canvas);
            nameOf.setText(box.getName());
            redBar.setProgress(Color.red(box.getColor()));
            greenBar.setProgress(Color.green(box.getColor()));
            blueBar.setProgress(Color.blue(box.getColor()));

        }
        else if(mouth.containsPoint(xCor,yCor))
        {
            current = mouth;
            mouth.drawHighlight(canvas);
            nameOf.setText(mouth.getName());
            redBar.setProgress(Color.red(mouth.getColor()));
            greenBar.setProgress(Color.green(mouth.getColor()));
            blueBar.setProgress(Color.blue(mouth.getColor()));

        }
        else if(leftLeg.containsPoint(xCor,yCor))
        {
            current = leftLeg;
            leftLeg.drawHighlight(canvas);
            nameOf.setText(leftLeg.getName());
            redBar.setProgress(Color.red(leftLeg.getColor()));
            greenBar.setProgress(Color.green(leftLeg.getColor()));
            blueBar.setProgress(Color.blue(leftLeg.getColor()));

        }
        else if(rightLeg.containsPoint(xCor,yCor))
        {
            current = rightLeg;
            rightLeg.drawHighlight(canvas);
            nameOf.setText(rightLeg.getName());
            redBar.setProgress(Color.red(rightLeg.getColor()));
            greenBar.setProgress(Color.green(rightLeg.getColor()));
            blueBar.setProgress(Color.blue(rightLeg.getColor()));
        }
        else if(bar.containsPoint(xCor,yCor))
        {
            current = bar;
            bar.drawHighlight(canvas);
            nameOf.setText(bar.getName());
            redBar.setProgress(Color.red(bar.getColor()));
            greenBar.setProgress(Color.green(bar.getColor()));
            blueBar.setProgress(Color.blue(bar.getColor()));

        }
        else if(leftArm.containsPoint(xCor,yCor))
        {
            current = leftArm;
            leftArm.drawHighlight(canvas);
            nameOf.setText(leftArm.getName());
            redBar.setProgress(Color.red(leftArm.getColor()));
            greenBar.setProgress(Color.green(leftArm.getColor()));
            blueBar.setProgress(Color.blue(leftArm.getColor()));

        }
        else if(rightArm.containsPoint(xCor,yCor))
        {
            current = rightArm;
            rightArm.drawHighlight(canvas);
            nameOf.setText(rightArm.getName());
            redBar.setProgress(Color.red(rightArm.getColor()));
            greenBar.setProgress(Color.green(rightArm.getColor()));
            blueBar.setProgress(Color.blue(rightArm.getColor()));

        }
        else if(body.containsPoint(xCor,yCor))
        {

            current = body;
            body.drawHighlight(canvas);
            nameOf.setText(body.getName());
            redBar.setProgress(Color.red(body.getColor()));
            greenBar.setProgress(Color.green(body.getColor()));
            blueBar.setProgress(Color.blue(body.getColor()));

        }
        else if(head.containsPoint(xCor,yCor))
        {
            current = head;
            head.drawHighlight(canvas);
            nameOf.setText(head.getName());
            redBar.setProgress(Color.red(head.getColor()));
            greenBar.setProgress(Color.green(head.getColor()));
            blueBar.setProgress(Color.blue(head.getColor()));

        }
        else if(bottom.containsPoint(xCor,yCor))
        {
            current = bottom;
            bottom.drawHighlight(canvas);
            nameOf.setText(bottom.getName());
            redBar.setProgress(Color.red(bottom.getColor()));
            greenBar.setProgress(Color.green(bottom.getColor()));
            blueBar.setProgress(Color.blue(bottom.getColor()));

        }
        else
            return; //when nothing is touched, nothing
    }

    public void setTextView(TextView nameElement, SeekBar redSeek, SeekBar greenSeeker, SeekBar blueSeeker)
    {
        nameOf = nameElement;
        redBar = redSeek;
        greenBar = greenSeeker;
        blueBar = blueSeeker;
        //sets seekbars and textViews
    }

    @Override
    public boolean onTouch(View v, MotionEvent event)
    {

        if(event.getAction() != MotionEvent.ACTION_UP)
        {
            return true;
        }

        xCor = (int) event.getX();
        yCor = (int) event.getY();
        invalidate(); //draw again
        return true;
        //gets x and y coords
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
        int newColor = 0;

        if(current == null)
        {
            return;
        }

        if(seekBar.equals(redBar))
        {
            newColor = Color.rgb(redBar.getProgress(),Color.green(current.getColor()), Color.blue(current.getColor()));
            //gets the progress of only the red seek bar

        }
        else if(seekBar.equals(greenBar))
        {
            newColor = Color.rgb(Color.red(current.getColor()),greenBar.getProgress(), Color.blue(current.getColor()));
            //gets the progress of only the green seek bar
        }
        else if(seekBar.equals( blueBar))
        {
            newColor = Color.rgb(Color.red(current.getColor()),Color.green(current.getColor()), blueBar.getProgress());
            //gets the progress of only the blue seek bar
        }

        current.setColor(newColor);
        invalidate(); //draws again
        return;

        //changes seekbar colors
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar)
    {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar)
    {
    }
}