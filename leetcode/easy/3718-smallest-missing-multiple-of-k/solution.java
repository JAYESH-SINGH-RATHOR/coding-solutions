class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : nums) {
            set.add(e);
        }
        int val = k;
        while (set.contains(val)) {
            val += k;
        }
        return val;
    }
}
