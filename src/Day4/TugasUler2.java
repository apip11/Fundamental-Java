package Day4;

import java.util.Scanner;

public class TugasUler2 {
    public void tugasUler2() {
        int a = 0;
        int j = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Nilai : ");
        a = input.nextInt();

        while (i < a) {
            boolean isGenap = j % 2 == 0;
            int num = isGenap ? 0 : 1;
            int k = 0;

            while (k < a) {
                if (i % 2 == 0) {
                    System.out.printf("%3s", num);
                    num += 2;
                    if (k == a - 1) {
                        j++;
                    }
                } else if ((isGenap && k == 0) || (!isGenap & k == a - 1)) {
                    System.out.printf("%3s", "*");
                } else {
                    System.out.printf("%3s", " ");
                }
                k++;
            }
            i++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        TugasUler2 hasil = new TugasUler2();
        hasil.tugasUler2();
    }
}