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


        
        //Panel de los botones
        JPanel jbotones = new JPanel(); 
            jbotones.setLayout(new FlowLayout());
        JButton terminarTurno = new JButton("Listo"); 
        
        terminarTurno.addActionListener((java.awt.event.ActionEvent evt) -> {System.out.println(BoardPanel.coordenadas[0]);}); //Aquí envia el string con las coordenadas 
        
        jbotones.add(terminarTurno); 
        JButton Atacar = new JButton("Atacar");
        Atacar.addActionListener((java.awt.event.ActionEvent evt) -> {System.out.println(BoardPanel.coordenadas[1]);});
        
        jbotones.add(Atacar); 
        panelGameArea.add(jbotones, BorderLayout.SOUTH);

        
        // Panel del enemigo
        panelEnemyBoard = new BoardPanel();
        panelEnemyBoard.initializeBoardPanel("Jugador",3, 10);
        
        
        panelBoards.add(panelEnemyBoard);

        // Panel del jugador
        panelPlayerBoard = new BoardPanel();
        panelPlayerBoard.initializeBoardPanel("Enemigo",10, 10);
        
        
        
        panelBoards.add(panelPlayerBoard);

        // Panel fuer mit den Boards hinzufügen
        panelGameArea.add(panelBoards);
    }

}