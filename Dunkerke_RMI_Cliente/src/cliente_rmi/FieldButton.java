
package cliente_rmi;
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
        
        this.setSize(40,40);
        
        this.jugador = j; 
        
        
        
        this.addActionListener((java.awt.event.ActionEvent evt) -> {
                System.out.println(this.xPos+" , "+this.yPos);
                
                
                if(j==1){//Es el panel del jugador
                    if(ClienteGUI.shipsSetted<ClienteGUI.NoBarcos){
                    this.setIcon(shipIcon);
                    
                   ClienteGUI.coordenadasJugador += this.xPos+ABC[this.yPos]+" "; 
                   
                   
                    System.out.println(ClienteGUI.coordenadasJugador);
                    
                    
                    ClienteGUI.jTextField1.setText(ClienteGUI.coordenadasJugador);
                    
                    ClienteGUI.shipsSetted++; 
                
                }
                }else{ //Es el panel del tablero enemigo
                    
                   if(ClienteGUI.Intentados<ClienteGUI.NoIntentos){
                       
                       
                   ClienteGUI.coordenadaAtacada =  this.xPos+ABC[this.yPos]; 
                   ClienteGUI.Atacar(); 
                   
                   if(ClienteGUI.jTextArea1.getText().contains("BOOM!")){
                        this.setIcon(acierto);
                        
                   
                   }
                   else
                       this.setIcon(fallo);
                    
                   ClienteGUI.Intentados++; 
                       
                       
                   }else{
                       
                       
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
