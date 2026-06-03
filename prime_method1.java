import java.io.*;
import java.util.*;
class prime_method1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.print("enter a number :");
            int n = sc.nextInt();
            boolean prime_number = true;
            if(n<=1){
                prime_number = false;
            }
            else{
                for(int i =2;i<=n/2;i++){
                    if(n%i==0){
                        prime_number= false;
                        break;
                    }
                }
            }
            if (prime_number) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }

        }
    }
    // The logic of the program :
    // Input is taken 
    // Boolen is taken for the prime to check true or false
    // The loop runs from 2 to the n/2 times
    // EX if n = 100 loops runs from 2 to 50 -->49 time and checks the conditions 
    // Any of them satisfies the condition then the loop ends remaining not prime 
    
 