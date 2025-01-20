package Lecture7;

import java.util.ArrayList;

public class Ex3 {

    public static void main(String[] args) {
        ArrayList<Double> price = new ArrayList<>();
        price.add(20.0);
        price.add(26.0);
        price.add(12.0);
        price.add(6.0);

        System.out.println("List: ");
        for (int i = 0; i < price.size(); i++) {
            System.out.println(price.get(i));
        }
    }
}
