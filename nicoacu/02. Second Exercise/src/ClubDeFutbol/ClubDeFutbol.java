package ClubDeFutbol;

public abstract class ClubDeFutbol {

    private static int AmountOfTeams = 15;
    protected final String name = this.getClass().getSimpleName();
    protected String league;
    protected String country;
    protected int age;
    private boolean hasArgentinianPlayers;

    public abstract boolean canPlay();

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