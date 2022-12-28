package Day4;

import java.util.Scanner;

public class TugasUler3 {
    public int getN() {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukka Nilai N");
        int n = s.nextInt();
        return n;
    }

    public void cetakKerangka() {
        int n = getN();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%3s", "*");
                } else if (i % 4 == 1 && j == n - 1) {
                    System.out.printf("%3s", "*");
                } else if (i % 4 == 3 && j == 0) {
                    System.out.printf("%3s", "*");
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            System.out.println();
        }
    }

    public void cetakKerangkaAngka() {
        int n = getN();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (i % 4 == 2) {
                c = c + n;
            }
            for (int j = 0; j < n; j++) {
                if (i % 4 == 0) {
                    System.out.printf("%3d", ++c);
                } else if (i % 4 == 1 && j == n - 1) {
                    System.out.printf("%3d", ++c);
                } else if (i % 4 == 2) {
                    System.out.printf("%3d", c--);
                } else if (i % 4 == 3 && j == 0) {
                    System.out.printf("%3d", ++c);
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            if (i % 4 == 2) {
                c = c + n;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TugasUler3 l = new TugasUler3();
        l.cetakKerangkaAngka();
    }
}