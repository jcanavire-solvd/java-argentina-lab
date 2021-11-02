package ClubDeFutbol;

public class Sacachispas extends ClubDeFutbol {

    public static void main(String[] args) {
        Sacachispas teamSacachispas = new Sacachispas();
        teamSacachispas.setLeague("Primera B");
        teamSacachispas.setCountry("Argentina");
        teamSacachispas.setAge(73);
        teamSacachispas.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamSacachispas);
        System.out.println("Can play a match?: " + teamSacachispas.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }

}