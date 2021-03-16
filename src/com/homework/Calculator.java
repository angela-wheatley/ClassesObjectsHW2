package com.homework;

public class Calculator
{
    
    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }
    
    public static double subtract(double num1, double num2)
    {
        return num1 - num2;
    }
    
    public static double multiply(double num1, double num2)
    {
        return num1 * num2;
    }
    
    public static double divide(double num1, double num2)
    {
        return num1 / num2;
    }
    
    public static double square(double num1)
    {
        return num1 * num1;
    }

    
    public static void main(String[] args)
    {
        double num1 = 4;
        double num2 = 2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add(num1, num2));
        
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + subtract(num1, num2));
        
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + multiply(num1, num2));
        
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + divide(num1, num2));
        
        System.out.println("The square of " + num1 + " and " + num2 + " is: " + square(num2));
    }

}
