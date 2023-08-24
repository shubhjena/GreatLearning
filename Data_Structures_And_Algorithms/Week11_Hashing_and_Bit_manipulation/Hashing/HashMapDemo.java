package Week11_Hashing_and_Bit_manipulation.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        //add
        map.put("DOGE",3.53);
        map.put("BTC",3300000.56);
        map.put("ETH",1600000.72);
        map.put("ADA",35.25);

        //print
        System.out.println(map);

        //update
        map.put("DOGE",8.25);

        //searching
        if (map.containsKey("BTC")) System.out.println("Present");

        //get
        System.out.println(map.get("ETH"));
        System.out.println(map.get("ADA"));

        //iteration - entrySet()
        for (Map.Entry<String,Double> e: map.entrySet()){
            System.out.print(e.getKey()+" - ");
            System.out.println(e.getValue());
        }

        //iteration - keySet()
        Set<String> keys  = map.keySet();
        for (String key : keys){
            System.out.println(key+" - "+map.get(key));
        }

        //remove
        map.remove("ADA");
        System.out.println("After removing \n"+ map);
    }
}
