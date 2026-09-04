/*
The recursive function performs the following steps to reverse a string:
Input a line of text.
Pass each word to reverseString function to reverse it.
In reverseString function, 
Swap left most and right most characters.
Increment left index and decrement right index.
Repeat swapping by recursive call till the left>=right
*/
import java.util.*;

class revStr{

    public static void reverseString(char[] s, int left, int right) {

        if (left >= right)
            return;

        char temp = s[left];

        s[left++] = s[right];

        s[right--] = temp;

        reverseString(s, left, right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] data = s.toCharArray();

        reverseString(data, 0, data.length - 1);

        System.out.println(data);
    }
}