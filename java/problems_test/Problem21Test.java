package problems_test;

import common.ListNode;
import problems.Problem21;

public class Problem21Test {
    public static void main(String[] args) {
        Problem21 sol = new Problem21();

        // Test code 1
        ListNode list1 = ListNode.of(1, 2, 4);
        ListNode list2 = ListNode.of(1, 3, 4);
        ListNode result = sol.mergeTwoLists(list1, list2);

        System.out.println("Test 1:");
        System.out.println("Expected: 1->1->2->3->4->4");
        System.out.println("Got:      " + result);
        System.out.println();

        // Test code 2
        list1 = null;
        list2 = null;
        result = sol.mergeTwoLists(list1, list2);

        System.out.println("Test 2:");
        System.out.println("Expected: null");
        System.out.println("Got:      " + result);
        System.out.println();

        // Test code 3
        list1 = null;
        list2 = ListNode.of(0);
        result = sol.mergeTwoLists(list1, list2);

        System.out.println("Test 3:");
        System.out.println("Expected: 0");
        System.out.println("Got:      " + result);
        System.out.println();
    }
}
