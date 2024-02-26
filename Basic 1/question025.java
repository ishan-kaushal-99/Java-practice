// Write a Java program to count letters, spaces, numbers and other characters in an input string.
// Expected Output

// The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
// letter: 23                                               
// space: 9                                                 
// number: 10                                               
// other: 6

import java.util.Scanner;

class question25{
    public static void main(String [] args){
        int letter=0,space=0,num=0,other=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input:");
        char[] str=sc.nextLine().toCharArray();
        for(int i=0;i<str.length;i++){
            if(Character.isLetter(str[i])){
                letter++;
            }
            else if(Character.isDigit(str[i])){
                num++;
            }
            else if(Character.isSpaceChar(str[i])){
                space++;
            }
            else{
                other++;
            }
        }
        System.out.println("Letter: "+letter);
        System.out.println("Space: "+space);
        System.out.println("Other: "+other);
        System.out.println("Number: "+num);
    }
}