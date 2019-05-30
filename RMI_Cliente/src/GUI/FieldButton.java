
package GUI;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
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
    private String[] ABC = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; 

// --------------------------- CONSTRUCTORS ---------------------------

    public FieldButton(int xPos, int yPos, int j) {
        
        
        
        this.jugador = j; 
        
        
        
        this.addActionListener((java.awt.event.ActionEvent evt) -> {
                System.out.println(this.xPos+" , "+this.yPos);
                
                
                System.out.println(Arrays.toString(BoardPanel.numeroIntentos));
                System.out.println(Arrays.toString(BoardPanel.numeroCasillas));
                
                
                if(j==1){//Es el panel del jugador
                    
                    if(BoardPanel.numeroIntentos[0]<BoardPanel.numeroCasillas[0]){
                    BoardPanel.numeroIntentos[0]++; 
                    BoardPanel.coordenadas[0] += " "+ABC[this.xPos]+(this.yPos+1); 
                    
                    this.setIcon(shipIcon);
                    }
                   
                   
                    
                }else{ //Es el panel del tablero enemigo
                    
                    
                    
                    if(BoardPanel.numeroIntentos[1]<BoardPanel.numeroCasillas[1]){
                    Random r = new Random(); 
                    if(r.nextInt(2)+1 == 1 )this.setIcon(acierto);
                    else this.setIcon(fallo);
                   BoardPanel.numeroIntentos[1]++; 
                    
                    BoardPanel.coordenadas[1] += " "+ABC[this.xPos]+(this.yPos+1); 
                    
                    
                    }
                   
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
