public class Loops {
    public static void main(String[] args) {
        // for loop: multiplication table of 5
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // while loop: sum of 1 to 10
        int sum = 0, i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum 1-10 = " + sum);
    }
}
