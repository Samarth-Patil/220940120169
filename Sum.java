package com.acts.exam;

import java.util.Scanner;

public class Sum 
{  
public static void main(String args[])  
{  
int a, b, sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
a = sc.nextInt();  
System.out.print("Enter the second number: ");  
b = sc.nextInt();  
sum = sum(a, b);  
System.out.println("The sum of two numbers a and b is: " + sum);  
}  
  
public static int sum(int a, int b)  
{  
int sum = a + b;  
return sum;  
}  
}  