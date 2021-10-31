package Personal;

public class Accountant extends Person {
    private int idEmployee;
    private String area;

    public Accountant() {    }

    public Accountant(int dni, String name, int age, int idEmployee, String area) {
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
