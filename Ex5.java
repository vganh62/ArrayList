package Lecture7;

import java.util.ArrayList;
import java.util.Random;

public class Ex5 {

    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100) + 1;
            listNumber.add(number);
        }
        System.out.println("Initial list: ");
        System.out.println(listNumber);
        if (listNumber.size() > 3) {
            listNumber.remove(3);
            System.out.println("Remove the number at index 3 and print the updated list: ");
            System.out.println(listNumber);
        }
    }
}
