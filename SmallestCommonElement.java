/*
You are given an m x n matrix mat where each row is sorted in non-decreasing order.

Your task is to find the smallest common element in all rows. If there is no common element, return -1.

Input Format:
--------------
Line-1: Two integers m and n, representing the number of rows and columns, respectively.
Line-2: The next m lines contain n space-separated integers each, representing the elements of the matrix. Each row of the matrix is sorted in non-decreasing order.

Output Format:
---------------
Line-1: Print a single integer, the smallest common element in all rows. If no common element exists, print -1.

Constraints:
-------------
1 ≤ m, n ≤ 500
1 ≤ mat[i][j] ≤ 10^4
Each row is sorted in non-decreasing order.

Sample Input-1:
----------------
3 4
1 2 3 4
2 3 5 7
3 5 6 7

Sample Output-1:
-----------------
3

Explanation: The number 3 is the smallest common element in all rows.


Sample Input-2:
---------------
2 3
1 2 3
4 5 6

Sample Output-2:
----------------
-1

Explanation: There is no common element in all rows, so the output is -1.
*/
import java.util.*;

class  SmallestCommonElement{
    static int CommonElement(int[][] arr,int m, int n){
        for (int i=0;i<m ;i++ ){
                if(arr[0][n] < arr[i][0]) return -1;
        } 
        L1:for (int i=0;i<m ;i++ ){
           L2: for (int j=0;j<n;j++){
                if(BinarySearch(arr[i],arr[0,j],0,n)!=-1) 
            } 
        } 
        return 0;
    }
   static int BinarySearch(int[] arr,int target,int low,int high){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) high =  mid-1;
            else low = mid + 1;
        }
        return -1;
    }

   
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0;i<m ;i++ ){
            for (int j=0;j<n ;j++ ) 
                arr[i][j] =  sc.nextInt();
        }
        int a = CommonElement(arr,m,n);
        System.out.print(a);
        

       
    }
}