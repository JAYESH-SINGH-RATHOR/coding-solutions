import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int count(String s){
        int left = 0; 
        int len = s.length();
        int count = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return makepalindrome(s , left + 1 , right) || return 
                makepalindrome(s , left , right - 1);
            }else{
                count = Math.max(len , count);
            }
            System.out.print(count);
            return count;
        }
        public static boolean makepalindrome(String s , int left , int right){
            while(left < right){
                if(s.charAt(left) == s.charAt(right)){
                    return true;
                }
            }
            return false;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
            count(s);
	}
}
