package interview;

public class DeretGeometri {
    public static void main(String [] args) {
        // Barisan geometri adalah barisan bilangan yang mempunyai rasio tetap antara dua suku barisan yang berurutan.
        // Un = ar^(n-1)
        // r = Un / Un-1
        int deret[] = {1,4,12,28,60,124,252};
        // 3, 8, 16, 32, 64, 128, 256
        int r = deret[6] / deret[6-1];
        int ar = deret[0] * r;
        int n = 7;
        int sqrt = n - 1;
        double U7 = Math.pow(ar, sqrt);
        System.out.println("Rasio dari deret tersebut adalah "+r);
        System.out.println("Suku ke-7 dari deret tersebut adalah "+(int)U7);
    }
}
