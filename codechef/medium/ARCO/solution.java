import java.util.Scanner;

public class Main {
    public static int count(int arr[]) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            if (arr[i] == arr[i - 1]) {
                length = remove(arr, i, length);
                i--; 
            }
        }

        System.out.println( length);
               return length;
    }

    public static int remove(int arr[], int index, int length) {
        for (int i = index; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return length - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        count(arr);
    }
}