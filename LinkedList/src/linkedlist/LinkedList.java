package linkedlist;


public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
     this.head = null;
     this.tail = null;
    }
    
     
    public void Add(String bookName, int numOfSoldBooks){
    if(head == null){
        Node firstNode = new Node(bookName, numOfSoldBooks);
        head = firstNode;
        tail = head;
    }
    else {
    Node nextNode = new Node(bookName, numOfSoldBooks);
    tail.next = nextNode;
    tail = nextNode;
    }
    }
    
    public Node Remove(String bookName){
    if (head == null && tail == null) {
          System.out.println("The list is empty");
          return null;
        }    
    Node prevNode = null;
    Node currNote = head;
    while(currNote != null){
     if(currNote.bookName.equals(bookName)){
        break;
     }
     prevNode = currNote;
     currNote = currNote.next;
    }
    if(currNote == null){
        System.out.println("The item is not in the list");
        return null;
    }
    else{
     if(prevNode == null) head = head.next;
     else prevNode.next = currNote.next;
    }
    return currNote;
    }
        
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
