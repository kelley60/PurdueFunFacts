package seanmkelley.purduefunfacts.purduefunfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Sean on 1/1/2015.
 */
public class ColorWheel {

    public String[] colors = {
            "#000000", // black
            "#cfb53b", // old gold
    };

    public int getColor(){

        //button was clicked, update fact label with a new fact
        String color = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        color = colors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}