
package GUI;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Klasse für ein Feld in einem Board
 */

public class FieldButton extends JButton {
// ------------------------------ FIELDS ------------------------------

    private int jugador; 
    private int xPos;
    private int yPos;
    private ImageIcon shipIcon = new ImageIcon("Images/barco.jpg");
    private ImageIcon acierto = new ImageIcon("Images/Acierto.jpg");
    private ImageIcon fallo = new ImageIcon("Images/Fallo.jpg");
    

// --------------------------- CONSTRUCTORS ---------------------------

    public FieldButton(int xPos, int yPos, int j) {
        
        
        
        this.jugador = j; 
        
        
        
        this.addActionListener((java.awt.event.ActionEvent evt) -> {
                System.out.println(this.xPos+" , "+this.yPos);
                if(j==1){
                    this.setIcon(shipIcon);
                
                    
                    
                }else{
                    
                    Random r = new Random(); 
                    
                    if(r.nextInt(2)+1 == 1 )this.setIcon(acierto);
                    else this.setIcon(fallo);
                   
                } 
               });
        this.xPos = xPos;
        this.yPos = yPos;
      
    }

// -------------------------- OTHER METHODS --------------------------

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(40, 40);
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
    
    public int getJugador(){
        
        return jugador;
    }
    
    
}
