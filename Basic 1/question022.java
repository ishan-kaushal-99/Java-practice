// Write a Java program to compute hexagon area.
// Area of a hexagon = (6 * s^2)/(4*tan(π/6))
// where s is the length of a side
// Input Data:
// Input the length of a side of the hexagon: 6
// Expected Output

// The area of the hexagon is: 93.53074360871938

import java.util.Scanner;

class question22{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon:");
        int s=sc.nextInt();
        double res=(double)(6 * s * s)/(4*Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is:"+ res);
    }
}