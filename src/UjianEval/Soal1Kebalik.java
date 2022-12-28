package UjianEval;

import java.util.Arrays;
import java.util.Scanner;

public class Soal1Kebalik {
    public int getN() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nilai :");
        n = input.nextInt();
        input.close();
        return n;
    }

    public int[] fibo() {
        int n = getN();
        int[] arrFibo = new int[n];
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Array Fibo :");
        for (int i = 0; i < arrFibo.length; i++) {
            if (i < n) {
                arrFibo[i] = n2;
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            } else {
                n3 = n2 - n1;
                n2 = n;
                n1 = n3;
                arrFibo[i] = n1;
            }
        }
        System.out.println(Arrays.toString(arrFibo));
        return arrFibo;
    }

    public void kebalik() {
        int[] arrKebalik = fibo();
        int kebalik = 0;
        for (int i = 0; i < arrKebalik.length; i++) {
            for (int j = 0; j < arrKebalik.length; j++) {
                if (arrKebalik[i] > arrKebalik[j]) {
                    kebalik = arrKebalik[i];
                    arrKebalik[i] = arrKebalik[j];
                    arrKebalik[j] = kebalik;
                }
            }
        }
        System.out.println(Arrays.toString(arrKebalik));
    }

    public static void main(String[] args) {
        Soal1Kebalik hasil = new Soal1Kebalik();
        hasil.kebalik();
    }
}