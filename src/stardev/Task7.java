/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardev;

import java.util.Scanner;

/**
 *
 * @author user
 */
class Task7 {
    public void run(){
        System.out.println("----Task7-----");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input the string: ");
        String string = scan.nextLine();
      
        System.out.print("Input the letter: ");
        String letter = scan.nextLine();

        int count = 0;
        
        count = string.length() - string.replaceAll(letter, "").length();
        
        System.out.println("Number of the letter \"" + letter + "\" is: " + count);
        System.out.println("-----Конец программы-----");
    }
}
