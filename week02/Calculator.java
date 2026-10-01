public class Calculator {
    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static double divide(int a, int b) { return (double) a / b; }

    public static void main(String[] args) {
        System.out.println("Add: " + add(10, 5));
        System.out.println("Subtract: " + subtract(10, 5));
        System.out.println("Multiply: " + multiply(10, 5));
        System.out.println("Divide: " + divide(10, 5));
    }
}
