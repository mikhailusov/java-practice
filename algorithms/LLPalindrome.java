import java.util.LinkedList;
import java.util.Queue;

public class LLPalindrome {

    public static void main(String[] args) {
        
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        Queue<ListNode> queue = new LinkedList<>();

        ListNode curr = head;

        while(curr.next != null) {
            queue.add(curr);
            curr = curr.next;
        }

        curr = head;
        while (curr.next != null) {
            if (queue.poll().val != curr.val) {
                return false;
            }
            curr = curr.next;
        }

        return true;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
