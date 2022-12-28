package Day9;

import java.util.Scanner;

public class LatihanKuis {
    public int getN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai N :");
        int n = input.nextInt();
        input.close();
        return n;
    }

    public String[][] kerangka() {
        int n = getN();
        String[][] array = new String[n][n];
        if (n % 2 == 0) {
            System.out.println("Nilai N = Harus Ganjil");
        } else {
            isiKerangka(array);
        }
        return array;
    }

    public void isiKerangka(String[][] arrStr) {
        String[] polaSpasi = IsianFiboci.polaFiboSpasi(arrStr.length);
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                if (i <= j && i <= arrStr.length / 2 && i + j <= arrStr.length - 1) {
                    arrStr[i][j] = polaSpasi[i];
                } else if (i < j && j > arrStr.length / 2 && i + j > arrStr.length - 1) {
                    arrStr[i][j] = polaSpasi[arrStr.length - 1 - j];
                } else if (i >= j && i > arrStr.length / 2 && i + j >= arrStr.length - 1) {
                    arrStr[i][j] = polaSpasi[arrStr.length - 1 - i];
                } else {
                    arrStr[i][j] = polaSpasi[j];
                }
            }
        }
    }
    public void cetakKerangka() {
        String[][] array = kerangka();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%3s", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LatihanKuis hasil = new LatihanKuis();
        hasil.cetakKerangka();
    }
}
