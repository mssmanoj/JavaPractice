package basic.problems.collection_framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapitalMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> map = createCountryCapitalMap();
        String country = scanner.nextLine();
        if (map.containsKey(country)){
            System.out.println("Capital:"+map.get(country));
        }else {
            System.out.println("Country is not present in the map");
        }
    }

    private static Map<String,String> createCountryCapitalMap(){
        Map<String,String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("Germany","Berlin");
        map.put("Russia","Edinburgh");
        return map;
    }
}
