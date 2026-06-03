import java.io.*;
import java.util.*;
class angstrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int temp = n;
        int sum =0;
        int len = String.valueOf(n).length();//takes the length of the numbers by typecasting to string
        while(n>0){//if n ==0 then loop stops
            int last_digit = n%10;//extracts the last element
           sum += Math.pow(last_digit, len);//last element and len as power
           n=n/10;//decreacing the last element 
        }
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong Number");
        } else {
            System.out.println(temp + " is not an Armstrong Number");
        }
    }
}