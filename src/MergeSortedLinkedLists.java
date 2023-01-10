public class MergeSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1Curr = list1;
        ListNode list2Curr = list2;
        ListNode mergedHead = new ListNode();
        ListNode merged = new ListNode();
        mergedHead.next = merged;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                merged.next = list1;
                list1 = list1.next;
                merged = merged.next;
            } else {
                merged.next = list2;
                list2 = list2.next;
                merged = merged.next;
            }
        }
        if (list1 != null){
            merged.next = list1;
        }
        if (list2 != null){
            merged.next = list2;
        }
        return mergedHead.next.next;
    }
}
