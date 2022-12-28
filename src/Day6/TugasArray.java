package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class TugasArray {
    Scanner input = new Scanner(System.in);

    private int getN() {
        System.out.println("Nilai N = ");
        int n;
        n = input.nextInt();
        return n;
    }

    private void pertama(int n) {
        int[] arrInt = new int[n];
        int num = 0;
        int med = n / 2;
        for (int i = 0; i < arrInt.length; i++) {
            if (n % 2 == 1) {
                if (i <= med) {
                    arrInt[i] = num + 1;
                    num = num + 1;
                } else {
                    arrInt[i] = num - 1;
                    num = num - 1;
                }
            } else {
                if (i < med) {
                    arrInt[i] = num + 1;
                    num = num + 1;
                } else {
                    arrInt[i] = num;
                    num = num - 1;
                }
            }
        }
        System.out.println("Bilangan Pertama = " + Arrays.toString(arrInt));
        System.out.println();
    }

    private void kedua(int n) {
        int[] arrInt = new int[n];
        int num1 = 0;
        int num2 = 1;
        int med = n / 2;
        int fibo;
        for (int i = 0; i < arrInt.length; i++) {
            if (n % 2 == 1) {
                if (i <= med) {
                    arrInt[i] = num2;
                    fibo = num1 + num2;
                    num1 = num2;
                    num2 = fibo;
                } else {
                    fibo = num2 - num1;
                    num2 = num1;
                    num1 = fibo;
                    arrInt[i] = num1;
                }
            } else {
                if (i < med) {
                    arrInt[i] = num2;
                    fibo = num1 + num2;
                    num1 = num2;
                    num2 = fibo;
                } else {
                    fibo = num2 - num1;
                    num2 = num1;
                    num1 = fibo;
                    arrInt[i] = num2;
                }
            }
        }
        System.out.println("Bilangan Fibo = " + Arrays.toString(arrInt));
        System.out.println();
    }

    private void ketiga(int n) {
        String[] arrStr = new String[n];
        char num = '@';
        int med = n / 2;
        for (int i = 0; i < arrStr.length; i++) {
            if (n % 2 == 1) {
                if (i <= med) {
                    num = ++num;
                    arrStr[i] = String.valueOf(num);
                } else {
                    num = --num;
                    arrStr[i] = String.valueOf(num);
                }
            } else {
                if (i < med) {
                    num = ++num;
                    arrStr[i] = String.valueOf(num);
                } else {
                    arrStr[i] = String.valueOf(num);
                    num = --num;
                }
            }
        }
        System.out.println("Bilangan Alpabet = " + Arrays.toString(arrStr));
        System.out.println();
    }

    private void keempat(int n) {
        String[] arrStr = new String[n];
        char num1 = '@';
        int num2 = 0;
        int med = n / 2;
        for (int i = 0; i < arrStr.length; i++) {
            if (n % 2 == 1) {
                if (i <= med) {
                    if (i % 2 == 0) {
                        num1 = ++num1;
                        arrStr[i] = String.valueOf(num1);
                    } else {
                        num2 = num2 + 1;
                        arrStr[i] = String.valueOf(num2);
                    }
                } else {
                    if (i % 2 == 0) {
                        arrStr[i] = String.valueOf(num1);
                        num1 = --num1;
                    } else {
                        num2 = num2 - 1;
                        arrStr[i] = String.valueOf(num2);
                    }
                }
            } else {
                if (i < med) {
                    if (i % 2 == 0) {
                        num1 = ++num1;
                        arrStr[i] = String.valueOf(num1);
                    } else {
                        num2 = num2 + 1;
                        arrStr[i] = String.valueOf(num2);
                    }
                } else {
                    if (i % 2 == 1) {
                        arrStr[i] = String.valueOf(num1);
                        num1 = --num1;
                    } else {
                        arrStr[i] = String.valueOf(num2);
                        num2 = num2 - 1;
                    }
                }
            }
        }
        System.out.println("Bilangan Campur = " + Arrays.toString(arrStr));
        System.out.println();
    }

    public void pilihan() {
        int n = getN();
        pertama(n);
        kedua(n);
        ketiga(n);
        keempat(n);
    }

    public static void main(String[] args) {
        TugasArray hasil = new TugasArray();
        hasil.pilihan();
    }
}