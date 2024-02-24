// Write a Java program to compare two numbers.
// Input Data:
// Input first integer: 25
// Input second integer: 39
// Expected Output

// 25 != 39                                                                          
// 25 < 39                                                                           
// 25 <= 39

import java.util.Scanner;
class question20{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1=sc.nextInt();
        System.out.print("Enter second number :");
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.printf("%d == %d\n",num1,num2);
        }
        if(num1!=num2){
            System.out.printf("%d != %d\n",num1,num2);
        }
        if(num1>num2){
            System.out.printf("%d > %d\n",num1,num2);
        }
        if(num1<num2){
            System.out.printf("%d < %d\n",num1,num2);
        }
        if(num1>=num2){
            System.out.printf("%d >= %d\n",num1,num2);
        }
        if(num1<=num2){
            System.out.printf("%d <= %d\n",num1,num2);
        }

    }
}