
import java.util.Collections;
import java.util.ArrayList;


public class test {
   
    public static void main(String[] args) {
        
        
       araba a1 = new araba("ford",2013,"20BBK444",1.5);
       araba a2 = new araba("marcedes",2014,"20BBK333",1.5);
        
       ArrayList<araba>a= new ArrayList<>();
       a.add(a1);
       a.add(a2);
       for(araba ar:a)
          System.out.println(ar.marka);
          Collections.sort(a); 
        
        for(araba ar:a)
            
        System.out.println(ar.marka);
        
        
    }
}
