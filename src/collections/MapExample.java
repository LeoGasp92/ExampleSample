package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        //Add Value to Map
        map.put("Luca", 900);
        map.put("Laura", 950);
        System.out.println(map);
        map.put("Luca", 1000);
        System.out.println(map); // it over ride previous value for similar input

        // Get value from Key
        System.out.println("Luca's salary : " + map.get("Luca"));

        // All key values
        System.out.println(map.keySet());

        //Size
        System.out.println(map.size());

        // Check if Map contains key
        System.out.println("Do we have any employee named (Key) which here is String Name: " + map.containsKey("Giovanni"));

        //Check if Map contains value
        System.out.println("Do we have someone with the salary of 1000 (Value) : " + map.containsValue(1000));

        // Remove Key/Value pair from Map
        map.remove("Luca");
        System.out.println(map);


        // Example 2
        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia ", "Tallin ");
        capitalCity.put("Latvia ", "Riga ");
        capitalCity.put("Finland ", "Helsinki ");

        System.out.println(capitalCity.get("Finland"));
        for (Map.Entry<String, String> entry : capitalCity.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
