package main.java.solvedExercises.random;

public class FlowStatements {
    public static void main(String[] args) {
            int age = 28;
            double ticketPrice = 0;

            if (age <= 5 && age > 0) {
                ticketPrice = 0;
            } else if (age > 5 && age <= 12)  {
                ticketPrice = 5;
            } else if (age > 12 && age < 18) {
                ticketPrice = 10;
            } else if (age > 18) {
                ticketPrice = 15;
            } else {
                System.out.println("Invalid age."); // might have a better way
            }
            System.out.println("Ticket Price £: " + ticketPrice);

            char grade = 'A';
            switch (grade){
                case 'A':
                    System.out.println("Nice, that's an " + grade);
                    break;
                case 'B':
                    System.out.println("Still a nice grade but can improve from " + grade + " to an 'A'" );
                    break;
                case 'C':
                    System.out.println("Still a nice decent but can improve from " + grade + " to an 'A'" );
                    break;
                case 'D':
                    System.out.println("Still an okay but can improve from " + grade + " to an 'A'" );
                    break;
                case 'F':
                    System.out.println("Not a very a nice grade " + grade);
                    break;
                default:
                    System.out.println("Invalid grade");
            }
            int[] myNum = {3, 6, 9, 18, 55};
            for (int x : myNum) {
                System.out.println("Value at the array : " + x + " with a for-each loop");
            }
            for (int x = 0; x < myNum.length; x++) {
                System.out.println("Value at the index: " + x +  ": " + myNum[x] + " with a normal for loop");
            }

            int n = 2;
            int counter = 0;
            int i = 0;
            while (counter < n) {
                if (i % 2 == 0 ){
                    System.out.println(i);
                    counter++;
                }
                i++;
            }

            int i2 = 1;
            int n2 = 5;
            do {
                System.out.println(i2);
                i2++;
            } while (i2 <= n2);

            int total = 0;
            for (int x : myNum) {
                total += x;
            }
            System.out.println(total);

            int[] grade2 = {41, 22, 66, 89, 2, 33, 107};
            int highest = grade2[0];
            int lowest = grade2[0];

            for (int x : grade2) {
                if (x > highest) {
                    highest = x;
                } else if ( x < lowest) {
                    lowest = x;
                }

            }
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);

            int sumOdd = 0;
            int countOdd = 0;
            for (int y : grade2){
                if (y % 2 != 0){
                    sumOdd += y;
                    countOdd ++;
                }
            }
            System.out.println(sumOdd / countOdd);
    }
}
