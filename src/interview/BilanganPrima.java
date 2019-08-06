package interview;

import java.util.Scanner;

public class BilanganPrima {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scan.nextInt();

        for (int i = 2; i <= number ; i++) {
            int mod = 1;

            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    mod = 0;
                }
            }

            if (mod == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(checkPrime(number));
    }

    public static boolean checkPrime(int number) {
        boolean isPrime = true;

        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime && ((number > 0)&&(number != 1))) {
            return true;
        } else {
            return false;
        }
    }
}
