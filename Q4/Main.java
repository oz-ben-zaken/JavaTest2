package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers");
        int x, n;
        System.out.print("x: ");
        x = scan.nextInt();
        System.out.print("n: ");
        n = scan.nextInt();

        System.out.println("the returned value is: " + f(x, n));
    }

    public static double f(int x, int n) {
        double fun = 0;
        int siman = -1;
        for (int i = 1; i <= n; i++) {
            fun = fun + siman * Math.pow(x, 2 * i) / atzert(i);
            siman = -1 * siman;
        }

        return fun;
    }

    public static int atzert(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }
}
