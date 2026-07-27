# ARCO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Array Compression

Chef has an array  **$A$**  of length  **$N$**.

He may repeatedly perform the following operation:

- Choose an index $i$ such that $A_i$ is equal to at least one of its adjacent elements, and remove $A_i$ from the array.

After each removal, the remaining elements become adjacent.

Determine the minimum possible length of the array that Chef can acheive.

### Input Format
- The first line contains a single integer $N$.
- The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
### Output Format

Print a single integer — the minimum possible length of the array.

### Constraints
- $1 \le N \le 10^5$
- $1 \le A_i \le 10^6$
### Sample 1:
Input
Output

```
4
2 1 2 2
```

```
3
```

### Explanation:

Remove the last element. The remaining array is `[2, 1, 2]`, and no further operation can be performed.

### Sample 2:
Input
Output

```
5
1 2 2 2 1
```

```
3
```

### Explanation:

Remove one of the `2`s to obtain the array `[1, 2, 2, 1]`. Then remove one of the remaining `2`s to obtain `[1, 2, 1]`. No further operation can be performed, so the minimum possible length of the array is  **3**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-27T14:43:38.496Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/ARCO)