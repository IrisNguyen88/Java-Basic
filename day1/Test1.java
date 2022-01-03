package day1;

public class Test1 {
    public static void main(String[] args) {
        Car BMW = new Car ();
        BMW.Brand = "BMW";
        BMW.License = "I1234568";
        BMW.NumberOfWheels = 4;
        BMW.NumberOfSeats = 4;

        System.out.println(BMW.Brand);
        System.out.println(BMW.License);
        System.out.println(BMW.NumberOfWheels);
        System.out.println(BMW.NumberOfSeats);

        swap1 (2,3);
        swap2(2, 3);
    };

    public static void swap1 (int x, int y) {
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    };

    public static void swap2 (int x, int y) {
        System.out.println("x = " + y);
        System.out.println("y = " + x);
    };
}

