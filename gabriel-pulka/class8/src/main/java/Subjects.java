public enum Subjects {
    SCIENCE(2),
    BIOLOGY(4),
    CHEMISTRY(7),
    PHYSICS(1),
    MATHEMATICS(3),
    LITERATURE(2),
    HISTORY(5),
    GEOGRAPHY(2);

    private int hours;

    Subjects(int hours){
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }


}
