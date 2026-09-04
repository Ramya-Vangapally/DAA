/*
A happy number is a number which eventually reaches 1 when replaced by the sum of the square of each digit. 
Whereas if during this process any number gets repeated, 
the cycle will run infinitely and such numbers are called unhappy numbers.

The catch when the sum of the squares in the middle of iterations or in the beginning is 4 return false
cause it cannot be a happy number 
:(  so saddd....
 */
import java.util.*;
class HappyNumber{
    static boolean isHappy(int num){
        if(num==1) return true;
        if(num==4) return false;
        return isHappy(CheckSum(num));
    }
    static int CheckSum(int num){
        int sum=0;
        while(num>0){
            sum+=Math.pow(num%10,2);
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isHappy(num))
        System.out.println("Number is Happy");
        else
        System.out.println("Number is not Happy :( ");
    }
}