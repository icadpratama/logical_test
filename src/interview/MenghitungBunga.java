package interview;

public class MenghitungBunga {
    /**
     * Tentukanlah besar bunga tunggal yang diterima Ibu Sumiati jika ia menabung uangnya sebesar Rp20.000.000,00
     * selama 5 tahun, apabila bunga tunggal yang diberikan bank sebesar 5% setahun!
     *
     * M = 20.000.000
     * t = 5 th
     * b = 5%
     * Ditanya besar bunga tunggal...?
     */

    public static void main(String [] args) {
        double B;
        double M = 20000000;
        double t = 5;
        double b = 0.05;
        B = M * t * b;
        System.out.println("Besar bunga tunggal adalah " +  (int) B);
    }
}
