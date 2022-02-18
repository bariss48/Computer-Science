import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author tee
 */
public class EightQuenns extends JApplet {

        public static final int SIZE = 8;
        private int[] quenns = new int[SIZE];
        
        
        public EightQuenns(){
           search(0); 
           add(new ChessBoard(), BorderLayout.CENTER); 
            
        }
        
        private boolean isValid(int row,int column){
            
            for (int i = 0; i <=row; i++) {
                
                if(quenns[row-i] == column || quenns[row-i] == column-1 || quenns[row-i] == column+i){
                    
                   return false; 
                }
              
            }
             return true;   
        }    
            
        private boolean search(int row){
            
            if(row == SIZE){
                
                return true;
            }
            
            for(int column = 0; column< SIZE;column++){
                
                quenns[row] = column;
                if(isValid(row, column) && search( row + 1)){
                    return true;
                }
                
            }
         return false;   
        }   
        
        
   class ChessBoard extends JPanel{
     
    private Image queenImage = new ImageIcon("/Users/tee/Desktop/images/queen.jpg").getImage();
    
    public ChessBoard(){
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
    }
    
    protected void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        for(int i = 0; i< SIZE;i++){
            int j = quenns[i];
            g.drawImage(queenImage, j*getWidth()/SIZE,i*getHeight()/SIZE,getWidth()/SIZE,getHeight()/SIZE,this);
            
            
        }
     
        for(int i = 1;i<SIZE;i++){
            g.drawLine(0,i*getHeight()/SIZE,getWidth(),i* getHeight()/SIZE);
            g.drawLine(i*getWidth()/SIZE,0,i*getWidth()/SIZE,getHeight());
            
            
        }
        
        
        
    }
            
            
            
   }
}
        
        
        
    
    

