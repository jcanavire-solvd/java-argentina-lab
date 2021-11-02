package ClubDeFutbol;

public class Atlas extends ClubDeFutbol {

    public static void main(String[] args) {
        Atlas teamAtlas = new Atlas();
        teamAtlas.setLeague("Primera C");
        teamAtlas.setCountry("Argentina");
        teamAtlas.setAge(70);
        teamAtlas.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamAtlas);
        System.out.println("Can play a match?: " + teamAtlas.canPlay());
    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }

}