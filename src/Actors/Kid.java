package Actors;

import Enums.Food;
import Enums.Place;

public class Kid extends Person {
    public Kid(String name) throws PersonHasNotNameException {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " мало ест, когда " + person.getName() + " готовит " + Food.BOILED_COD + " или " +
                Food.VEGETABLE_SOUP + " или " + Food.HERRING_CUTLETS);
    }
    public void floorCleaning(Place place) {
        System.out.println(getName() + " моет пол в " + place);
    }
}
