import Actors.*;
import Enums.Place;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws PersonHasNotNameException, IOException {
        try {
            Mum mum = new Mum("мама");
            Dad dad = new Dad("папа");
            Kid kid = new Kid("Малыш");
            Betan betan = new Betan("Бетан");
            Bosse bosse = new Bosse("Боссе");
            Carlson carlson = new Carlson("Карлсон");

            Carlson.FlyAway flyAwayObj = new Carlson.FlyAway();
            flyAwayObj.flyAway(carlson);
            kid.floorCleaning(Place.HALLWAY);
            carlson.happyB();
            carlson.action(mum);
            mum.action(kid);
            dad.action(mum);
            mum.funAtLunch(kid);
            Person.talking(Place.TABLE, kid, mum, dad, bosse, betan);
            kid.action(mum);
            mum.tastyFood();
            bosse.holidayTrip(Place.YACHT_CLUB);
            bosse.action(mum);
            betan.holidayTrip(Place.PEASANT_FARM);
            betan.action(dad);
            Mum.Transformation transformation = mum.new Transformation();
            transformation.transformation();
            mum.callback(Place.TRAVELAGENCY);
            dad.converseToPerson(mum);

        } catch (PersonHasNotNameException e) {
            System.out.println(e.getMessage());
        }
}}
