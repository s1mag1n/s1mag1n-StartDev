/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardev;

import java.util.Random;

/**
 *
 * @author user
 */
class Task6 {
    public void run(){
         System.out.println(" Task 6");
        
        int myArr[][] = new int[10][];
        
        Random rand = new Random();
      
        for (int x = 0; x < myArr.length; x++) {
            myArr[x] = new int[(rand.nextInt(9 - 5 + 1) + 5)];
        }
        
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                myArr[i][j] = rand.nextInt(20-0+1)-0;
                System.out.print(myArr[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("---Конец программы---");
    }
}
