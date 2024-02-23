// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

class question12{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First number :");
        int num1=sc.nextInt(); 
        System.out.print("Enter Second number :");
        int num2=sc.nextInt(); 
        System.out.print("Enter Third number :");
        int num3=sc.nextInt(); 
        Double result = (double)(num1+num2+num3)/3;
        System.out.println("Average is :"+ result);
    }
}