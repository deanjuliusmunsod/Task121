import static java.lang.Math.*;

public class Task121 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        // Using floorDiv for integer division
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Demonstrating the math operations
        System.out.println("Addition: " + a + " + " + b + " = " + add(a, b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + subtract(a, b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + multiply(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + divide(a, b));
    }
}

