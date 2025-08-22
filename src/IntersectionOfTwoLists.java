
public class IntersectionOfTwoLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = (pA == null) ? headA : pA.next;
            pB = (pB == null) ? headB : pB.next;
        }
        return pA;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l3;
        IntersectionOfTwoLists it = new IntersectionOfTwoLists();
        ListNode result = it.getIntersectionNode(l1,l2);
        System.out.println("Intersection of two lists is: "+result.val);
    }
}
