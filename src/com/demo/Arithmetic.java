package com.demo;
import java.util.Scanner;
public class Arithmetic {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
        Arithmetic arithmetic= new Arithmetic();
        System.out.println("Addition of two numbers : "+arithmetic.add(a,b));
        System.out.println("Subtraction of two numbers : "+arithmetic.sub(a,b));
        System.out.println("Multiplication of two numbers : "+arithmetic.mul(a,b));
        System.out.println("Division of two numbers : "+arithmetic.div(a,b));
    }
}
