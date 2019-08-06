package interview;

public class Peluang1 {
    /**
     * IPA = 60
     * Matematika = 90
     * Bahasa = 120
     * Siswa = 280
     */

    public static void main(String [] args) {
        double ipa = 60;
        double matematika = 90;
        double bahasa = 120;
        double totalSiswa = 280;
        double kesenian = 360 - ipa - matematika - bahasa;

        double totalIpa = Math.round(ipa/360 * totalSiswa);
        double totalMatematika = Math.round(matematika/360 * totalSiswa);
        double totalBahasa = Math.round(bahasa/360 * totalSiswa);
        double totalKesenian = Math.round((kesenian/360) * totalSiswa);

        System.out.println((int) totalIpa);
        System.out.println((int) totalMatematika);
        System.out.println((int) totalBahasa);
        System.out.println((int) totalKesenian);
    }
}
