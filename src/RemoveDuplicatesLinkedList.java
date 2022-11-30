public class RemoveDuplicatesLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        // non recursive
        ListNode start = head;
        if (head == null || head.next == null){
            return head;
        }
        while (head.next != null){
            if (head.val == head.next.val){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return start;
    }

    // apparently you shouldn't use recursion with linked lists
    public ListNode deleteDuplicatesRecursive(ListNode head) {
        // recursive
        if (head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicatesRecursive(head.next);
        return head.val == head.next.val ? head.next : head; // ternary operators
        // if head.val == head.next.val is true then return head.next
        // if head.val == head.next.val is false then return head
    }
}
