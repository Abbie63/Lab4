package Enums;

public enum Place {
    TABLE ("за столом"),
    YACHT_CLUB ("яхт клуб"),
    PEASANT_FARM ("крестьянский хутор"),
    HOME ("Дом Малыша"),
    HALLWAY("прихожая"),
    TRAVELAGENCY("бюро путешествий");


    private String title;

    Place(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}