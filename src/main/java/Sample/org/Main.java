package Sample.org;

public class Main {
    public static void main(String[] args) {
        System.out.println("");

    }

    public static void Square ( int number )
    {
        int square = number * number;
        +square
        System.out.println(“Method with Integer Argument Called:“+square);
    }
    public static void Square(double number)
    {
        double square = number * number;
        System.out.println(“Method with double Argument Called:“+square);
    }
    public static void Square(long number)
    {
        long square = number * number;
        System.out.println(“Method with long Argument Called:“+square);
    }

}