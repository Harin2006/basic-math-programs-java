import java.io.*;
import java.util.*;
class GCD{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 :");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 :");
        int n2 = sc.nextInt();
        System.out.print( "Multiples of n1 : ");
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                System.out.print( i+" ");
            }
        }
         System.out.print("\nMultiples of n2 : ");
        for(int i=1;i<=n2;i++){
            if(n2%i==0){
                System.out.print(i+ " ");
            }
        }
        int temp;
        while(n2!=0){
            temp =n2;
            n2= n1%n2;
            n1 = temp;
            
        }
        
        System.out.print("\nThe gcd of n1 and n2 is : "+n1);
        

    }
}
// Logic for the loop and the GCD
// We have 2 inputs n1 and n2 
// We are creating a new variable temp not to disturb the values after the loop
// In while we took n2!=0 where not take the loop to 0 
// First we are taking the value of the n2 in temp variable
// Now n2 takes the operation of n1%n2
// 5%7=5 --->then n2=5 and temp = 7  n1=7
// Now n1%n2 == 7%2 == 2 ;n2= 2;n1=5
// Then n1=5 and n2 = 2 ; n1%n2 = 1;
// Final ans = 1 should not go beyond