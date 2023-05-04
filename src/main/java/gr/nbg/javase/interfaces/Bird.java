package gr.nbg.javase.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bird implements FlyingObject {

    private String breed;

    @Override
    public void fly(){
        System.out.println("Bird... flies...");
    }

}
