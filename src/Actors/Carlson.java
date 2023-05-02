package Actors;

import Enums.Place;

public class Carlson extends Person {
    public Carlson(String name) throws PersonHasNotNameException {
        super(name); }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " повезло, что " + person.getName() + " его не увидела, когда пришла из " + Place.TRAVELAGENCY);
    }
    public static class FlyAway {
        public void flyAway(Person p1) {
            System.out.println(p1.getName() + " улетает");}
    }
    public void happyB() {
        System.out.println(getName() + " вспоминает, что у него день рождения");
    }
}
