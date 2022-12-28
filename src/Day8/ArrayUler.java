package Day8;

import java.util.Scanner;

public class ArrayUler {
    public int getN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai :");
        int n = input.nextInt();
        return n;
    }

    public void arrayUler() {
        int n = getN();
        char num = '*';
        int[][] arrInt = new int[n][n];
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt.length; j++) {
                arrInt[i][j] = num;
                if (i % 2 == 0) {
                    System.out.printf("%3s", num);
                } else if (i % 4 == 1 && j == n - 1) {
                    System.out.printf("%3s", num);
                } else if (i % 4 == 3 && j == 0) {
                    System.out.printf("%3s", num);
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayUler hasil = new ArrayUler();
        hasil.arrayUler();
    }
}