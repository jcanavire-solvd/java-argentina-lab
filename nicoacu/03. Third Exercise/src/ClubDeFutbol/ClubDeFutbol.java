package ClubDeFutbol;

public abstract class ClubDeFutbol {

    private static int AmountOfTeams = 15;
    protected final String name = this.getClass().getSimpleName();
    protected String league;
    protected String country;
    protected int age;
    private boolean hasArgentinianPlayers;

    public abstract boolean canPlay();

    public void canBuyPlayers(int playerCost, int moneyAvailable, boolean canAskForLoan){ // polymorphism, adding a new parameter in the default method.
        System.out.println("----------------Football Transfer Market Report---------------");
        System.out.println("This team is looking to buy a player who cost: USD " + playerCost);

        if (moneyAvailable < playerCost && !canAskForLoan){
            System.out.println("This player is too expensive.");
        } else if (moneyAvailable < playerCost && canAskForLoan) {
            System.out.println("This team can buy the player, but will need to ask for a loan.");
        } else {
            System.out.println("This team can buy the player.");
        }
        System.out.println("--------------------------------------------------------------");
    }


    @Override
    public String toString() {
        return "ClubDeFutbol{" +
                "AmountOfTeams='" + AmountOfTeams + '\'' +
                ", name='" + name + '\'' +
                ", league='" + getLeague() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", age=" + getAge() +
                ", hasArgentinianPlayers=" + isHasArgentinianPlayers() +
                '}';
    }

    //Setters

    public void setLeague(String league){
        this.league = league;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasArgentinianPlayers(boolean hasArgentinianPlayers) {
        this.hasArgentinianPlayers = hasArgentinianPlayers;
    }

    //Getters
    
    public String getLeague() {
        return league;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasArgentinianPlayers() {
        return hasArgentinianPlayers;
    }


}