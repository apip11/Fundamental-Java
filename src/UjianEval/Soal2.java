package UjianEval;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

    public int n = uang();

    public int uang() {
        Scanner input = new Scanner(System.in);
        System.out.println("Uang anda :");
        int uang = input.nextInt();
        return uang;
    }

    public int[] getKacamata() {
        Scanner input = new Scanner(System.in);
        int[] hargaKacamata = new int[3];
        for (int n = 0; n < hargaKacamata.length; n++) {
            System.out.print("Harga Kacamata" + " " + n + " " + "=" + " ");
            hargaKacamata[n] = input.nextInt();
        }
        return hargaKacamata;
    }

    public int[] getBaju() {
        Scanner input = new Scanner(System.in);
        int[] hargaBaju = new int[3];
        for (int n = 0; n < hargaBaju.length; n++) {
            System.out.print("Harga Baju" + " " + n + " " + "=" + " ");
            hargaBaju[n] = input.nextInt();
        }
        return hargaBaju;
    }
    public void cetakan() {
        int[] kacamata = getKacamata();
        int[] baju = getBaju();
        System.out.print("uang anda:");
        System.out.println(n);
        System.out.print("kacamata");
        System.out.println(Arrays.toString(kacamata));
        System.out.print("baju");
        System.out.println(Arrays.toString(baju));
    }

    public static void main(String[] args) {
        Soal2 hasil = new Soal2();
        hasil.cetakan();
    }
}
