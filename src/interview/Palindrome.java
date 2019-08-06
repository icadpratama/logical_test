package interview;

public class Palindrome {
    public static String isPalindrome(String text){
        System.out.print("The word \""+text+"\" is ");
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);

            if (forwardChar != backwardChar) {
                return "not palindrome";
            }
        }
        return "palindrome";
    }

    public static boolean isPalindromes(String input){

        // Kata dibagi dua karena akan dibandingkan index pertama dari depan dan index pertama dari belakang
        // Program berulang sebanyak panjang kata dibagi dua
        for (int i = 0; i < input.length()/2; i++) {
            // Pengecekan karakter pertama dari depan yang dimulai dari index ke-0
            // Pengecekan karakter pertama dari belakang yang dimulai dari index ke-4
            // Pengecekan karakter kedua dari depan yaitu pada index ke-1
            // Pengecekan karakter kedua dari belakang yaitu pada index ke-3

            // Untuk mendapatkan index ke-3 dari belakang maka panjang dari "input" dikurangi 1
            // Dikurangi dengan "i" untuk mendapatkan index ketiga karena jika tidak menggunakan "i" maka program akan
            // terus membandingkan dengan index ke-4
            if (input.charAt(i) != input.charAt(input.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){

        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindromes("civic"));
    }
}
