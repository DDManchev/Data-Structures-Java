
package doublelinkedlist;


public class DoubleLinkedList {

    Node tail;
    Node head;
    int count;

    public DoubleLinkedList() {
    tail = null;
    head = null;
    count = 0;
    }
    
    public void Add(String bookName, int numSoldBooks){
        if (head == null) {
        Node newNode = new Node(bookName, numSoldBooks);
        head = newNode;
        tail = head;
        count++;
        }
        else{
         Node anotherNode = new Node(bookName, numSoldBooks);
         Node tempNode = tail;
         tail.next = anotherNode;
         tail = anotherNode;
         tail.prev = tempNode;
         count++;
        }
    }
    
    public int Remove(String bookName){
      if(count == 0){
          System.out.println("The List is empty");
          return -1;
      }
      Node previNode = null;
      Node currNode = head;
      
      while(currNode != null){
       if(currNode.bookName.equals(bookName)){
           break;
       }   
       previNode = currNode;
       currNode = currNode.next;
      }
      if(currNode == null){
          System.out.println("The element is not in the list");
          return -1;
      }
      else{
       if(currNode.prev == null) {
          head = currNode.next;
          head.prev = null;
       }
       else{
           if (currNode.next == null) {
            currNode.prev = null;
            previNode.next = currNode.next;   
           }
           else{
             Node nextNode = currNode.next;
             nextNode.prev = previNode;
             previNode.next = nextNode;
             currNode = null;
           }
       }
      }
      return -1;  
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
