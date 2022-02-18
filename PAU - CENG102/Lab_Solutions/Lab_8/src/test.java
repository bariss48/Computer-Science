import java.util.Scanner;
/**
 *
 * @author BARiS 10.10.2021
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String array[][] = new String [19][19];
        String pen = "";
        int x = 9;                
        int y = 9;
        
           for (int i = 0; i < array.length-1; i++) {
                 for (int j = 0; j < array.length-1; j++) {
                     array[i][j] = " ";
                   }
                }
        
        while(true){
         
          Scanner input = new Scanner(System.in);  
            
          System.out.println("prompt a command! you can choose of this commands: ");
          System.out.println("1 ---> PEN UP");
          System.out.println("2 ---> PEN DOWN");
          System.out.println("3 ---> Go right!");
          System.out.println("4 ---> Go left!");
          System.out.println("5 ---> Go forward!");
          System.out.println("6 ---> Display ARRAY");
          System.out.println("9 ---> Display and EXIT!");

          int your_choose = 0;
          
          your_choose = input.nextInt();
          switch(your_choose){
          
          case 1:
              pen = "UP";
              break;
          case 2:
              pen = "DOWN";
              break;
          case 3:
               x += 1; 
              if(pen.contains("DOWN")){
                 array[x][y] = "*";                  
              }
              break;
          case 4:
               x += -1; 
               if(pen.contains("DOWN")){
                 array[x][y] = "*";                  
              }
               break;
          case 5:
               y += -1;
               if(pen.contains("DOWN")){
                 array[x][y] = "*"; 
              }
               break;
          case 6:
               for (int i = 0; i < array.length-1; i++) {
                   System.out.println();
                   for (int j = 0; j < array.length-1; j++) {
                       System.out.print(array[j][i]);
                   }
              }
               break;               
          }
          
          if(your_choose == 9){
          
            System.out.println("GOODßYE // THIS CODE WRITE BY BARiS 10.10.2021");
              
            for (int i = 0; i < array.length-1; i++) {
                System.out.println();
                 for (int j = 0; j < array.length-1; j++) {
                     System.out.print(array[j][i]);
                   }
                }
             
             break; 
            
            }
                   
        }                
        
    }
    
}
