package Enums;

public enum Food {
    BOILED_COD ("вареная треска"),
    VEGETABLE_SOUP ("овощной суп"),
    HERRING_CUTLETS ("селедочные котлеты"),
    VEAL_CHOPS ("телячьи отбивные"),
    STRAWBERRY ("клубника");

    private String title;

    Food(String title) {
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
