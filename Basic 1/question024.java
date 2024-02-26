// Write a Java program to reverse a string.
// Input Data:
// Input a string: The quick brown fox
// Expected Output

// Reverse string: xof nworb kciuq ehT

import java.util.Scanner;

class question24{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input:");
        char[] str=sc.nextLine().toCharArray();
        System.out.println("Reversed string :");
        for(int i =str.length-1;i>=0;i--){
            System.out.print(str[i]);  
        }
    }
}