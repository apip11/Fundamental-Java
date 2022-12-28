package Day4;

import java.util.Scanner;

public class DeretCampur {
    public void deretCampur() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai : ");
        int n = sc.nextInt();

        String[] loc = new String[n];

        for (int kol = 0; kol < loc.length; kol++) {
            loc[kol] = String.valueOf(kol + 1);
        }

        int count = 0;
        int count2 = 10;
        for (int kol = 0; kol < loc.length; kol++) {
            if (Integer.parseInt(loc[kol]) % 2 == 0) {
                int radix = 16;
                loc[kol] = (String.valueOf(Character.forDigit(count2, radix))).toUpperCase();
                count2++;
            } else {
                loc[kol] = String.valueOf(count + 1);
                count++;
            }
        }
        for (int kol = 0; kol < loc.length; kol++) {
            System.out.print(loc[kol]);
        }
    }
}