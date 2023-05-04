package gr.nbg.javase.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // setters getters toString
@AllArgsConstructor
@NoArgsConstructor
public class Plane implements FlyingObject{

    private String brand;

    @Override
    public void fly() {
        System.out.println("Plane... flies...");
    }
}
