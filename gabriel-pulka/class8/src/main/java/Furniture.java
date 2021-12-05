public class Furniture extends Classroom implements Desk{

    private TypeOfFurnitures typeOfFurnitures;
    private Boolean Chair;
    private Boolean Table;

    public Furniture(String nameSchool, Integer classNumber, TypeOfFurnitures typeOfFurnitures) {
        super(nameSchool, classNumber);
        setTypeOfFurnitures(typeOfFurnitures);

    }

    public String getFurnitureDescription() {
        return typeOfFurnitures.name();
    }

    public void setTypeOfFurnitures(TypeOfFurnitures typeOfFurnitures) {
        this.typeOfFurnitures = typeOfFurnitures;
    }

    public Integer getPrice() {
        return typeOfFurnitures.getPrice();
    }


    @Override
    public void isChair(Boolean value) {
        Chair = value;
    }

    @Override
    public void isTable(Boolean value) {
        Table = value;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "description='" + typeOfFurnitures.name() +
                '}';
    }
}
