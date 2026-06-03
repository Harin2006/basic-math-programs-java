import java.io.*;
import java.util.*;
class palimdrome{
    public static void main(String[]args){
        int n;
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while(n!=0){
            int last = n%10;
            reverse = reverse *10 +last;
            n= n/10;

        }
        System.out.println(reverse);
        if(reverse == original){
            System.out.println("The numebr is a palindrome");
        }else{
            System.out.println("The number is not a palondrome");
        }
    }
}
// nothing other tha reverse 
// the main problem you wii get here while checking the reverse == input
// so we have deckare a new varialbe passing the input into it that should not be modified 
// and then check the reverse with the un,odified on etou willl get your result
