package dsa_08_2d_array;

import java.util.Scanner;

public class L01_InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first dimesion is compulsory
        int[][] a = new int[3][4];
        int[][] b = new int[3][4];

        // taking input row-wise
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // taking input column-wise
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                b[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // outputting row-wise
        System.out.println("row wise input");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }

        System.out.println("column wise input");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%2d ", b[i][j]);
            }
            System.out.println();
        }

    }
}
