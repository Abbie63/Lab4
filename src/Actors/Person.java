package Actors;


import Enums.Place;
import Impl.Movementable;

public abstract class Person implements Movementable {
    private String name;
    public boolean hasName;
    public Person () {}
    public Person (String name) throws PersonHasNotNameException{
        this.name =name;
        System.out.println("Создано существо: " + getName());
        hasName = true;
        if (hasName) {
            System.out.println("Приветствуем персонажа с именем " + getName());
        } else {
            throw new PersonHasNotNameException("У персонажа нет имени!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return name;
    }

public static void talking(Place place, Person... personArr) {
    System.out.print("Когда ");
        for (int i = 0; i < personArr.length; i++) {
            System.out.print(personArr[i] + ", ");
        }
    System.out.println("собираются вместе " + place + ", то всем весело");
}



}

