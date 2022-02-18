import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Baris 10.10.2021
 */
public class test {
    
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");

        System.out.println(RandomString(list));
        System.out.println("RANDOM REMOVE a ELEMENT---->>NEW ARRAYLIST<<----");
        System.out.println(list.toString());
    }
    
    public static String RandomString(ArrayList list){
    
        String temp = "";            
        
        Random random = new Random();
        
        String array[] = new String[list.size()];
        
        int index = random.nextInt(list.size()-1);
        
        if(!list.isEmpty()){                    
           temp = list.remove(index).toString();         
        }
      return temp;
    }
    
}
