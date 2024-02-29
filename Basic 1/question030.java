// Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
// Sample Output:

// 1                                                                      
// 3                                                                      
// 5                                                                                                                                                                                                                                                                                   
// ....                                                                                                                                     
// 95                                                                     
// 97                                                                     
// 99

class question30{
    public static void main (String [] args){
        for(int i=1;i<100;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}