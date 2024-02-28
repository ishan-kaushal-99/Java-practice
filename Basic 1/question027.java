// Write a Java program to print the ASCII value of a given character.
// Expected Output

// The ASCII value of Z is :90

import java.util.Scanner;

class question27{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter keyword:");
        String c=sc.next();
        int l=c.charAt(0);

        System.out.println("Ascii is:"+l);
    }
}