package com.homework;

public class MagicCalculator extends Calculator
{

    public MagicCalculator(double num1, double num2)
    {
        super(num1, num2);
    }

    public static void main(String[] args)
    {
        double x = 4;
        double y = 2;
        
        System.out.println("The sum of " + x + " and " + y + " is: " + add(x, y));
        
        System.out.println("The difference between " + x + " and " + y + " is: " + subtract(x, y));
        
        System.out.println("The product of " + x + " and " + y + " is: " + multiply(x, y));
        
        System.out.println("The quotient of " + x + " and " + y + " is: " + divide(x, y));
        
        System.out.println("The square of " + x + " and " + y + " is: " + square(x));
        
        double z = 100;
        
        System.out.println("The square root of " + z + " is: " + Math.sqrt(z));
        
        System.out.println("The sine of " + z + " is: " + Math.sin(z));
        
        System.out.println("The cosine of " + z + " is: " + Math.cos(z));
        
        System.out.println("The tangent of " + z + " is: " + Math.tan(z));
        
        int i,fact = 1;
        int num = 5;
        
        for(i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        
        System.out.println("The factorial of " + num + " is: " + fact);

    }

}
