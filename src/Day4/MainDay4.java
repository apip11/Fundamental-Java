package Day4;

import java.util.Scanner;

public class MainDay4 {
    public static void main(String[] args) {
pilihan();
    }
    public static void pilihan() {
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("[1] Bintang 1");
            System.out.println("[2] Bintang X");
            System.out.println("[3] Deret Angka");
            System.out.println("[4] Deret Campur");
            System.out.println("[5] Exit");
            pilihan = sc.nextInt();
            switch (pilihan) {
                    case 1:
                        Bintang1 bintang1 = new Bintang1();
                        bintang1.bintang();
                        break;
                    case 2:
                        BintangX bintangX = new BintangX();
                        bintangX.pola();
                        break;
                    case 3:
                        DeretAngka deretAngka = new DeretAngka();
                        deretAngka.deretAngka();
                        break;
                    case 4:
                        DeretCampur deretCampur = new DeretCampur();
                        deretCampur.deretCampur();
                        break;
                    default:
                        System.out.println("Get The Fuck Out Of Here");
                        break;
                }
            System.out.println();
            }
        }
    }