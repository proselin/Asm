/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message1;

import java.util.Scanner;

/**
 *
 * @author quoch
 */
public class Message1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sca = new Scanner(System.in);
        Scanner formessage = new Scanner(System.in);
        Queue que = new Queue(1);
        boolean end = false;
        try{
         while (end == false) {
            System.out.println("1. Enter message");
            System.out.println("2.Show all message");
            System.out.println("3. Exit");
             System.out.println("Enter your choice: ");
            int choice = sca.nextInt();
                switch (choice) {
                 case 1:
                    System.out.println("Enter a message");
                    String Message;
                    Message = formessage.nextLine();
                    if(Message.length() >=250){
                        System.out.println("the length limit of string is 250 . Please try again!");
                    }else{
                        System.out.println("Message has added to system");
                        que.enqueue(Message); 
                        que.dequeue();
                    }
                    break;
                 case 2:
                    System.out.println("-------------");
                    System.out.println("All message");
                    System.out.println("");
                    que.displaystack();
                    System.out.println("--------------");
                    break;
                 case 3:
                    end = true;
                    break;
                 default:
                    break;
             }

           }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}

