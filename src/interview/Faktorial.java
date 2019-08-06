package interview;

import java.util.Scanner;
public class Faktorial {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = scan.nextInt();
        System.out.println(fact(n));

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
            System.out.print(i + "x");
        }
        System.out.print("\b=");
        System.out.println(hasil);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }
}
