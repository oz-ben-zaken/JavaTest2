package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long old, newID = 0, lastDigit, indexToInsert;

        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you name and your ID number\n");
        System.out.print("Name: ");
        name = scan.next();
        System.out.print("ID: ");
        old = scan.nextInt();

        lastDigit = old % 10;
        indexToInsert = old / 10 % 10;

        for (int i = 0; i < indexToInsert; i++) {
            newID = newID + (old % 10) * (int) Math.pow(10, i);
            System.out.println(newID);
            old = old / 10;
        }

        newID = newID + (lastDigit) * (int) Math.pow(10, indexToInsert);

        while (old > 0) {
            indexToInsert++;
            newID = newID + (old % 10) * (int) Math.pow(10, indexToInsert);
            System.out.println(newID);
            old = old / 10;
        }
        System.out.println(name);
        System.out.println(newID);

    }
}
