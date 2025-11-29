package common;

public class ListNode {
    public int val;
    public ListNode next;
    
    public ListNode(int val) { 
        this.val = val; 
    }
    
    public static ListNode of(int... values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) sb.append("->");
            current = current.next;
        }
        return sb.toString();
    }
}