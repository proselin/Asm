/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message1;

/**
 *
 * @author quoch
 */
public class Stack {
     public int current_size  = -1 ;//empty stack
    public final int Max_size = 20; // max of stack
    MyMessage Mes  = new MyMessage();
    public String [] stack = new String[Max_size];
    //kiem tra mang rong 
    public boolean isEmpty(){
        return(current_size==-1);
    }
   // kiem tra mgna day 
    public boolean isFull(){
        return(current_size==Max_size);
    }
    //them mot phan tu vao trong mang 
    public void push (String Message){
        Mes.setMessage(Message);
        if(isFull()){
            System.out.println("Full");
        }else{
            current_size++;
            stack[current_size] = Mes.getMessage();
        }
    }
    String display(){
        for(int i = 0 ; i<current_size;i++){
            if(stack[i]==null) break;
            System.out.println(stack[i]);
        }
        return"-----------------------";
    }
}

