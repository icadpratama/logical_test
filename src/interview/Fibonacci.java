package interview;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Menampilkan bilangan fibonacci");
        System.out.print("n: ");
        /**
         * f(n) = f(n-1) + f(n-2)
         */
        int n = scan.nextInt();

        int fib[] = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < n;i++){
            System.out.print(fib[i] + " ");
        }

        System.out.println();
        System.out.println("Menampilkan bilangan fibonacci deret ke-n");
        int deret = fib[n-1];
        System.out.println("Bilangan fibonacci pada deret ke-" + n + " adalah " + deret);


        System.out.println("Deret ke-n dengan panjang karakter 4");
        String intToString = "";
        intToString = String.valueOf(deret);
        int panjangKarakter = intToString.length();

        do {
            fibonacci(n++);
            System.out.println("Panjang karakter "+intToString);
        } while (panjangKarakter == 4);

        System.out.println("Recursive");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n -2);
    }

}
