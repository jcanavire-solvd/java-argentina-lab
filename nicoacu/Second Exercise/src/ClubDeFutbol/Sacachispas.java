package ClubDeFutbol;

public class Sacachispas extends ClubDeFutbol {

    public static void main(String[] args) {
        Sacachispas clubSacachispas = new Sacachispas();
        clubSacachispas.setLeague("Primera B");
        clubSacachispas.setCountry("Argentina");
        clubSacachispas.setAge(73);
        clubSacachispas.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubSacachispas);
        System.out.println("Can play a match?: " + clubSacachispas.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}