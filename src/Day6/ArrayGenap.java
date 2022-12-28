package Day6;

import java.util.Scanner;

public class ArrayGenap {
    public void arrayGenap() {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Nilai :");
        a = input.nextInt();

        int[] array = new int[a];

        System.out.println("Bilangan Genap :");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) * 2 + " ");
        }
    }
}
