import java.util.*;
class climbingstairs{
    /*
    variation 1:
    Given a staircase of N steps and you can either climb 1 or 2 steps at a given time.
T   he task is to return the count of distinct ways to climb to the top.
    
    static int climb(int n){
        if(n<=2) return n;
        return climb(n-1) + climb(n-2);
    }
    static int distinct(int s){
        return climb(s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(distinct(n));
    }
    */

   /*
   variation 2: generalised prblm
   How to count the number of ways if the person can climb up to m stairs for a given value m. 
   For example, if m is 4, the person can climb 1 stair or 2 stairs or 3 stairs or 4 stairs at a time.


    Approach: For the generalization of above approach the following recursive relation can be used. 
    ways (n, m) = ways(n-1, m) + ways(n-2, m) + ... ways(n-m, m) 
    in this approach to reach nth stair, try climbing all possible number of stairs lesser than equal to n from present stair.

   */

  static int CountWays(int n, int m){
    if(n==0) return 1;
    if(n<0) return 0;
    int ways = 0;
    for(int i=1;i<=m;i++){
        ways += CountWays(n-i,m);
    }
    return ways;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Total stairs: ");
    int n = sc.nextInt();
    System.out.println("Enter Possible stairs: ");
    int m = sc.nextInt();
    System.out.println("Total ways: "+ CountWays(n,m));
  }


}