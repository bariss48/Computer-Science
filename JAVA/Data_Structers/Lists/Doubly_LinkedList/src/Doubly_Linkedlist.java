public class Doubly_Linkedlist {
    Node head; // hold head for list
    Node tail; // hold tail for list
    //constructer default declare empty doubly_linkedlist
    public Doubly_Linkedlist(){
        this.head = null;  // empty head
        this.tail = null;  // empty tail
    }

    public void add_element_to_top(Node kutucuk){
        if(head == null){   // if head == null list is empty so new node must be head and tail
            head = kutucuk;
            tail = kutucuk;
        }else{
            head.previous = kutucuk; // otherwise sembolize the condition
            kutucuk.next = head;     // null <-- new node(kutucuk) --> <-- head -->
            head = kutucuk;          // look the upper line head.previous point to new node            
        }                            // and new node .next point to head after all of this
    }                                // new node is a head so you can add to top use this method 


    public void add_element_to_last(Node kutucuk){
       if (head == null){   // if this condition so new node is a head and tail same time
           head = kutucuk;
           tail = kutucuk;
       }else {              //otherwise condition tail --> <-- new node(kutucuk) --> Null
           tail.next = kutucuk;    // after all of this new node(kutucuk) is a tail.
           kutucuk.next = null;
           kutucuk.previous = tail;
           tail = kutucuk;
       }
    }

    public void remove_top(){
        if(head.next == null){ //if just have one element on list 
            tail = null;       // basicly tail a head same time 
        }else{                 // just a you can tail = null delete of top
            head.next.previous = null; // this condition we want to delete head 
            head = head.next;          // head --> <-- head.next             
        }                              // we need to this pointers == null 
    }                                  // after do that head.next is a new head

    public void remove_last(){
        if (head.next == null){ // this condition same for remove_top()    
            tail = null;        // you can read upper lines
        }else{
           tail.previous.next = null; // tail.previous --> <-- tail
           tail = tail.previous;  // we must delete this pointer
        }                         // after all of this new tail is a tail.previous
    }

    public void add_index(Node kutucuk,int index){
        if(index == 0){
            if(head != null) {
                kutucuk.next = head;
                head.next.previous = null;
                head = kutucuk;
            }else {
                System.out.println("linkedlist boş");
            }
        }else{
            Node gezen_kutucuk,temp;
            gezen_kutucuk = head;
            for (int i = 0; i <index-1 ; i++) {  // we go to index and hold
                gezen_kutucuk = gezen_kutucuk.next; 
            }
            temp = gezen_kutucuk.next;  // hold to values indexs of previous and next
            gezen_kutucuk.next = kutucuk;  // we can it temp variable 
            kutucuk.previous = gezen_kutucuk; // after all of this
            kutucuk.next = temp;    // you can add to index
        }
    }

    public void remove_index(int index){
            Node gezen_kutucuk, temp;
            gezen_kutucuk = head;
            for (int i = 0; i < index ; i++) {
                gezen_kutucuk = gezen_kutucuk.next;
            }
            temp = gezen_kutucuk.next;
            gezen_kutucuk.previous.next = temp;
            gezen_kutucuk.next.previous = gezen_kutucuk.previous; // same like add to index
            gezen_kutucuk.next = null;  // but this we must point to Null previous and next 
            gezen_kutucuk.previous = null;

    }

    public String print_list(){
        Node kutucuk;
        String valuelar = "";
        kutucuk = head;
        while (kutucuk != null){
            valuelar = valuelar + kutucuk.value +" " + "<-->" + " ";
            kutucuk = kutucuk.next;  // basically print to doubly_linkedlist
        }
        return valuelar;
    }

    public static void main(String[] args) {
        Doubly_Linkedlist double_list = new Doubly_Linkedlist();
        Node kutucuk1 = new Node(25);
        Node kutucuk2 = new Node(15);
        Node kutucuk3 = new Node(35);
        Node kutucuk4 = new Node(45);
        Node kutucuk5 = new Node(55);
        Node kutucuk6 = new Node(65);
        Node kutucuk7 = new Node(75);
        Node kutucuk8 = new Node(78);
        Node kutucuk9 = new Node(95);
        Node kutucuk10 = new Node(85);
        double_list.add_element_to_top(kutucuk1);
        double_list.add_element_to_top(kutucuk2);
        double_list.add_element_to_last(kutucuk3);
        double_list.add_element_to_last(kutucuk4);
        double_list.add_element_to_last(kutucuk5);
        double_list.add_index(kutucuk6,3);
        double_list.add_index(kutucuk7,2);
        double_list.remove_top();
        double_list.remove_last();
        double_list.remove_index(2);
        double_list.remove_index(1);
        double_list.add_element_to_top(kutucuk8);
        double_list.add_element_to_top(kutucuk9);
        double_list.add_element_to_top(kutucuk10);
        System.out.println(double_list.print_list()+"null");
    }
}
