/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortalg;

/**
 *
 * @author Tancred
 */
public class InsertionSortAlg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j,k,compVar;
        int[] testArr = {3,44,38,5,47,15,36,26,2,46,4,19,50,48};
        for(int i=1;i<testArr.length;i++){
        j = i;
        k = j - 1;
        compVar = testArr[i];
        while( j>0 && compVar<testArr[k] ){
        testArr[j] = testArr[j-1];
        j--;
        }
        testArr[j] = compVar;
        }
        /*
        int temp,i,j;
        int[] testArr = {6,15,45,82,5,10,21,26,11,100};
        for(i=1;i<testArr.length;i++){
         j = i;
         temp = testArr[i];
         while(j>0 && temp<testArr[j-1]){
            testArr[j] = testArr[j-1];
            j--;
         }
         testArr[j] = temp;
        }
        */
    }
    
}
