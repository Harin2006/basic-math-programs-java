//reverse a number 
import java.util.*;
class reverse_number{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer :");
        int n = sc.nextInt();
        int reverse = 0;
        while(n>0){
            int last_digit = n%10;
            reverse = reverse*10 +last_digit;
            n=n/10;
        }
        System.out.println( "reverse of the numebr : "+reverse);
     }
}
/* reverse of a number 
step-1: Take the input 
Step-2: fix the variable reverse as 0    
        why 0? when we have to perform any operations on the digits and we are going to store them in the variables 
        which are newly declared then we have to store the newly declared variable as 0 
step-3: we are extracting the last digits if a number by cond=sidering remainders through modulo division method
step-4: we did a logic reverse = reverse *10 +digit here we are first doing units place where initially reverse is 0
        here on the first 0 * 0 = 0 + digit that leads to unit palce  for the next it goes to 10ths place and moves as that
step-5: finally the loop will stopes when rhe remainder is 0 then the reversed value is stored in the reverse varuiable which can be primted out*/