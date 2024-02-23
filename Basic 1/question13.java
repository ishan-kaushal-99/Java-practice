// Write a Java program to print the area and perimeter of a rectangle.
// Test Data:
// Width = 5.5 Height = 8.5
// Expected Output:
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20

import java.util.Scanner;


class question13{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Width = ");
        double width =sc.nextDouble();
        System.out.print("Height = ");
        double height =sc.nextDouble();

        double peri =2*(width+height);
        double area= height*width;

        System.out.printf("Area is %.1f*%.1f = %.2f\n",width,height,area);
        System.out.printf("Perimeter is 2*(%.1f+%.1f) = %.2f",width,height,peri);

    }
}