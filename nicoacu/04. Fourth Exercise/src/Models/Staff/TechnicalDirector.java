package Models.Staff;

import Models.Interfaces.ArrangeMatch;
import Models.Interfaces.Training;

public class TechnicalDirector extends StaffMember implements Training, ArrangeMatch {
    private float salary;

    public TechnicalDirector(String name, String lastName, int age, int credential, float salary) {
        super(name, lastName, age, credential);
        this.salary = salary;

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public int hashCode() {
        int characters = 0;

        for(int i = 0; i < name.length() ; i++){
            characters++;
        }

        return characters + getAge() + getCredential();
    }

    @Override
    public boolean equals(Object obj) {
        Players otherPlayers = (Players) obj;
        return this.name.equals(otherPlayers.name) &&
                this.hashCode() == otherPlayers.hashCode();
    }

    @Override
    public String toString() {
        return "TechnicalDirector{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", credential=" + credential +
                ", salary=" + salary +
                '}';
    }
}
