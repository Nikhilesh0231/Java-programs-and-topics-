package calculator;
class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Your Result Is : " + (a + b));
    }
}
class ScCalculator {
        public void calculate(int a, int b) {
            System.out.println("Your Result Is : "+ Math.sin(a + b));
        }
    }
    class HyCalculator {
        public void calculate(int a, int b) {
            System.out.println("Your Result Is : " + (a + b));
            System.out.println("Your Result Is : "+ Math.sin(a + b));
        }
    }

public class Ch_12_Practice_set {
    public static void main(String[] args) {
        System.out.println("I Am Main Method");
    }
}
