class Solution {
    public ListNode swapPairs(ListNode head) {
        // Base case: If the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Create a dummy node to handle edge cases where head might change
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Current node is initially the dummy node
        ListNode current = dummy;

        // Traverse the list in pairs and swap each pair
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swap the two nodes
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move current pointer to the next pair
            current = first;
        }

        // Return the new head of the list
        return dummy.next;
    }
}
