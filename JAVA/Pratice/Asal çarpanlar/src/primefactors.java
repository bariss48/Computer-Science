
import java.util.Stack;


public class primefactors {

 private int number;
 Stack depo = new Stack();
 
 public primefactors(int number){
     
     this.number = number;
     
 }
 
 public void findfact(){
     
     int temp=0;
     int sayac=0;
     int bölen=2;
     
     while(number>0){
         
         if(number % bölen == 0){
             
             depo.push(bölen);
             
         }else{
             bölen++;
         }
         
         
     }
         
 }
 
 
   public void print(){
     
     while(!depo.isEmpty()){
         
         System.out.print(depo.pop());
         
         
         
     }
     
     
     
     
     
 }
 
 
 
    
}
