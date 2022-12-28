package Day1;

import java.util.Scanner;

public class TugasBilanganGenapGanjil {
    public static void main(String[] args) {
        pilihan();
    }

    public static void pilihan() {
        Scanner input = new Scanner(System.in);

        int p = 0;
        int b;
        while (p != 4) {
            System.out.println("Pilihan");
            System.out.println("1. Genap");
            System.out.println("2. Ganjil");
            System.out.println("3. Prima");
            p = input.nextInt();
            switch (p) {
                case 1:
                    System.out.print("Nilai b : ");
                    b = input.nextInt();
                    for (int i = 0; i < b; i++) {
                        System.out.print(i * 2 + " ");
                    }
                    break;
                case 2:
                    System.out.print("Nilai b : ");
                    b = input.nextInt();
                    for (int i = 0; i < b; i++) {
                        System.out.print((i * 2) + 1 + " ");
                    }
                    break;
                case 3:
                    System.out.print("Nilai b : ");
                    b = input.nextInt();
                    for (int a = 2; a <= b; a++) {
                        int mod = 1;
                        for (int c = 2; c < a; c++) {
                            if (a % c == 0) {
                                mod = 0;
                            }
                        }
                        if (mod == 1) {
                            System.out.print(a + " ");
                        }
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Get The Fuck Out Of Here");
                    break;
            }
        }
    }
}