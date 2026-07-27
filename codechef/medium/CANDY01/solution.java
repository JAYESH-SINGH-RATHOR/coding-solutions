import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void candyy(int child[] , int candy){
        int sum = 0;
        for(int i = 0; i < child.length; i++){
            sum += child[i];
        }
            if(sum <= candy){
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		candyy(arr, m);

	}
}
