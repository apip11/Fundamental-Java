package Day1;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menampilkan Nilai Sesuai N");
        System.out.println("--------------------------");
        System.out.println();

        int n, i;
        int num;

        System.out.print("Jumlah yang diinginkan: ");
        n = input.nextInt();
        System.out.println();

        for (i = 1; i <= n; i++) {
            num = i % 2 == 1 ? 0 : 1;
            System.out.print(num + " ");
        }
        System.out.println();
    }
}