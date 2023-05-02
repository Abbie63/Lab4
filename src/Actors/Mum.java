package Actors;

import Enums.Food;
import Enums.Place;

public class Mum extends Person {
    public Mum(String name) throws PersonHasNotNameException {
        super(name);
    }

    @Override
    public void action(Person person) {
        System.out.println(getName() + " поняла, что " + person.getName() + " что-то натворил");
    }

    public void funAtLunch(Person person) {
        System.out.println(getName() + " считает, что за обедом должно быть весело, " + person.getName() + " поддерживает ее в этом");
    }

    public void tastyFood() {
        System.out.println(getName() + " подала к обеду " + Food.VEAL_CHOPS + " и " + Food.STRAWBERRY);
    }

 public void callback(Place place) {
     System.out.println(getName() + " была в " + place + " заказала билеты на пароход");
 }


    public class Transformation {

        public void transformation() {
            System.out.println(getName()+ " превращает маленький обед в большой пир");
        }
    }
}
