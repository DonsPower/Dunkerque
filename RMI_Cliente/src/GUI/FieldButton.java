
package GUI;
import javax.swing.*;
import java.awt.*;

/**
 * Klasse für ein Feld in einem Board
 */

public class FieldButton extends JButton {
// ------------------------------ FIELDS ------------------------------

    private int xPos;
    private int yPos;
    private ImageIcon shipIcon = new ImageIcon();

// --------------------------- CONSTRUCTORS ---------------------------

    public FieldButton(int xPos, int yPos) {
        
        
        
        this.addActionListener((java.awt.event.ActionEvent evt) -> {
                System.out.println(this.xPos+" , "+this.yPos);
                this.setIcon(new ImageIcon(ImageManager.toBufferedImage(ImageManager.openImage().getScaledInstance(40, 40, 0))));
                    
               });
        this.xPos = xPos;
        this.yPos = yPos;

        // setBorderPainted(false);
        // setBorder(null);
        // button.setFocusable(false);
        // setMargin(new Insets(0, 0, 0, 0));
        // setContentAreaFilled(false);
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
    
    
    
}
