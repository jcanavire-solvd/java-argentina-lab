package ClubDeFutbol;

public class Barcelona extends ClubDeFutbol {

    public static void main(String[] args) {
        Barcelona clubBarcelona = new Barcelona();
        clubBarcelona.setLeague("LaLiga Santander");
        clubBarcelona.setCountry("Spain");
        clubBarcelona.setAge(121);
        clubBarcelona.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubBarcelona);
        System.out.println("Can play a match?: " + clubBarcelona.canPlay());

        // Creating another club to test hashCode and Equals
        Barcelona otherBarcelona = new Barcelona(121) ;// Applying same age in both teams, as this is necessary for the hasCode

        //Checking new hashCode
        System.out.println("Original Hashcode for this club --> " + clubBarcelona.hashCode());
        System.out.println("Manually Changed Hashcode --> " + otherBarcelona.hashCode()); // hashCode is age + length of characters of team's name. In this case, 121 + 9

        //Testing overriden equals
        System.out.println("Are both equals? Answer: " + clubBarcelona.equals(otherBarcelona)); // Should be "true"
    }

    public Barcelona(int age){
        this.setAge(age);
    }

    public Barcelona(){}

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
        Barcelona otherBarcelona = (Barcelona) obj;
        return this.name.equals(otherBarcelona.name) &&
                this.hashCode() == otherBarcelona.hashCode();
    }

}