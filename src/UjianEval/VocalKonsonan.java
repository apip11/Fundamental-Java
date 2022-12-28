package UjianEval;

import java.util.Scanner;

public class VocalKonsonan {
    public int getN(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input :");
        int x = input.nextInt();
        return x;
    }



    public static void main(String[] args) {
        VocalKonsonan hasil = new VocalKonsonan();
        hasil.getN();
    }
}