package LTCodes;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LTCode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify code
        ListNode current = dummyHead;
        int carry = 0;

        // Iterate through both lists
        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0; // Value from l1 or 0 if l1 is null
            int val2 = (l2 != null) ? l2.val : 0; // Value from l2 or 0 if l2 is null

            int sum = val1 + val2 + carry; // Add values and carry
            carry = sum / 10; // Calculate new carry
            current.next = new ListNode(sum % 10); // Create a new node with the remainder

            current = current.next; // Move to the next node
            if (l1 != null)
                l1 = l1.next; // Advance l1
            if (l2 != null)
                l2 = l2.next; // Advance l2
        }

        // If there is a carry left, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next; // Return the next node of the dummy node
    }

    public static void main(String[] args) {
        // Example test case: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        LTCode004 solution = new LTCode004();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}