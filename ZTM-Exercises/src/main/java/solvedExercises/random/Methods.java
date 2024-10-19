package main.java.solvedExercises.random;

public class Methods {
    public static void main(String[] args) {
        greet();
        add(5,10);
        int result = multiplier(5,10);
        System.out.println(result);
        int sum = Calculator.add2(5, 10);
        System.out.println(sum);
        System.out.println(AdvancedCalculator.calc(120, 12));
    }

    public static void greet(){
        System.out.println("Hello World");
    }

    public static void add(int a, int b){
        System.out.println( a + b );
    }

    public static int multiplier(int a, int b) {
        return a * b;
    }

    public class Calculator{
        public static int add2(int a, int b){
            return a+b;
        }
    }
    public class AdvancedCalculator{
        public static String calc(int a, int b){
            int sum = a + b;
            int diff = a - b;
            int prod = a * b;
            int quot = a / b;

            String endF = "The sum is: " + sum + " The diff is: " + diff + " The Product is: " + prod + " The quotient is :" + quot;
            return endF;
        }
    }
}
