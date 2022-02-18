/**
 *
 * @author Baris 15.10.2021
 */
public class Stack_To_List {
    
    Node head;

    private int size;
    
    public Stack_To_List() {
        head = null;     //initialize
        size = 0;
    }

    public boolean push(int x) {
        Node newNode = new Node(x); //create a new node for new element
        newNode.next = head;  //  NEW_ELEMENT --> HEAD point to head
        head = newNode; // after new Head is a new element
        size++; // all of this size must +1
        return true;
    }
    
    public int peek() {
        if (size == 0) {
            throw new NullPointerException("Stack is Empty!! You can't peek!");
        }
        return head.data;
    }

    public int pop() {
        if (size == 0) {
            throw new NullPointerException("Stack is Empty!! You can't pop!");
        }
        Node temp = head; // hold head
        head = head.next; // new head is head.next  (HEAD --> HEAD.NEXT)
        int deleted_value = temp.data; //deleted value
        temp = null; // after take a value , we must destroy to temp
        size--; // after all of this size must size -= -1
        return deleted_value;
    }

    @Override
    public String toString() {
        Node current_node = head;
        StringBuilder builder = new StringBuilder();
        while (current_node != null) {
            builder.append(current_node.data).append("->");
            current_node = current_node.next;
        }
        return builder.replace(builder.length() - 2, builder.length(), "").toString();
    }
   
    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
