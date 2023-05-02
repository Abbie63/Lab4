package Actors;

import Enums.Place;
import Impl.Tripable;

public class Bosse extends Person implements Tripable {
    public Bosse(String name) throws PersonHasNotNameException {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(person.getName() + " отправила " + getName() + " учиться парусному спорту");
    }

    @Override
    public void holidayTrip(Place place) {
        System.out.println(getName() + " отправляется в " + place);
    }
}
