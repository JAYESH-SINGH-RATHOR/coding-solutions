import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int sub(int arr[]){
        int ele = 0;
        for(int i = 1; i < arr.length; i++){
            ele = Math.abs(arr[i] - arr[i - 1]);
        }
        return ele;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		sub(arr);

	}
}
