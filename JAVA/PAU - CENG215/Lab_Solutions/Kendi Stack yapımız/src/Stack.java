/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tee
 */
public class Stack {

    private int[] elements;
    private int size;
    public static final int capacity   = 100;
    
    public Stack(){
        
        this(capacity);
        
    }
    
    
     public Stack(int capacity){
        
      elements = new int [capacity];
        
    }
    
    public void push(int value){
        
        if(size >= elements.length){
        int[] temp = new int[elements.length * 2];    
        System.arraycopy(elements,0, temp,0,elements.length);
            elements=temp;
        }
        elements[size++] = value;
    }
    
    public int pop(){
        return elements[--size];
    }
    public int peek(){
        return elements[size-1];
    }
    public boolean isEmpty(){
        
        if(size == 0){
            
            return true;
        }else{
        
        
        return false;
    }
    } 
        
        
    public int getSize(){
        return size;
    }
    
    
}
