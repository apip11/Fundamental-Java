package Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayGanjil {
    public void arrayGanjil() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nilai :");
        n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Bilangan Ganjil :");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i * 2) + 1 + " ");
        }
    }
}