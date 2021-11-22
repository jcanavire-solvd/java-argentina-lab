package Models.Staff;

import Models.Exceptions.InvalidBudgetException;
import Models.Interfaces.StrategicDecision;
import Models.Interfaces.TransferMarket;
import Models.Interfaces.ArrangeMatch;

public class President extends StaffMember implements TransferMarket, StrategicDecision, ArrangeMatch {
    private String team;
    private float salary;
    private int budget;

    public President(String name, String lastName, int age, int credential, String team, float salary, int budget) {
        super(name, lastName, age, credential);
        this.team = team;
        this.salary = salary;
        this.budget = budget;

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public void canBuyPlayers(int playerCost) throws InvalidBudgetException{
        budget = getBudget();
        if (budget <= 0) {
            throw new InvalidBudgetException("Exception: You can't operate with a budget of 0 or less than 0");
        } else {
            System.out.println("----------------Football Transfer Market Report---------------");
            System.out.println("This team is looking to buy a player who cost: USD " + playerCost);
            if (budget > playerCost){
                System.out.println("This team can buy the player.");
            } else {
                System.out.println("This player is too expensive.");
            }
            System.out.println("--------------------------------------------------------------");
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
        return "President{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", credential=" + credential +
                '}';
    }


}
