package com.company;

public class DivideByZeroException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (Systeim.in);
        System.out.print("Please enter an integer numerator\t");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator\t");
        int denominator = scanner.nextInt();
        int result = quotient(numerator, denominator);
        System.out.print("%nResult: %d / %d = %d%n", numerator, denominator, result);

    }
        public static int quotient(int numerator, int denominator){
        return numerator / denominator;
        }
}


