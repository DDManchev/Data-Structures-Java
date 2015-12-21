package doublelinkedlist;

public class Node {

    String bookName;
    int numSoldBooks;
    Node next;
    Node prev;

    public Node(String bookName, int numSoldBooks) {
        this.bookName = bookName;
        this.numSoldBooks = numSoldBooks;
    }

    public void Display() {
        System.out.println("Title of book: " + bookName + " and number of sold copies: " + numSoldBooks);
    }

}
