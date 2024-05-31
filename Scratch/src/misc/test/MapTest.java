package misc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>();
        gpaMap.put("breana", 3.6);
        gpaMap.put("douglas", 1.87);
        gpaMap.put("daiyron", 3.9);
        gpaMap.put("amir", 3.8);
        gpaMap.put("tayo", 3.4);
        gpaMap.put("coty", 1.6);

        dump(gpaMap);
        System.out.println();

        System.out.println("breana's gpa was: " + gpaMap.get("breana"));
        System.out.println();

        //print all gpas that are 3.5 or greater
        //make a collection of the values
        Collection<Double> gpaValues = gpaMap.values();
        //print only those values over or equal to 3.5
        for(Double gpaValue : gpaValues){
           if(gpaValue>= 3.5){
               System.out.println(gpaValue);
           }
        }

        System.out.println();

        //print the names of those with a gpa >= 2.0
        //use entrySet b/c we need both sides - the key and value
        //for every row in the set of rows print the key if the value is >= 2.0
        for(var entry : gpaMap.entrySet()){
            if(entry.getValue()>= 2.0){
                System.out.println(entry.getKey() + " had a gpa of " + entry.getValue() + ".");
            }
        }

    }
    //helper method to help visualize map "table"
    private static void dump(Map<String, Double> map) {
        //instead of Map.Entry<String, Double>, we can use var- way easier- short name for a long name
        for(var entry : map.entrySet()){  //map.entrySet() returns a set of Map.Entries (set of rows)
            System.out.println(entry.getKey() + " | " +entry.getValue());
        }
    }
}
