package Day4;

import java.util.Scanner;

public class Bintang1 {
    public void bintang() {
        int n;
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai :");
        n = input.nextInt();
        for (a = 0; a < n; a++) {
            System.out.println();

            for (b = 0; b < n; b++) {
                System.out.print(" * ");
            }
        }
    }
}