public class CompareNumbers {
    // main
    public static void main(String[] args) {
        System.out.println("Is the number 5 even?: " + isEven(5));
        System.out.println("Is the number -4 positive?: " + isPositive(-4));
    }
    // method that determines if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // method that determines if a number is Positive
    public static boolean isPositive(double number) {
        return number > 0;
    }
}

