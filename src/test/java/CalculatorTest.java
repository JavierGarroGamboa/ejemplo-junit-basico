public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(10,50);
        if (result != 60) {
            System.err.println("Bad Result: " + result);
        } else {
            System.out.println("Good Result: " + result);
        }
    }
}
