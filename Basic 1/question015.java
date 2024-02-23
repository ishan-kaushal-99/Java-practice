//  Write a Java program to swap two variables.

import java.util.Scanner;

class question15{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num 1 :");
        int num1=sc.nextInt();
        System.out.print("Enter num 2 :");
        int num2=sc.nextInt();
        int temp;
        temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("Swapped num 1 is :"+num1);
        System.out.println("Swapped num 2 is :"+num2);
    }
}
