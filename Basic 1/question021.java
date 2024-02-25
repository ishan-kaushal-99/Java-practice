// Write a Java program and compute the sum of an integer's digits.
// Input Data:
// Input an integer: 25
// Expected Output

// The sum of the digits is: 7

import java.util.Scanner;

class question21{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int res=0;
        while(num!=0){
            res+=num%10;
            num/=10;
        }
        System.out.printf("The sum of the digits is : %d",res);

    }
}