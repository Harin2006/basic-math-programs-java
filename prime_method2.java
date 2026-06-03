import java.io.*;
import java.util.*;
class prime_method2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.print("enter a number :");
            int n = sc.nextInt();
            boolean prime_number = true;
            if(n<=1){
                prime_number = false;
            }
            else{
                for(int i =2;i<=Math.sqrt(n);i++){
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
    // The loop runs from 2 to the sqrt of n  times
    // EX if n = 100 sqet of 100 --> 10 loops runs from 2 to 10 9 times 
    // Any of them satisfies the condition then the loop ends remaining not prime 
    // this method is more efficient becouse the time complexity is lesser than the first one
    
 