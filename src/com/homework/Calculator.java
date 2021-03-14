package com.homework;

public class Calculator
{

    public static double num1;
    public static double num2;
    
    public Calculator(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
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
        System.out.println(add(4, 2));
        System.out.println(subtract(4, 2));
        System.out.println(multiply(4, 2));
        System.out.println(divide(4, 2));
        System.out.println(square(4));
    }

}
