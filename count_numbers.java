import java.util.*;
class count_numbers{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int n = 7890;
int count=0;
while(n>0){
    int last_digit = n%10;
    n= n/10;
    count++;
}
System.out.println(count);
}
}
/*here in this program we are counting how many digits are there in the given number 
step-1 : We can either take the number as an input or given default as per the question
step-2 : We are going to extract the digits of the number separetly to count them 
step-3 : To do that we are extracting the remainder of the digit so hence using modulo division
step-4 : After extraction the digit is divided by 10 to take the next digit as point values are neglected in the integer data type
step-5 : final move if the remainder becomesw 0 we have stop the process hence we kept that in an while with a condition 
step-6 : every iteration will be counted and that will be our digits and hence we can priunt them  */