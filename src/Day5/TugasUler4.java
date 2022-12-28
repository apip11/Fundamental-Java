package Day5;

import java.util.Scanner;

public class TugasUler4 {
    public int getN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai :");
        int n = input.nextInt();
        return n;
    }

    public void tugasUler4() {
        int n = getN();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 1 && j + i >= n - 1) {
                    System.out.printf("%3s", "*");
                } else if (i % 2 == 0 && j <= i) {
                    System.out.printf("%3s", "*");
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TugasUler4 hasil = new TugasUler4();
        hasil.tugasUler4();
    }
}