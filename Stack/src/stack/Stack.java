/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;
import java.util.*;

/**
 *
 * @author Mitric
 */
public class Stack {
    
    private String[] stackarr;
    private int stacktop;
    private int numofitems;
    private int stacksize;
    public int [] testarr = {1,2,3};
    public int [] testarr2 = {1,2,3,4,5};

    public Stack() {
     stacksize = 4;
     stackarr = new String[stacksize];
     stacktop = -1;
     numofitems = 0;
    }
    
    public void Push(String item){
        if(numofitems + 1 <= stackarr.length){
         stacktop++;
         stackarr[stacktop] = item;
         numofitems++;
        }
        else System.out.println("The stack is full!");
    }
    
    public void Remove() {
        if (numofitems > 0 ) {
            stackarr[stacktop] = "-1";
            stacktop--;
            numofitems--;
            System.out.println("The item was removed!");
        }
        else System.out.println();
        
    }
    
    
   
    
    public static void main(String[] args) {
        Stack novStack = new Stack();
        novStack.testarr = novStack.testarr2;
        System.out.println("value is: " + novStack.testarr[3] );
    }
    
}
