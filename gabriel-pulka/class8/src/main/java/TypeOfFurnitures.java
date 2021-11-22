public enum TypeOfFurnitures {
    CHAIR(200),
    TABLE(150),
    DESK(50),
    SOFA(4);

    private int price;

    TypeOfFurnitures(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
