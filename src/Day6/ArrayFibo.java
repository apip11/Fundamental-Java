package Day6;

import java.util.Scanner;

public class ArrayFibo {
    public void arrayFibo() {
        Scanner input = new Scanner(System.in);
        int a;
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.println("Nilai :");
        a = input.nextInt();

        int[] array = new int[a];

        System.out.println("Array Fibo :");
        System.out.printf(n1 + " " + n2);
        for (int i = 2; i < array.length; i++) {
            n3 = n1 + n2;
            System.out.printf(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
