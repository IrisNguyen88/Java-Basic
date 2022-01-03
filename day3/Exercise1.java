package day3;

public class Exercise1 {
    public static void main (String [] args) {
        printEven ();
    };
    public static void printEven () {
        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
