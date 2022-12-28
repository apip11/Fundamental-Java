package Day5;

import java.util.Scanner;

public class TugasUler5 {
    public int getN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai :");
        int n = input.nextInt();
        return n;
    }

    public void tugasUler5() {
        int n = getN();
        int k = (n - 1) * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (i% (n - 1) == 0) {
                    System.out.printf("%3s", "*");
                } else {
                    if (j % (n - 1) == 0) {
                        System.out.printf("%3s", "*");
                    } else {
                        System.out.printf("%3s", " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TugasUler5 hasil = new TugasUler5();
        hasil.tugasUler5();
    }
}