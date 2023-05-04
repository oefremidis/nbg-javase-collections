package gr.nbg.javase.collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> locations = new HashMap<>();
        locations.put("LG", "Living Room");
        locations.put("Sony", "Bed Room 1");
        locations.put("Sony", "Bed Room 2");

//        System.out.println(locations.get("LG"));
//        System.out.println(locations);
//        System.out.println(locations.size());
//        System.out.println(locations.containsKey("Sony"));
//        locations.remove("Sony");
//        System.out.println(locations);

//        for(String s : locations.values()){
//            System.out.println(s);
//        }
//
//        for(String s : locations.keySet()){
//            System.out.println(s);
//        }


        for(String s : locations.keySet()){
            System.out.println(s + " --> " + locations.get(s));
        }
    }
}
