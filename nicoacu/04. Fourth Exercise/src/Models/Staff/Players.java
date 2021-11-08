package Models.Staff;

import Models.Interfaces.Training;

public class Players extends StaffMember implements Training {
    private String position;
    private float salary;

    public Players(String name, String lastName, int age, int credential, String position, float salary) {
        super(name, lastName, age, credential);
        this.position = position;
        this.salary = salary;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        return "Players{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", credential=" + credential +
                '}';
    }


}
