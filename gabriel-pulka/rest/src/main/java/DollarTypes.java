import java.util.Arrays;
import java.util.Optional;

public enum DollarTypes {
    euronacion("euro","nacion"),
    eurogalicia("euro", "galicia"),
    eurobbva("euro", "bbva"),
    europampa("euro", "pampa"),
    eurochaco("euro", "chaco"),
    eurohipotecario("euro", "hipotecario"),
    realnacion("real", "nacion"),
    realbbva("real", "bbva"),
    realchaco("real", "chaco"),
    bbva("dolar","bbva"),
    galicia("dolar","galicia"),
    santander("dolar","santander"),
    piano("dolar","piano"),
    hipotecario("dolar","hipotecario"),
    ciudad("dolar","ciudad"),
    supervielle("dolar","supervielle"),
    patagonia("dolar","patagonia"),
    comafi("dolar","comafi"),
    nacion("dolar","nacion"),
    bind("dolar","bind"),
    bancor("dolar","bancor"),
    chaco("dolar","chaco"),
    pampa("dolar","pampa");


    @Override
    public String toString() {
        if (coin == "euro" || coin == "real" ){
            return coin + "/" + bank;
        }
        return bank;
    }


    private String coin;
    private String bank;

    DollarTypes(String coin, String bank) {
        this.coin = coin;
        this.bank = bank;

    }

    public static Optional<DollarTypes> fromCoinBanK(String coin, String bank){
        return Arrays.stream(DollarTypes.values())
                .filter(c ->c.coin.equals(coin))
                .filter(b ->b.bank.equals(bank))
                .findFirst();
    }


}

