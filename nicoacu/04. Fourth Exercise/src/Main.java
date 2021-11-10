import Models.Staff.President;
import Models.Teams.Atlas;

public class Main {
    public static void main(String[] args) throws Exception {
        // Atlas
        Atlas teamAtlas = new Atlas(8);
        System.out.println("Details of this Club:");
        System.out.println("----------------------------------------");
        System.out.println(teamAtlas);
        System.out.println("----------------------------------------");
        System.out.println("Can play a match?: " + teamAtlas.canPlay());

        System.out.println("Selecting President:");
        President president = new President("Carlos", "Raffani", 62, 35928331, "Atlas", 50000, 400);
        System.out.println("----------------------------------------");
        System.out.println(president);
        System.out.println("----------------------------------------");
        System.out.println("Checking if President can buy players...");
        president.canBuyPlayers(3000);


    }
}