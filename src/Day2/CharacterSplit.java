package Day2;

import java.util.Scanner;

public class CharacterSplit {
    public static final int ASCII_0 = 48;

    public static void pilihan() {
        System.out.println("Input Kalimat: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("[1] Menampilkan Jumlah Kata :");
            System.out.println("[2] Menampilkan Total Karakter :");
            System.out.println("[3] Menampilkan Jumlah Karakter Vocal :");
            System.out.println("[4] Menampilakn Hasil :");
            System.out.println("[5] Exit");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Jumlah kata: " + jumlahKata(str1));
                    break;
                case 2:
                    System.out.println("Jumlah total karakter: " + jumlahChar(str1));
                    break;
                case 3:
                    System.out.println("Jumlah karakter Vocal: " + jumlahVocal(str1));
                    break;
                case 4:
                    System.out.println("Hasil: " + nomorString(str1));
                    break;
                default:
                    System.out.println("Get The Fuck Out Of Here");
                    break;
            }
        }
    }

    public static int jumlahKata(String str1) {
        int count = 0;
        String[] arrKata = str1.split(" ");
        for (int i = 0; i < arrKata.length; i++) {
            if (arrKata[i].equalsIgnoreCase("") ||
                    arrKata[i].equalsIgnoreCase(" ")) {
            } else {
                count++;
            }
        }
        return count;
    }

    public static int jumlahChar(String str1) {
        int count = 0;
        String[] arrChar = str1.split("");
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i].equalsIgnoreCase(" ")) {
            } else {
                count++;
            }
        }
        return count;
    }

    public static int jumlahVocal(String str1) {
        int count = 0;
        String[] arrChar = str1.split("");
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i].equalsIgnoreCase("a") || arrChar[i].equalsIgnoreCase("i") ||
                    arrChar[i].equalsIgnoreCase("u") || arrChar[i].equalsIgnoreCase("e") ||
                    arrChar[i].equalsIgnoreCase("o") || arrChar[i].equalsIgnoreCase("A") ||
                    arrChar[i].equalsIgnoreCase("I") || arrChar[i].equalsIgnoreCase("U") ||
                    arrChar[i].equalsIgnoreCase("E") || arrChar[i].equalsIgnoreCase("O")) {
                arrChar[i] = Integer.toString(count++);
            }
        }
        return count;
    }

    public static String nomorString(String str1) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = Character.toLowerCase(str1.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                StringBuilder sb = new StringBuilder(str1);
                sb.setCharAt(i, (char) (count + 1 + ASCII_0));
                str1 = sb.toString();
                count = (count + 1) % 10;
            }
        }
        return str1;
    }
    public static void main(String[] args) {

        pilihan();
    }

}