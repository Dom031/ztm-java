package main.java.solvedExercises.random;
import java.util.Arrays;

public class VariableExercises1 {

        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            System.out.println("this is a: " + a + " this is b: " + b);

            float x = 1.0F;
            float y = 2.14F;
            float sum = (x + y);
            System.out.println(sum);

            String str1 = "Hello";
            String str2 = "World";
            String str3 = (str1 + " " + str2);
            System.out.println(str3);

            int[] intArray = new int[]{1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(intArray));

            int c = 12;
            int d = 11;
            int e = (c * d);
            System.out.println(e);

            String text = "Java Programming";
            int length = (text.length());
            System.out.println(length);

            String[] stringArray = new String[]{"Apple", "Orange", "Grape", "Banana"};
            System.out.println(Arrays.toString(stringArray));

            double f = 12.1;
            double g = 11.1;
            double h = f * g;
            double i = f/g;

            System.out.println(h);
            System.out.println(i);

            double last = 25.3;
            int last1 = (int) last;
            System.out.println(last1);

        }
}
