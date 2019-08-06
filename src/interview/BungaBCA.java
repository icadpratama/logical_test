package interview;

public class BungaBCA {
    /**
     *  < Rp 1.000.000	                        0,00
     *  >= Rp 1.000.000 - < Rp 50.000.000	    0,35
     *  >= Rp 50.000.000 - < Rp 500.000.000	    0,50
     *  >= Rp 500.000.000 - < Rp 1.000.000.000	0,75
     * >= Rp 1.000.000.000	                    1,30
     */

    public static void main(String [] args) {
        /**
         * Tentukanlah besar bunga tunggal yang diterima Ibu Sumiati jika ia menabung uangnya sebesar Rp20.000.000,00
         * selama 5 tahun!
         *
         * M = 20.000.000
         * t = 5 th
         * Ditanya besar bunga tunggal...?
         */

        double M = 100000000;
        double t = 5;
        double b = 0;

        if (M < 1000000) {
            b = 0;
        } else if (M >= 1000000 &&  M < 50000000) {
            b = 0.35;
        } else if (M >= 50000000 &&  M < 500000000) {
            b = 0.50;
        } else if (M >= 500000000 &&  M < 1000000000) {
            b = 0.75;
        } else if (M > 1000000000) {
            b = 1.30;
        }

        float B = (float) M * (float) t * (float) (b*12);
        System.out.println((long) B);

        /**
         * < Rp 1.000.000	0,00
         * >= Rp 1.000.000	0,35
         */

        System.out.println("Tahapan Expresi");
        M = 10000000;
        t = 5;

        if (M < 1000000) {
            b = 0.0;
        } else if (M > 1000000) {
            b = 0.35;
        }

        B = (float) M * (float) t * (float) b;
        float tabungan = ((float) (M * t) + B) - ((float) t * 5000);
        System.out.println((long) tabungan);

    }
}
