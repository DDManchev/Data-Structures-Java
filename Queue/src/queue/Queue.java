/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Arrays;

public class Queue {

    private int queueSize;
    private String[] queArr;
    private int numOfItems;
    private int front;
    private int rear;

    public Queue(int size) {
        queueSize = size;
        queArr = new String[queueSize];
        numOfItems = 0;
        front = 0;
        rear = 0;
        Arrays.fill(queArr, "-1");
    }

    public void Insert(String item) {
        if (rear + 1 > queArr.length) {
            String[] extendedArr = new String[queArr.length * 2];
            System.arraycopy(queArr, 0, extendedArr, 0, numOfItems);
            queArr = extendedArr;

        }
        queArr[rear] = item;
        rear++;
        numOfItems++;

    }

    public void Remove() {
        if (numOfItems > 0) {
            queArr[front] = "-1";
            front++;
            System.out.println("REMOVE " + queArr[front] + " Was Removed From the Queue\n");
            numOfItems--;
        } else if (numOfItems == 0) {
            front = 0;
            rear = 0;
            System.out.println("Sorry But the Queue is Empty");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
