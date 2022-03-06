package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a[][] = new int[10][10];
        int b[][] = new int[40][40];
        boolean isContained =false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first matrix values");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println("enter location i= " + i + " j= " + j);
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("enter the second matrix values");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println("enter location i= " + i + " j= " + j);
                b[i][j] = scanner.nextInt();
            }
        }


        System.out.println("checking if first matrix is inside of second matrix");
        for (int i = 0; i < b.length - a.length + 1; i++) {
            for (int j = 0; j < b.length - a.length + 1; j++) {
                if (b[i][j] == a[0][0]){
                    isContained =true;
                    for (int m = 0; i < a.length; i++) {
                        for (int n = 0; j < a.length; j++) {
                            if (b[i + m][j + n] != a[m][n]) {
                                isContained = false;
                                break;
                            }
                        }
                    }
                    if(isContained){
                        System.out.println("the first matrix is inside of the second matrix");
                        break;
                    }
                }
            }
        }

    }
}
