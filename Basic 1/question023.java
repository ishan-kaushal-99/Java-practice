// Write a Java program to compute the area of a polygon.
// Area of a polygon = (n*s^2)/(4*tan(π/n))
// where n is n-sided polygon and s is the length of a side
// Input Data:
// Input the number of sides on the polygon: 7
// Input the length of one of the sides: 6
// Expected Output

// The area is: 130.82084798405722

import java.util.Scanner;

class question23{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Sides:");
        int n=sc.nextInt();
        System.out.print("Enter Length Of Sides:");
        int s=sc.nextInt();
        double res=(double) (n*s*s)/(4*Math.tan(Math.PI/n));
        System.out.println("The area is :"+res);

    }
}