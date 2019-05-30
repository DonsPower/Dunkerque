
package GUI;
import javax.swing.*;
/**
 * Grafisches Spielfeld für das beschießen oder setzen von Schiffen
 */
public class BoardPanel extends JPanel {
// ------------------------------ FIELDS ------------------------------

    private FieldButton[][] buttonsField;
    private String title;
    public static int numeroCasillas[] = new int[2]; 
    public static int numeroIntentos[] = new int[2]; 
    public static String coordenadas[] = new String[2]; 

// --------------------- GETTER / SETTER METHODS ---------------------

    public FieldButton[][] getButtonsField() {
        return buttonsField;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.setBorder(BorderFactory.createTitledBorder(this.title));
    }

    public FieldButton getButtonFieldByIndex(int x, int y) {
        return buttonsField[y][x];
    }

    
// -------------------------- OTHER METHODS --------------------------

    /**
     * Initialisiert ein neues Spielfeld
     */
    public void initializeBoardPanel(String title, int n, int boardSize) {
        
        
        this.title = title;
        
        coordenadas[0] = ""; 
        coordenadas[1] = ""; 
        
        numeroCasillas[title.equals("Jugador") ? 0 :1] = n; 
        
        
        
        // mit Nummerierung
        this.setBorder(BorderFactory.createTitledBorder(this.title));
        this.setLayout(new SquareGridLayout(boardSize + 1, boardSize + 1));

        // leeres Label (oben Links)
        this.add(new JLabel());
        // Char fuer alphabetische Nummerierung
        char c = '\u0041';
        // alphabetische Nummerierung (erste Zeile)
        for (int i = 1; i < boardSize + 1; i++) {
            this.add(new JLabel(Character.toString(c++), SwingConstants.CENTER));
        }

        buttonsField = new FieldButton[boardSize][boardSize];

        for (int y = 0; y < buttonsField.length; y++) {
            // Nummerierung jeweils erste Spalte
            this.add(new JLabel(Integer.toString(y + 1), SwingConstants.CENTER));
            // Buttons hinzufuegen
            for (int x = 0; x < buttonsField[y].length; x++) {
                
                int j = title.equals("Jugador") ? 1 :2;
                
                buttonsField[y][x] = new FieldButton(x, y,j);
                
              
                
                this.add(buttonsField[y][x]);
            }
        }
    }
}
