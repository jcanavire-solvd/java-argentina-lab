public enum LevelsSchool {
    PRESCHOOL(1),
    ELEMENTARY(2),
    MIDDLE(3),
    HIGH(4);

    private int numberOfLevel;

    LevelsSchool(int numberOfLevel){
        this.numberOfLevel = numberOfLevel;
    }

    public int getNumberOfLevel() {
        return numberOfLevel;
    }
}
