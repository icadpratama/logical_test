package interview;

public class Permutasi {
    public static void main(String [] args) {
        // Banyak cara untuk memilih seorang ketua, sekertaris dan bendahara dari 8 siswa yang tersedia adalah
        long n = 8;
        long r = 3;
        long permutasi = faktorial(n)/faktorial(n-r);

        System.out.println(faktorial(18));
        System.out.println("Cara memilih adalah " + permutasi);

        // Banyak cara untuk memilih 18 jenis kartu kredit BCA dari 10 nasabah adalah
        n = 18;
        r = 10;
        permutasi = faktorial(n)/faktorial(n-r);
        System.out.println("Cara memilih adalah " + permutasi);
    }

    public static long faktorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * faktorial(n-1);
    }
}
