package Day6;

import java.util.Scanner;

public class Array {
    public void pilihan() {
        Scanner input = new Scanner(System.in);
        int a;
        int temp;
        System.out.println("Nilai :");
        a = input.nextInt();

        int pilihan = 0;
        int[] array = new int[a];
        for (int n = 0; n < array.length; n++) {
            System.out.print("Nilai Input" + " " + n + " " + "=");
            array[n] = input.nextInt();
        }
        while (pilihan != 3) {
            System.out.println("==============MENU==============");
            System.out.println("[1] Urutan Dari Nilai Terkecil =");
            System.out.println("[2] Urutan Dari Nilai Terbesar =");
            System.out.println("[3] Exit");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Urutan Dari Nilai Terkecil =");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = array.length - 1; j > i; j--) {
                            if (array[j] < array[j - 1]) {
                                temp = array[j];
                                array[j] = array[j - 1];
                                array[j - 1] = temp;
                            }
                        }
                    }
                    for (int j = 0; j < array.length; j++) {
                        System.out.printf("%3s", array[j]);
                    }
                    break;
                case 2:
                    System.out.println("Urutan Dari Nilai Terbesar =");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = array.length - 1; j > i; j--) {
                            if (array[j] > array[j - 1]) {
                                temp = array[j];
                                array[j] = array[j - 1];
                                array[j - 1] = temp;
                            }
                        }
                    }
                    for (int j = 0; j < array.length; j++) {
                        System.out.printf("%3s", array[j]);
                    }
                    break;
                default:
                    System.out.println("Get The Fuck Out Of Here");
                    break;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array main = new Array();
        main.pilihan();
    }
}