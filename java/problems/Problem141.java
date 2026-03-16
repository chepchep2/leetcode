package problems;

import common.ListNode141;

import java.util.HashSet;
import java.util.Set;

public class Problem141 {
    public boolean hasCycle(ListNode141 head) {
        Set<ListNode141> visited = new HashSet<>();
        ListNode141 node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return true;
            }
            visited.add(node);
            node = node.next;
        }
        return false;
    }
}
