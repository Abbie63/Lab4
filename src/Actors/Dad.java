package Actors;

import Impl.Travelable;

public class Dad extends Person {
    public Dad(String name) throws PersonHasNotNameException {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " пришел обедать и слушал что ему рассказывает " + person.getName());
    }

    public void converseToPerson(Person person){
        String reasonToStop =  " путешествует две недели c " + person.getName();

        dadToMum.converse(person);


        class Reason {
            private String reason = " путешествует две недели c " + person.getName();
            public Reason() {
                this.reason = reasonToStop;

            }
            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }
        }
        System.out.println(getName()  + reasonToStop);
    }

    Travelable dadToMum = new Travelable() {
        @Override
        public void converse(Person person) {
            System.out.println(getName() + " собирается на пароход с " + person.getName() );
        }
    };
}


