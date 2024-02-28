// Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
// Expected Output

// 123                                                      
// 124                                                      
// ...                                            
                                                   
// 431                                                      
// 432                                                      
// Total number of the three-digit-number is 24

class question26{
    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==j){
                    continue;
                }
                for(int k=1;k<=4;k++){
                if(k==j||i==j||i==k){
                    continue;
                }
                System.out.printf("%d%d%d\n",i,j,k);
                }
            }
        }

    }
}