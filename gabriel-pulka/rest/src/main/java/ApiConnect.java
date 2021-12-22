import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;

public class ApiConnect extends Thread {

    protected String coin;
    protected String bank;


    public ApiConnect(String coin, String bank){
        this.coin = coin;
        this.bank = bank;
    }

    private void getPrice (String coin, String bank){
        baseURI = "https://api-dolar-argentina.herokuapp.com/api";

        Value value= get(String.format("/%s", DollarTypes.fromCoinBanK(coin,bank).get())).as(Value.class);

        System.out.println("Bank: " + bank.toUpperCase() + " - Coin: " + coin.toUpperCase() + ": "
                   // + get(String.format("/%s", DollarTypes.fromCoinBanK(coin,bank).get())).asString());
                + value.toString());
    }

    @Override
    public void run() {
        getPrice(coin, bank);
    }

}
