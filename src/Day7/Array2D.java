package Day7;

import java.util.Scanner;

public class Array2D {

    public void array2D() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai N = ");
        int n = input.nextInt();
        int[][] arrInt = new int[n][n];
        char num = '*';
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt.length; j++) {
                arrInt[i][j] = num;
                System.out.printf("%3s", num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array2D hasil = new Array2D();
        hasil.array2D();
    }
}