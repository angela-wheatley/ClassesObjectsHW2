package com.homework;

public class MagicCalculator extends Calculator
{

    public MagicCalculator(double num1, double num2)
    {
        super(num1, num2);
    }

    public static double squareRoot(double num1)
    {
        return Math.sqrt(num1);
    }

    public static double sine(double num1)
    {
        return Math.sin(num1);
    }

    public static double cosine(double num1)
    {
        return Math.cos(num1);
    }

    public static double tangent(double num1)
    {
        return Math.tan(num1);
    }

    public static double factorial(double num1)
    {
        double i, fact = 1;

        for(i = 1; i <= num1; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        num1 = 4;
        num2 = 2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add(num1, num2));

        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + subtract(num1, num2));

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + multiply(num1, num2));

        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + divide(num1, num2));

        System.out.println("The square of " + num1 + " and " + num2 + " is: " + square(num2));

        System.out.println("The square root of " + num1 + " is: " + squareRoot(num1));

        System.out.println("The sine of " + num1 + " is: " + sine(num1));

        System.out.println("The cosine of " + num1 + " is: " + cosine(num1));

        System.out.println("The tangent of " + num1 + " is: " + tangent(num1));

        System.out.println("The factorial of " + num1 + " is: " + factorial(num1));
    }

}
