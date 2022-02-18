
package mypoint;


public class Test {
    
    public static void main(String[] args) {
     
    MyPoint nokta = new MyPoint(16.2,12.6);
    
  System.out.print(  nokta.pisagor() );
  System.out.println();  
  
    nokta.setX(30.5);
    nokta.setY(40.5);
  
    System.out.println(  nokta.pisagor() );
    
    
   nokta.göster();
    
    
    
}
}