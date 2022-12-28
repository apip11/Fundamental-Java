package Latihan;

import java.util.Scanner;

public class FizzBuzz {
    public int getN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai N");
        int n = input.nextInt();
        input.close();
        return n;
    }

    public void fizzBuzz() {
        int n = getN();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz hasil = new FizzBuzz();
        hasil.fizzBuzz();
    }
}
