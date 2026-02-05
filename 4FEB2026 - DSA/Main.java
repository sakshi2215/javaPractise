
// ListNode definition 
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class ReverseLinkedList{
    public ListNode ReverseList(ListNode head){

        //Get the head of LL in current Variable
        ListNode current = head;
        ListNode prev = null;

        //Run a loop until the current becomes null                  // null -> node1 -> node2-> null
        while(current!=null){
            //store the next Node
            ListNode nextNode = current.next;
            //Reverse the next pointer to the previous Node
            current.next = prev;
            //
            prev = current;
            current = nextNode;
        }

        return prev;

    }
}



public class Main {
    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List:");
        printList(head);

        ReverseLinkedList obj = new ReverseLinkedList();
        head = obj.ReverseList(head);
        System.out.println("Reversed List:");
        printList(head);
    }

    //Method for Printing the LinkedList
    static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
