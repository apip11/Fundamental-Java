package Day9;

import java.util.Scanner;

public class Kuis1 {
    public int getN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai :");
        int n = input.nextInt();
        input.close();
        return n;
    }

    public int[] fibo(int n) {
        int[] arrFibo = new int[n];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for (int i = 2; i < n; i++) {
            arrFibo[i] = arrFibo[i - 1] + arrFibo[i - 2];
        }
        return arrFibo;
    }
    public void polaSilang(){
        int n = getN();
        int[] arrFibo = fibo(n);
        int hasil;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    hasil = arrFibo[i];
                    System.out.printf("%3s", hasil);
                } else if (i + j == n - 1) {
                    hasil = arrFibo[j];
                    System.out.printf("%3s", hasil);
                } else if (i <= n / 2 && i + j < n && i < j) {
                    System.out.printf("%3s", "A");
                } else if (j >= n - i && i < j) {
                    System.out.printf("%3s", "B");
                } else if (i + j < n && i > j) {
                    System.out.printf("%3s", "D");
                } else {
                    System.out.printf("%3s", "C");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Kuis1 a = new Kuis1();
        a.polaSilang();
    }
}
