package Sprint3Spel;

import java.awt.Color;
import javax.swing.*;

public class Button extends JButton{
    
    public Button(){}
    
    public Button(String text){
        super(text);
    }
    
    public void makeEmpty(){
        this.setText("");
        this.setBackground(Color.BLACK);
    }
    
}
