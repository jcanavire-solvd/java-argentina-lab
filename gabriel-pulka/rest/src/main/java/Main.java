import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, ApiConnect> map = new HashMap<>();
        map.put(map.size(), new ApiConnect("euro", "nacion"));
        map.put(map.size(), new ApiConnect("dolar", "nacion"));
        map.put(map.size(), new ApiConnect("real", "bbva"));
        map.put(map.size(), new ApiConnect("dolar", "santander"));
        map.put(map.size(), new ApiConnect("dolar", "patagonia"));
        map.put(map.size(), new ApiConnect("dolar", "comafi"));
        map.put(map.size(), new ApiConnect("euro", "pampa"));
        map.put(map.size(), new ApiConnect("dolar", "hipotecario"));
        map.put(map.size(), new ApiConnect("dolar", "ciudad"));
        map.put(map.size(), new ApiConnect("dolar", "supervielle"));
        map.put(map.size(), new ApiConnect("real", "chaco"));


        map.forEach((k,v)->v.start());


    }
}



