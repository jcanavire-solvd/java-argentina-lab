public enum KitchenMenu {
    CHICKEN(40),
    PIZZA(25),
    PASTA(15),
    FISH(18);

    private int minutes;

    KitchenMenu(int minutes){
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }
}
