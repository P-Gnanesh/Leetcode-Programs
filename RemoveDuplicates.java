class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Edge case: if the list is empty or has only one node
        if (head == null) {
            return null;
        }
        
        ListNode current = head;
        
        // Traverse the list
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the next node as it is a duplicate
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }
        
        return head;
    }
}
