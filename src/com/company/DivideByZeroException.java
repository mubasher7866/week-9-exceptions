package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroException {

    public static void main(String[] args) throws ArithmeticException {

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {

            try {

                System.out.print("Please enter an integer numerator\t");

                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator\t");

                int denominator = scanner.nextInt();


                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("Error: Input was incorrect ");
                System.out.printf("Suggestion: You must enter integer values");
                scanner.nextLine();
            } catch (ArithmeticException arithmeticException) {
                System.out.printf("Error: ArithematicException was thrwon\n ");
                System.out.printf("Suggestion: You cannot enter 0 ");

            }
            finally{
                System.out.println("This is the finally statement, cleanup can go on here");
            }


        } while (continueLoop);
    }

        public static int quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator / denominator;
        }
}


