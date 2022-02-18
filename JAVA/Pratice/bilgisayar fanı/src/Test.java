/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Barış
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        fan fanımız = new fan();
        fan faniki = new fan();
        
       fanımız.fanıaç();
       System.out.println(fanımız.toString());
       fanımız.setÇalışma_hızı(3);
       fanımız.setRadius(10.5);
       fanımız.setRenk("kırmızı");
       //fanımız.fanıkapat();
       System.out.println(fanımız.toString()); 
        
    }
    
}
