package Day9;

public class IsianFiboci {
    public static int[] getFibo(int n) {
        int[] arrFibo = new int[n];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i - 1] + arrFibo[i - 2];
        }
        return arrFibo;
    }

    public static String[] getString(int n) {
        int[] arrFibo = getFibo(n);
        String[] arrString = new String[n];
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = String.valueOf(arrFibo[i]);
        }
        return arrString;
    }

    public static String[] polaFiboSpasi(int n) {
        int[] arrFibo = getFibo(n);
        String[] arrSpasi = new String[n];
        char num = 'A';
        for (int j = 0; j < arrFibo.length; j++) {
            if (j % 2 == 0) {
                arrSpasi[j] = String.valueOf(arrFibo[j / 2]);
            } else {
//                arrSpasi[j] = " ";
                arrSpasi[j] = String.valueOf(num);
                num++;
            }
        }
        return arrSpasi;
    }

}
