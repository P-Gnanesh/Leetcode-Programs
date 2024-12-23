class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the start of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy; // This pointer will traverse the merged list
        
        // Traverse both lists and merge them in sorted order
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;  // Attach list1 node to merged list
                list1 = list1.next;    // Move list1 pointer forward
            } else {
                current.next = list2;  // Attach list2 node to merged list
                list2 = list2.next;    // Move list2 pointer forward
            }
            current = current.next;  // Move the current pointer forward
        }
        
        // At this point, one of the lists might be exhausted, append the other list
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }
        
        // Return the merged list starting from the node after the dummy node
        return dummy.next;
    }
}
