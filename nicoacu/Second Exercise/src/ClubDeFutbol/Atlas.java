package ClubDeFutbol;

public class Atlas extends ClubDeFutbol {

    public static void main(String[] args) {
        Atlas clubAtlas = new Atlas();
        clubAtlas.setLeague("Primera C");
        clubAtlas.setCountry("Argentina");
        clubAtlas.setAge(70);
        clubAtlas.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubAtlas);
        System.out.println("Can play a match?: " + clubAtlas.canPlay());
    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}