class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int first = -1;
        int last = -1;
        int minDist = Integer.MAX_VALUE;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {
                // First critical point
                if (first == -1) {
                    first = index;
                }
                // Distance between consecutive critical points
                if (last != -1) {
                    minDist = Math.min(minDist, index - last);
                }
                // Update last critical point
                last = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        if (first == last) {
            return new int[]{-1, -1};
        }
        return new int[]{
            minDist,
            last - first
        };
    }
}