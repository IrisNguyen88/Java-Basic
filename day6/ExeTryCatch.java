package day6;

public class ExeTryCatch {
    public static void main (String [] args) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        try {
            int a[] = null;
            System.out.println(a.length);
        }catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        }catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } finally {
            System.out.println("Finally block is always excuted");
        }
    }
}
