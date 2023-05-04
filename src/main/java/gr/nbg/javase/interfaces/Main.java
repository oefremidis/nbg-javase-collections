package gr.nbg.javase.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Plane plane = new Plane();
//        Bird bird = new Bird();
//
//        plane.fly();
//        bird.fly();
//
//        FlyingObject fo1 = new Plane();
//        FlyingObject fo2 = new Bird();
//
//        fo1.fly();
//        fo2.fly();
//
//        FlyingObject fo3 = plane;
//        fo3.fly();
//        System.out.println(plane);

//        ArrayList<Plane> planeList = new ArrayList<>();
//        planeList.add(new Plane("Boeing"));
//        planeList.add(new Plane("BBBBB"));
//        planeList.add(new Plane("CCCCC"));
//
////      for (int i = 0; i < planeList.size(); i++) {
////            System.out.println(planeList.get(i));
////        }
//
//        for (Plane p : planeList) {
//            System.out.print(p.getBrand() + " ");
//            p.fly();
//        }
//
//        ArrayList<Bird> birdList = new ArrayList<>();
//        birdList.add(new Bird("KKKKKK"));
//        birdList.add(new Bird("GGGGGG"));
//        birdList.add(new Bird("PPPPPP"));
//
//        for (Bird b : birdList) {
//            System.out.print(b.getBreed() + " ");
//            b.fly();
//        }


        ArrayList<FlyingObject> flyingList = new ArrayList<>();
        flyingList.add(new Plane("Boeing"));
        flyingList.add(new Bird("PPPPPP"));
        flyingList.add(new Plane("CCCCC"));
        flyingList.add(new Bird("KKKKKK"));
        flyingList.add(new Plane("BBBBB"));
        flyingList.add(new Bird("GGGGGG"));


        for (FlyingObject f : flyingList) {
            f.fly();
        }


    }
}