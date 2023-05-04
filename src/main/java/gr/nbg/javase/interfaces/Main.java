package gr.nbg.javase.interfaces;
public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Bird bird = new Bird();

        plane.fly();
        bird.fly();

        FlyingObject fo1 = new Plane();
        FlyingObject fo2 = new Bird();

        fo1.fly();
        fo2.fly();

        FlyingObject fo3 = plane;
        fo3.fly();
        System.out.println(plane);

    }
}