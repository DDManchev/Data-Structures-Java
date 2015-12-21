/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;


public class Node {
String bookName;
int numSoldBooks;
Node next;

    public Node(String bookName,int numSoldBooks) {
        this.bookName = bookName;
        this.numSoldBooks = numSoldBooks;
    }
    public void Display(){
    System.out.println("Title of book: "+ bookName + " and number of sold copies: "+ numSoldBooks);
    }

}
