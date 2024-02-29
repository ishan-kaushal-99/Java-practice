// Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
// Sample Output:

// Input number: 5                                                        
// 5 + 55  + 555

import java.util.Scanner;

class question29{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int res=num;
        int maxt=3;
        for(int i=0;i<maxt;i++){
            System.out.print(res);
            res*=10;
            res+=num;
            if(i==maxt-1){
                break;
            }
            System.out.print(" + ");

        }
    }
}