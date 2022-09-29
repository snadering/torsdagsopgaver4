package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int age;
        int res;

        System.out.println("Please type your name.");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Please type your age");
        age = scanner.nextInt();
        System.out.println(age);
        res = 67-age;
        System.out.println("You can retire in " + res + " years.");
    }
}
