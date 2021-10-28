package Personal;

public class Secretary extends Person{
    private int idEmployee;
    private String area;

    public Secretary (){}

    public Secretary(int dni, String name, int age, int idEmployee, String area) {
        super(dni, name, age);
        this.idEmployee = idEmployee;
        this.area = area;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
