// Write a Java program to print an American flag on the screen.
// Expected Output

// * * * * * * ==================================                          
//  * * * * *  ==================================                          
// * * * * * * ==================================                          
//  * * * * *  ==================================                          
// * * * * * * ==================================                          
//  * * * * *  ==================================                          
// * * * * * * ==================================                          
//  * * * * *  ==================================                          
// * * * * * * ==================================                          
// ==============================================                          
// ==============================================                          
// ==============================================                          
// ==============================================                          
// ==============================================                          
// ==============================================

class question14{
    public static void main(String [] args ){
        for(int i=1;i<=15;i++){
            if(i%2==1 && i<10){
                for(int j=1;j<=6;j++){
                    System.out.print("* ");
                }
            }
            else if(i%2==0 && i<9){
                for(int j=1;j<=5;j++){
                    System.out.print(" *");
                }
                System.out.print("  ");
            }
            else{
                System.out.print("============");
            }

            for(int k=1;k<=35;k++){
                System.out.print("=");
            }
            System.out.printf("\n");
        }
    }
}
