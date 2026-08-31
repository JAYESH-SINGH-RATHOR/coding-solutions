class Solution {
    public int findElement(int[] arr) {
        int n = arr.length;

        int[] rightMin = new int[n];

        // rightMin[i] = minimum element from i to n-1
        rightMin[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(arr[i], rightMin[i + 1]);
        }

        int leftMax = arr[0];

        // Check from index 1
        for (int i = 1; i < n - 1; i++) {
            if (leftMax <= arr[i] && arr[i] <= rightMin[i + 1]) {
                return arr[i];
            }

            leftMax = Math.max(leftMax, arr[i]);
        }

        return -1;
    }
}