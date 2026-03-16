package problems_test;

import common.ListNode141;
import problems.Problem141;

public class Problem141Test {
    public static void main(String[] args) {
        Problem141 sol = new Problem141();

        System.out.println("Test 1: head = [3,2,0,-1], pos = 1");
        ListNode141 node1 = buildNode1();
        System.out.println("Expected: true, Got: " + sol.hasCycle(node1));
        System.out.println();

        System.out.println("Test 2: head = [1,2], pos = 0");
        ListNode141 node2 = buildNode2();
        System.out.println("Expected: true, Got: " + sol.hasCycle(node2));
        System.out.println();

        System.out.println("Test 3: head = [1], pos = -1");
        ListNode141 node3 = buildNode3();
        System.out.println("Expected: false, Got: " + sol.hasCycle(node3));
        System.out.println();

        System.out.println("Test 4: head = null");
        ListNode141 node4 = buildNode4();
        System.out.println("Expected: false, Got: " + sol.hasCycle(node4));
        System.out.println();
    }

    private static ListNode141 buildNode1() {
        ListNode141 head = new ListNode141(3);
        head.next = new ListNode141(2);
        head.next.next = new ListNode141(0);
        head.next.next.next = new ListNode141(-1);
        head.next.next.next.next = head.next;
        return head;
    }

    private static ListNode141 buildNode2() {
        ListNode141 head = new ListNode141(1);
        head.next = new ListNode141(2);
        head.next.next = head;
        return head;
    }

    private static ListNode141 buildNode3() {
        ListNode141 head = new ListNode141(1);
        head.next = null;
        return head;
    }

    private static ListNode141 buildNode4() {
        ListNode141 head = null;
        return head;
    }
}
