package Day6;

import java.util.Scanner;

public class ArrayTribo {
    public void arrayTribo() {
        Scanner input = new Scanner(System.in);
        int k;
        System.out.println("Nilai :");
        k = input.nextInt();
        int a = 1, b = 1, c = 1;
        int d = a + b + c;

        System.out.println("Array Tribo :");
        System.out.print(a + " " + b + " " + c);
        for (int i = 4; i <= k; i++) {
            System.out.print(" " + d);
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
    }
}
