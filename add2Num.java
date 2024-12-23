class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify the result construction
        ListNode current = dummy; // Pointer to the last node in the result list
        int carry = 0; // Carry for the sum of digits

        // Traverse both lists while there are nodes in either list or there's a carry
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry from the previous addition
            
            if (l1 != null) {
                sum += l1.val; // Add the current digit of l1 if it's not null
                l1 = l1.next; // Move to the next node in l1
            }
            
            if (l2 != null) {
                sum += l2.val; // Add the current digit of l2 if it's not null
                l2 = l2.next; // Move to the next node in l2
            }
            
            carry = sum / 10; // Calculate the new carry (sum divided by 10)
            current.next = new ListNode(sum % 10); // Create a new node with the current digit (sum modulo 10)
            current = current.next; // Move the pointer to the new node
        }

        // The dummy node's next node is the head of the result list
        return dummy.next;
    }
}
