package gr.nbg.javase.collections;

public class ArrayExample {
    public static void main(String[] args) {

        String[] tvList = new String[4];
        tvList[0] = "LG";
        tvList[1] = "Samsung";
        tvList[2] = "Sony";
        tvList[3] = "Sony";

        System.out.println(tvList[0]);
        System.out.println(tvList);
        System.out.println(tvList.length);

        for(int i=0; i < tvList.length; i++){
            System.out.println(tvList[i]);
        }

        for(String s : tvList){
            System.out.println(s);
        }

        int[] numbers = new int[4];
        int[][] matrix = new int[3][4];
        matrix[0][0] = 5;
    }
}
