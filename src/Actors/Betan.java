package Actors;

import Enums.Place;
import Impl.Tripable;

public class Betan extends Person implements Tripable {
    public Betan(String name) throws PersonHasNotNameException {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(person.getName() + " хочет чтобы " + getName() + " проводил время с лошадьми");
    }

    @Override
    public void holidayTrip(Place place) {
        System.out.println(getName() + " отправляется в " + place);
    }
}
