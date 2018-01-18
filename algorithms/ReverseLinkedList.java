public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode three = new ListNode(3, null);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);

//        printLinkedList(head);

        ListNode rev = reverseListNode(head);

        printLinkedList(rev);
    }

    public static ListNode reverseListNode(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
           head.next = prev;
           prev = head;
           head = next;
        }
        return prev;
    }

    public static void printLinkedList(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    private static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
