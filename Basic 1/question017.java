// Write a Java program to add two binary numbers.
// Input Data:
// Input first binary number: 10
// Input second binary number: 11
// Expected Output
// Sum of two binary numbers: 101

import java.util.Scanner;

class question17{
    public static void main(String [] args){
        int bin1,bin2,i,remainder;
        i=0;
        remainder=0;
        int[] sum=new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number :");
        bin1=sc.nextInt();
        System.out.print("Enter second binary number :");
        bin2=sc.nextInt();

        while(bin1 != 0 || bin2 != 0)
        {
            sum[i++]=(int)((bin1%10 + bin2%10 + remainder)%2);
            remainder=(int)((bin1%10+bin2%10+remainder)/2);
            bin1=bin1/10;
            bin2=bin2/10;
        }
        if(remainder != 0){
            sum[i++]=remainder;
        }
        i--;

        System.out.print("Sum of two binary numbers :");
        while(i>=0){
            System.out.print(sum[i--]);
        }
    }
}
