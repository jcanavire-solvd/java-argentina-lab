package Personal;

public class Principal extends Person{
    private int idEmployee;
    private String hierarchy;
    private boolean highschool;

    public Principal (){}

    public Principal(int dni, String name, int age, int idEmployee, String hierarchy, boolean highschool) {
        super(dni, name, age);
        this.idEmployee = idEmployee;
        this.hierarchy = hierarchy;
        this.highschool = highschool;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public boolean isHighschool() {
        return highschool;
    }

    public void setHighschool(boolean highschool) {
        this.highschool = highschool;
    }
}
