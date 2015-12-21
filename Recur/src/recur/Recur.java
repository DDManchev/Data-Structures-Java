/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recur;

/**
 *
 * @author Tancred
 */
public class Recur {
    
    public int FiboNum(int number){
        
        if(number == 1 || number == 2){
            return 1;
        }
        else{
            return FiboNum(number - 1) + FiboNum(number - 2);
        }
        
    }
    
    public int FactoNums(int num){
     if (num == 1){
         return  1;
     } 
     else{
         return num * FactoNums(num-1);
     }
    }
    
    
    public static void main(String[] args) {
       /*    НЕРЕКУРСИВЕН ЧИСЛА НА ФИБОНАЧИ
       int number = 15;
       int fibo1 = 1;
       int fibo2 = 1;
       int fibo3 = 1;
       for(int i=3;i<=number;i++){
        fibo3 = fibo2 + fibo1;
        fibo1 = fibo2;
        fibo2 = fibo3;
       }
       System.out.println("Number of Fibo is: " + fibo3);
       */
    }
    
}
