package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHuruf {
    public void arrayHuruf() {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Nilai :");
        a = input.nextInt();

        String[] array = new String[a];
        System.out.println("Array Huruf :");
        char n = 'A';
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(n);
            n = ++n;
        }
        System.out.println(Arrays.toString(array));
    }
}