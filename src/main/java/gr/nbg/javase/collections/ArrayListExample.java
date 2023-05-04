package gr.nbg.javase.collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> tvList = new ArrayList<>();
        tvList.add("LG");
        tvList.add("Samsung");
        tvList.add("Sony");
        tvList.add("Sony");

//        System.out.println(tvList.get(0));
        System.out.println(tvList);
//        System.out.println(tvList.size());
//        System.out.println(tvList.contains("Sony"));
//        tvList.remove(3);
//        System.out.println(tvList);

//        for(int i=0; i < tvList.size(); i++){
//            System.out.println(tvList.get(i));
//        }

        for(String s : tvList){
            System.out.println(s);
        }

        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
    }
}
