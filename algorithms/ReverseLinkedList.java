public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode three = new ListNode(3, null);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);

        reverseListNode(head);

        System.out.println(head);
    }

    public static ListNode reverseListNode(ListNode head) {
        return head;
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
