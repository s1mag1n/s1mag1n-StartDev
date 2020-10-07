/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardev;

/**
 *
 * @author user
 */
class Task5 {
    public void run(){
        System.out.println("----- Задача 5 ------");  
        int[][] a=new int[15][10];
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
            a1[j] = (int)(Math.random()*10);
            }
        }
        for (int i=0;i < a.length;i++,System.out.println()){
        for (int j=0;j < a[i].length;j++){
        System.out.print(a[i][j]+" "); 
        }
    }
        System.out.println("----- конец задачи 5 ------");    
}

}
