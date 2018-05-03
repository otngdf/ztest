/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztest;
//valami
import java.util.Scanner;

/**
 *
 * @author 212356241
 */
public class Ztest {

    public static void main(String[] args) {

        while (true) {

            System.out.print("Enter something : ");
            Scanner billentyuzet = new Scanner(System.in);
            //input.toString();
            
            String input = billentyuzet.nextLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                System.exit(0);
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }

    }
    
}
