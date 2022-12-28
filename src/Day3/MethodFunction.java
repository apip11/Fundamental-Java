package Day3;

import java.util.Scanner;

import Day2.CharacterSplit;
import Day1.TugasBilanganGenapGanjil;
import Day1.TugasBilanganFibonaci;

public class MethodFunction {
    public static void main(String[] args) {

        pilihan();
    }

    public static void pilihan() {
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("[1] Character Split :");
            System.out.println("[2] Bilangan Genap Ganjil :");
            System.out.println("[3] Bilangan Fibonaci :");
            System.out.println("[4] Exit");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    charSplit();
                    break;
                case 2:
                    genapGanjil();
                    break;
                case 3:
                    bilFibo();
                    break;
                default:
                    System.out.println("Get The Fuck Out Of Here");
                    break;
            }
        }
    }

    public static void charSplit() {
        CharacterSplit charSplit = new CharacterSplit();
        charSplit.main(null);
    }

    public static void genapGanjil() {
        TugasBilanganGenapGanjil genapGanjil = new TugasBilanganGenapGanjil();
        genapGanjil.main(null);
    }

    public static void bilFibo() {
        TugasBilanganFibonaci bilFibo = new TugasBilanganFibonaci();
        bilFibo.main(null);
    }
}