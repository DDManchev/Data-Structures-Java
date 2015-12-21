/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchalg;

/**
 *
 * @author Tancred
 */
public class BinarySearchAlg {

    private int [] intArr;

    public BinarySearchAlg() {
       intArr = new int[10];
        int arrsize = intArr.length;
        for (int i = 0; i < arrsize; i++) {
            intArr[i] = (int) (Math.random() * 51);
        }
        for (int i = 0; i < arrsize; i++) {
            System.out.println("arrInt[" + intArr[i] + "]");
        }
        System.out.println("New array was created!");
        
    }
    
    public void BinarySearch(int[] searchArr, int value){
       int lowIndex = 0;
       int highIndex = searchArr.length - 1;
       int midIndex;
       
       while(lowIndex<=highIndex){
        midIndex = (highIndex + lowIndex) / 2;
        if(value < searchArr[midIndex]){
            highIndex = midIndex - 1;
        }
        else if(value > searchArr[midIndex]){
           lowIndex = midIndex + 1; 
        }
        else {
          System.out.println("\nFound a Match for " + value + " at Index " + midIndex);
          break;
        }
       }
    }
    
    
    
    public static void main(String[] args) {
        BinarySearchAlg bnr = new BinarySearchAlg();
    }
    
}
