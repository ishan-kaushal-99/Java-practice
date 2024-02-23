// Write a Java program to print the area and perimeter of a circle.
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586

import java.util.Scanner;

class question11{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius = ");
        double rad = sc.nextDouble();
        double perimeter= (2*Math.PI*rad);
        double area =(Math.PI*rad*rad);
        System.out.println("Perimeter is ="+ perimeter);
        System.out.println("Area is ="+ area);
    }
}