package Lecture7;

import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("Da Nang");
        cities.add("Hai Phong");
        cities.add("Paris");
        cities.add("London");
        System.out.println("Cities: " + cities);
        if (cities.contains("London")) {
            System.out.println("Co tp London");
        } else {
            System.out.println("Khong co tp London");
        }
    }
}
