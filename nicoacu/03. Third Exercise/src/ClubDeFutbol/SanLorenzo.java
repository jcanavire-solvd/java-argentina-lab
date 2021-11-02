package ClubDeFutbol;

public class SanLorenzo extends ClubDeFutbol {

    public static void main(String[] args) {
        SanLorenzo teamSanLorenzo = new SanLorenzo();
        teamSanLorenzo.setLeague("Super Liga Argentina");
        teamSanLorenzo.setCountry("Argentina");
        teamSanLorenzo.setAge(113);
        teamSanLorenzo.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamSanLorenzo);
        System.out.println("Can play a match?: " + teamSanLorenzo.canPlay());

        // Creating another team to test hashCode and Equals
        SanLorenzo otroSanLorenzo = new SanLorenzo(){
            public int hashCode() {
                return (2021);
            }
        };

        //Checking new hashCode
        System.out.println("Original Hashcode for this team --> " + teamSanLorenzo.hashCode());
        System.out.println("Manually Changed Hashcode --> " + otroSanLorenzo.hashCode());

        //Testing overriden equals
        System.out.println("Are both equals? Answer: " + teamSanLorenzo.equals(otroSanLorenzo));
    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
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
        SanLorenzo otroSanLorenzo = (SanLorenzo) obj;
        return this.name.equals(otroSanLorenzo.name) &&
                this.hashCode() == otroSanLorenzo.hashCode();
    }

}