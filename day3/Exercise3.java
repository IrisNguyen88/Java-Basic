package day3;

public class Exercise3 {
    public static void main (String [] args) {
        print35 ();
    };
    public static void print35 () {
        for(int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) & (i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}
