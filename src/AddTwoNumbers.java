public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    // the following did not work
    public ListNode addTwoNumbersB(ListNode l1, ListNode l2) {
        ListNode l1curr = l1;
        ListNode l2curr = l2;
        int sum = 0;
        int place = 1;
        while(l1curr != null){
            sum += (l1curr.val + l2curr.val) * place;
            place = place * 10;
            l1curr = l1.next;
            l2curr = l2.next;
        }

        ListNode resultHead = new ListNode();
        ListNode resultCurr = resultHead;

        while (sum > 0){
            resultCurr.val = sum % 10;
            sum = sum / 10;
            ListNode newNode = new ListNode();
            resultCurr.next = newNode;
            resultCurr = newNode;
        }

        return resultHead;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dHead = new ListNode();
        ListNode curr = dHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dHead.next;
    }
}
