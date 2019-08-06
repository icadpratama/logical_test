package interview;

public class DeretAritmetika {
    public static void main (String [] args) {
        System.out.println("Soal nomor 1");
        // dik
        int aritmetika[] = {3, 7, 11, 15, 19};

        /**
         * dit:
         * a. suku kesepuluh (U10) deret tersebut,
         * b. jumlah sepuluh suku pertama (S10).
         */

        /**
         * penyelesaian
         */

        // U(n) = a+(n-1)b
        int a = aritmetika[0];
        int b = aritmetika[1] - aritmetika[0];
        int n = 10;
        int Un = a + (n-1) * b;
        System.out.println("suku kesepuluh (U10) deret tersebut adalah "+Un);
        System.out.println("jumlah sepuluh suku pertama (S10) adalah " + penjumlahanDeret(n, a, Un));


        System.out.println("\nSoal nomor 2");
        /**
         * Diketahui suatu deret aritmetika dengan suku pertama 10 dan suku keenam 20.
         * a. Tentukan beda deret aritmetika tersebut.
         * b. Tuliskan deret aritmetika tersebut.
         * c. Tentukan jumlah enam suku pertama deret aritmetika tersebut.
         */
        int U6 = 20;
        n = 6;
        a = 10;
        b = (U6-a)/(n-1);
        System.out.println("beda deret aritmetika tersebut adalah "+b);

        System.out.print(n + " deret aritmetika tersebut adalah ");
        int deret = a;
        for (int i = 0; i < n; i++) {
            deret = deret + b;
            System.out.print(deret + " ");
        }

        System.out.println("\njumlah enam suku pertama deret aritmetika tersebut adalah " + penjumlahanDeret(n, a, U6));
    }

    public static int penjumlahanDeret(int n, int a, int u){
        int hasil;
        // Sn = n/2 (a+Un)
        hasil = (n/2) * (a + u);
        return hasil;
    }
}
