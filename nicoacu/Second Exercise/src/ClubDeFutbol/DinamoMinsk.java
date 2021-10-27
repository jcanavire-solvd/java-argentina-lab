package ClubDeFutbol;

public class DinamoMinsk extends ClubDeFutbol {

    public static void main(String[] args) {
        DinamoMinsk clubDinamoMinsk = new DinamoMinsk();
        clubDinamoMinsk.setLeague("Vysheyshaya Liga");
        clubDinamoMinsk.setCountry("Belarús");
        clubDinamoMinsk.setAge(94);
        clubDinamoMinsk.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubDinamoMinsk);
        System.out.println("Can play a match?: " + clubDinamoMinsk.canPlay());

        // Creating another club to test hashCode and Equals
        DinamoMinsk otherDinamoMinsk = new DinamoMinsk(){
            public int hashCode() {
                return (2021);
            }
        };

        //Checking new hashCode
        System.out.println("Original Hashcode for this club --> " + clubDinamoMinsk.hashCode());
        System.out.println("Manually Changed Hashcode --> " + otherDinamoMinsk.hashCode());

        //Testing overriden equals
        System.out.println("Are both equals? Answer: " + clubDinamoMinsk.equals(otherDinamoMinsk));
    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

    @Override
    public int hashCode() {
        int characters = 0;

        for(int i = 0; i < name.length() ; i++){
            characters++;
        }

        return characters + getAge();
    }

    @Override
    public boolean equals(Object obj) {
        DinamoMinsk otherDinamoMinsk = (DinamoMinsk) obj;
        return this.name.equals(otherDinamoMinsk.name) &&
                this.hashCode() == otherDinamoMinsk.hashCode();
    }

}