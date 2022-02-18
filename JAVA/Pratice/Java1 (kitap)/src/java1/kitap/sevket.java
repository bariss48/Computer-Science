/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.kitap;

/**
 *
 * @author tee
 */

/*
"                   J            A           V          V         A       ",
"                   J          A   A          V        V        A   A     ",
"                   J        A      A          V      V        A     A    ",
"                   J      A A A A A A          V    V        A A A A A   ",
"            J      J     A            A         V  V        A          A ",
"             J J J     A               A         V         A            A"

 */
import java.util.Random;
import java.util.Scanner;
public class sevket {
    public static void main(String[] args) {
        
       

 int number1 = (int)(Math.random() * 10);
 int number2 = (int)(Math.random() * 10);

 // 2. If number1 < number2, swap number1 with number2
 if (number1 < number2) {
 int temp = number1;
        number1 = number2;
        number2 = temp;
 }
  
// 3. Prompt the student to answer ”What is number1 – number2?”
System.out.print("What is " + number1 + " - " + number2 + "? ");
Scanner input = new Scanner(System.in); 
System.out.println("Write answer: ");
int answer = input.nextInt();
// 4. Grade the answer and display the result
if (number1 - number2 == answer)
System.out.println("You are correct!");
else {
System.out.println("Your answer is wrong.");
System.out.println(number1 + " - " + number2 +" should be " + (number1 - number2));
        

        
 } 

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*  String[] dizi = {"                   J            A           V          V         A       ",
                         "                   J          A   A          V        V        A   A     ",
                         "                   J        A      A          V      V        A     A    ",
                         "                   J      A A A A A A          V    V        A A A A A   ",
                         "            J      J     A            A         V  V        A          A ",
                         "             J J J     A               A         V         A            A"
};
        for(String satir:dizi)
            System.out.println(satir);

      */
    }
    }


