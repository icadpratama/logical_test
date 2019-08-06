package interview;

public class DeretAritmetika2 {
    public static void main(String [] args) {
        System.out.println("Soal nomor 1");
        /**
         * Tentukan nilai x jika suku-suku barisan x – 1, 2x – 8, 5 – x merupakan suku-suku deret geometri.
         * U1 = x - 1 = 4
         * U2 = 2x - 8 = 2
         * U3 = 5 - x = 0
         */

        /**
         * Dari suatu deret aritmetika diketahui bahwa suku keempatnya adalah 38 dan suku kesepuluhnya adalah 92. Tentukan:
         * a. beda deret aritmatika tersebut,
         * b. suku ketujuh deret aritmetika tersebut.
         */

        // a. Um = Un + (m-n) * b

        System.out.println("Soal nomor 2");
        int Um = 38;
        int Un = 92;
        int n = 10;
        int m = 4;

        int b = (Um - Un) / (m - n);
        System.out.println("beda deret aritmatika tersebut "+b);
        m = 7;
        int U7 = Un + (m-n) * b;
        System.out.println("suku ketujuh deret aritmetika tersebut adalah " + U7);
    }

}
