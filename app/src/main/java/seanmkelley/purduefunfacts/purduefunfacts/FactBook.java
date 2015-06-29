package seanmkelley.purduefunfacts.purduefunfacts;

import java.util.Random;

/**
 * Created by Sean on 1/1/2015.
 */
public class FactBook {

    public String[] facts = {
            "New Orleans Saints quarterback Drew Brees played at Purdue",
            "Famous astronauts Gus Grissom, Neil Armstrong, and Eugene Cernan all attended Purdue",
            "Purdue offers more than 200 majors for undergraduate students",
            "Purdue has over 900 student organizations",
            "Comedian Jim Gaffigan attended Purdue for one year",
            "Purdue had 38,770 student enrolled for the 2014 Fall Semester",
            "Purdue has the fourth largest international student population of any school" +
                    "in the country",
            "Popcorn maker Orville Redenbacher attended Purdue",
            "Amelia Earhart disappeared an attempt to make a circumnavigational flight of the globe in 1937 in a Lockheed Model 10 Electra funded by Purdue"+
            "Purdue was founded on May 6, 1869" +
            "The school's current President is Mitch Daniels, former governor of Indiana" +
            "Purdue basketball holds the record for most Big Ten Championships with 22" +
            "Famous basketball coach John Wooden played for the Purdue men's team from 1928-1932"
    };
    public String getFact(){

        //button was clicked, update fact label with a new fact
        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        fact = facts[randomNumber];
        return fact;
    }
}
