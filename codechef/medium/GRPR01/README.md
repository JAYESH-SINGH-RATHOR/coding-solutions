# GRPR01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Grid Propagation

You are given a grid of size $N \times M$, where each cell contains an integer representing its signal strength.

At the end of every hour, the signal strength of each cell is updated  **simultaneously**. A cell takes the maximum signal strength among itself and all of its neighboring cells at the beginning of that hour.

Two cells are considered neighbors if they share a side or a corner (i.e., each cell has at most $8$ neighbors).

Determine the minimum number of hours required until every cell in the grid has the same signal strength.

### Input Format
- The first line contains a single integer $T$, the number of test cases.
- For each test case: The first line contains two integers $N$ and $M$. The next $N$ lines each contain $M$ space-separated integers, where the $j^{\text{th}}$ integer in the $i^{\text{th}}$ row denotes the signal strength of cell $(i,j)$.
### Output Format

For each test case, print a single integer — the minimum number of hours required until all cells have the same signal strength.

### Constraints
- $1 \le T \le 4$
- $1 \le N, M \le 500$
- $1 \le A_{i,j} \le 10^6$
### Sample 1:
Input
Output

```
1
3 4
1 2 3 4
2 3 4 4
1 2 4 3
```

```
2
```

### Explanation:

 **Explanation:** 

After $1$ hour, the grid becomes:

```
3 4 4 4
3 4 4 4
3 4 4 4

```

After $2$ hours, the grid becomes:

```
4 4 4 4
4 4 4 4
4 4 4 4

```

Since all cells have the same signal strength after $2$ hours, the output is $2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-20T14:39:04.826Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GRPR01)