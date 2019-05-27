package GUI;

import javax.swing.*;
import java.awt.*;
/**
 * Representiert alle Komponenten des Spielbereiches
 */
public class GamePanel extends JPanel {
// ------------------------------ FIELDS ------------------------------

    private JLabel labelInfo;
    private JPanel panelGameArea;
    private JPanel panelBoards;
    private BoardPanel panelEnemyBoard;
    private BoardPanel panelPlayerBoard;


// --------------------------- CONSTRUCTORS ---------------------------

    public GamePanel() {
        this.setLayout(new BorderLayout());


        // Panel fuer die eigentliche Spielflaeche
        panelGameArea = new JPanel(new BorderLayout());
        this.add(panelGameArea);

        // Panel fuer die beiden Boards
        panelBoards = new JPanel(new GridLayout(1, 2));


        // Spielbrett fuer den Gegner
        panelEnemyBoard = new BoardPanel();
        panelEnemyBoard.initializeBoardPanel("Jugador", 10);
        
        
        panelBoards.add(panelEnemyBoard);

        // Spielbrett fuer den Player
        panelPlayerBoard = new BoardPanel();
        panelPlayerBoard.initializeBoardPanel("Enemigo", 10);
        
        
        
        panelBoards.add(panelPlayerBoard);

        // Panel fuer mit den Boards hinzufügen
        panelGameArea.add(panelBoards);
    }

}