package Day4;

import java.util.Scanner;

public class DeretAngka {
    public void deretAngka() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai :");
        int a;
        int b = 0;
        int c = 0;
        a = input.nextInt();
        for (int d = 0; d < a; d++) {
            if (d % 2 == 0) {
                b = b + 2;
                System.out.print(b + " ");
            } else {
                c = c + 3;
                System.out.print(c + " ");
            }
        }
    }
}
