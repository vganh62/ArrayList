package Lecture7;

import java.util.ArrayList;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Tim");
        color.add("Cam");
        color.add("Xanh la");
        color.add("Xanh duong");
        color.add("Hong");
        System.out.println("Initial: " + color);
        color.set(1, "Vang");
        System.out.println("Update: " + color);
    }
}
