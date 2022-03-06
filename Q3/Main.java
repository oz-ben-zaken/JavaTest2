package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Thread> treads = new ArrayList<Thread>();
        double first, second;
        char operator='\n';
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the two numbers");
        System.out.print("first number: ");
        first = scanner.nextInt();
        System.out.print("second number: ");
        second = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    operator = '+';
                    break;
                case 1:
                    operator = '-';
                    break;
                case 2:
                    operator = '*';
                    break;
                case 3:
                    operator = '/';
                    break;
            }
            treads.add(new Thread(new CalcT(first, operator, second)));
            treads.get(i).start();
        }

        for (int i = 0; i < 4; i++) {
            try {
                treads.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Done");
    }
}
