public class LinkedListCycle {
    public boolean isCycle(ListNode head){
        if(head ==null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {
            if (fast == null || fast.next == null) return false;

            slow = head.next;
            fast = fast.next.next;

        }
        return true;
    }
    public static void main(String[] args){

    }
}
