
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

 // @author Barış

/**
 *
 * @author tee
 */
 class ShowFlowLayout extends JFrame{
    
    public ShowFlowLayout(){
        
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        add(new JLabel("İsim: "));
        add(new JTextField(8));
        add(new JLabel("Cinsiyet:"));
        add(new JTextField(1));
        add(new JLabel("Soyİsim: "));
        add(new JTextField(8));
        
    }
    
    
    
} 
public class MyFrame {

    public static void main(String[] args) {
      
        ShowFlowLayout frame = new ShowFlowLayout();     
        
        JButton jbtOK = new JButton("OK");
       
        frame.setTitle("AD SOYAD");
        frame.setSize(250,150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
      //  java.awt.Container container = frame.getContentPane();
      //  container.add(jbtOK);
      //  frame.add(jbtOK);
        
        
        
        
        
    }
    
}
