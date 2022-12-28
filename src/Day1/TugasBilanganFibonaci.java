package Day1;

import java.util.Scanner;

public class TugasBilanganFibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        System.out.println("Nilai :");
        count = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.printf(n1 + " " + n2);
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.printf(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}