package Models.Staff;

import Models.Exceptions.InvalidReviewException;
import Models.Interfaces.ArrangeMatch;
import Models.Interfaces.IncreaseMorale;
import Models.Interfaces.Training;

public class TechnicalDirector extends StaffMember implements Training, ArrangeMatch, IncreaseMorale {
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
    public void startTraining() throws InterruptedException {
        Training.super.startTraining();
    }

    @Override
    public void rallyPlayers(String msg) throws InvalidReviewException {
        if (msg.length() == 0){
            throw new InvalidReviewException("Exception: Message can't be empty");
        } else{
            System.out.println("*Technical Director enters the locker rooms to say something:");
            System.out.println("----------------------------------------");
            System.out.println(msg);
            if (msg.length() < 15){
                System.out.println("*The message was too short. Players didn't feel more motivated after that.*");
                System.out.println("----------------------------------------");
            } else {
                System.out.println("*Players are more motivated and will play better after your speech*");
                System.out.println("----------------------------------------");
            }
        }
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
