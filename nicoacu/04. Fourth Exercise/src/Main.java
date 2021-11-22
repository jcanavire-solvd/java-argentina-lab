import Models.Area.BoardOfDirectors;
import Models.Staff.President;
import Models.Staff.TechnicalDirector;
import Models.Teams.*;

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
        President president = new President("Carlos", "Raffani", 62, 35928331, "Atlas", 50000, 0); // budget 0 = InvalidBudgetException
        System.out.println("----------------------------------------");
        System.out.println(president);
        System.out.println("----------------------------------------");
        System.out.println("Checking if President has budget to buy players...");
        president.canBuyPlayers(3000);
        System.out.println("----------------------------------------");

        System.out.println("Selecting Technical Director:");
        TechnicalDirector technicalDirector = new TechnicalDirector("Oscar", "Ruggeri", 66, 45531923, 30000);
        System.out.println(technicalDirector);
        technicalDirector.startTraining();

        BoardOfDirectors boardOfDirectors = new BoardOfDirectors();
        boardOfDirectors.arrangeMatch( "Atlas", "Real Madrid");
        System.out.println("----------------------------------------");
        boardOfDirectors.hirePlayers("Wanchope");
        boardOfDirectors.hirePlayers("Tévez");
        boardOfDirectors.sellPlayers("Wanchope");
        boardOfDirectors.sellPlayers("Casillas");
        System.out.println("----------------------------------------");

        technicalDirector.rallyPlayers("\"In football everything arranges itself. To me here is the better team, so leave everything on the field!\"");

        //RealMadrid
        RealMadrid teamRealMadrid = new RealMadrid(8);

        //DinamoMinsk
        DinamoMinsk teamDinamoMinsk = new DinamoMinsk(8);
    }
}