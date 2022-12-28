package Day4;

import java.io.DataInput;
import java.util.Scanner;

public class BintangX {
    public void pola() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai Dalam Bilangan Ganjil : ");
        int a = input.nextInt();
        int cetak[][] = new int[a][a];

        for (int b = 0; b < a; b++) {
            for (int k = 0; k < a; k++) {
                if (b == k || b + k == a - 1) {
                    cetak[b][k] = '*';
                } else {
                    cetak[b][k] = ' ';
                }
                System.out.print(cetak[b][k]);
            }
            System.out.println();
        }
    }
}