package interview;

public class PanjangKarakterFib {
    public static void main (String[] args){
        int n = 1;
        String character = "";
        int panjangKarakter = 0;
        int lastData = 0;
        do {
            lastData = Fibonacci.fibonacci(n);
            character = String.valueOf(lastData);
            panjangKarakter = character.length();
            n++;
        } while(panjangKarakter<4);
        System.out.println(character);
    }
}
