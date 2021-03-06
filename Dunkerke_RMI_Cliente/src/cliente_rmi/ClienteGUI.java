/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_rmi;

import Interfaces.InterfazCliente;
import Interfaces.InterfazServidor;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Dons
 */
public class ClienteGUI extends javax.swing.JFrame {
    public static InterfazServidor servidor;
    private Cliente cliente;
    private ArrayList<String> cordenadas;
    public static ArrayList<String> bomba;
    public static int id=0;
    
    
    public static String coordenadaAtacada = ""; 
    
    public static String coordenadasJugador = ""; 
    public static int NoBarcos; 
    public static int shipsSetted = 0; 
    public int barcosHundidos = 0; 
    
    public static int NoIntentos; 
    public int intentoschido=0;
    public static int Intentados = 0; 
    public boolean tre=false;
    
    
    
    /**
     * Creates new form ClienteGUI
     */
    public ClienteGUI() {
        initComponents();
        this.setTitle("DUNKERQUE");
        this.setSize(1072,772);
        this.jTextField1.setVisible(false);
        cordenadas=new ArrayList<>();
        bomba=new ArrayList<>();
        jTextArea1.setEnabled(false);
        jTextField1.setEnabled(false);
        jButton3.setEnabled(false);
        t1.setText("127.0.0.1");
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TamTablero = new javax.swing.JTextField();
        NumBarcos = new javax.swing.JTextField();
        NumIntentos = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        score = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Escribe el usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 87, 14);

        jLabel2.setText("IP servidor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 30, 52, 14);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(400, 20, 95, 30);

        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(210, 20, 95, 30);

        jButton1.setText("Conectar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 30, 140, 23);

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(520, 580, 154, 143);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(250, 580, 218, 143);

        jLabel3.setText("Usuarios");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 560, 41, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 612, 0, 20);

        jButton3.setText("Guardar Coordenadas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 550, 160, 23);

        jLabel6.setText("Tamaño de tablero:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 120, 110, 14);

        jLabel7.setText("Número de barcos:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 160, 110, 14);

        jLabel8.setText("Número de intentos: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 200, 120, 14);

        TamTablero.setText("10");
        getContentPane().add(TamTablero);
        TamTablero.setBounds(530, 110, 90, 30);

        NumBarcos.setText("5");
        getContentPane().add(NumBarcos);
        NumBarcos.setBounds(530, 150, 80, 30);

        NumIntentos.setText("10");
        getContentPane().add(NumIntentos);
        NumIntentos.setBounds(530, 190, 30, 30);

        jButton2.setText("Terminar Turno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 550, 150, 23);

        jLabel4.setText("Score");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(770, 30, 34, 14);

        score.setEditable(false);
        score.setText("0");
        getContentPane().add(score);
        score.setBounds(810, 20, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        NoBarcos = Integer.parseInt(this.NumBarcos.getText()); 
        NoIntentos = Integer.parseInt(this.NumIntentos.getText()); 
        
        this.jLabel6.setVisible(false);
        this.jLabel7.setVisible(false);
        this.jLabel8.setVisible(false);
        
        this.NumBarcos.setVisible(false);
        this.NumIntentos.setVisible(false);
        this.TamTablero.setVisible(false);
        
       iniciarPanelJugador(Integer.parseInt(this.TamTablero.getText())); 
        
       this.repaint();
       
        if(jButton1.getText().equals("Conectar")){
            if(t2.getText().isEmpty()){ 
                JOptionPane.showMessageDialog(null, "Debes de ingresar un nombre");
                return;
            }
            if(t1.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Debes de ingresar una ip");
                return;
            }
            try{
               cliente= new Cliente(t2.getText());
               cliente.setGUI(this);
                Registry reg=LocateRegistry.getRegistry(t1.getText(),1099);
                servidor=(InterfazServidor)reg.lookup("Servidor");
                this.id=servidor.verificar2(id);
                System.out.println("clienrte: "+id);
                if(id>2){
                    JOptionPane.showMessageDialog(null, "No puede haber mas de 3 jugadores.", "Error", JOptionPane.WARNING_MESSAGE);
                    
                    this.dispose();
                }
                servidor.registrar(cliente);
                actualizarLista(servidor.obtenerClientesActivos());
            }catch(RemoteException e){
                e.printStackTrace();
            }catch(NotBoundException ex){
                ex.printStackTrace();
                
            }
            jButton1.setText("Desconectar");    
             //Falta actualizar constantemente la lista de clientes
             //Actualizar
            jTextField1.setEnabled(true);
            jButton3.setEnabled(true);
            t1.setEnabled(false);
            t2.setEnabled(false);
            jButton1.setEnabled(true);
        }else{
            actualizarLista(null);
            t1.setEnabled(true);
            t2.setEnabled(true);
            jButton1.setEnabled(true);
             jButton1.setText("Conectar");
             jTextField1.setEnabled(false);
            jButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       iniciarPanelEnemigo(Integer.parseInt(this.TamTablero.getText())); 
            this.repaint();
          if(jButton1.getText().equals("Desconectar")){
            if(!jTextField1.getText().isEmpty()){
                try {    
                    
                    servidor.publicar(id,coordenadasJugador);
                } catch (RemoteException ex) {
                    Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Termina el turno 
        //verifica si en el text Aree hay un boom.
        System.out.println("no entro");
        System.out.println("areauno: "+jTextArea1.getText());
        if(tre){
            try {
                System.out.println("entro,");
                intentoschido=servidor.intentos(this.id, 1);
                
            } catch (RemoteException ex) {
                Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tre=false;
        System.out.println("hpñ:  "+intentoschido);
        score.setText(""+intentoschido);
        if(intentoschido==5){
            JOptionPane.showMessageDialog(null, "ganaste");
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField NumBarcos;
    public static javax.swing.JTextField NumIntentos;
    public static javax.swing.JTextField TamTablero;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField score;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables

    private void actualizarLista(Vector v) {
        //Sacar y añadir elementos a la lista.
       DefaultListModel modelo= new DefaultListModel();
       if(v!=null){
           for (int i = 0; i < v.size(); i++) {
               try {
                   String ust=((InterfazCliente)v.get(i)).getNombre();
                   modelo.addElement(ust);
               } catch (RemoteException ex) {
                   Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
     
       }
             jList1.setModel(modelo);
    }
    //Metodo actualizar el textArea poner la informacion del servidor.
    public void actualizarArea(String text){
        jTextArea1.setText(jTextArea1.getText()+"\n"+text);
    }

    private void iniciarPanelJugador(int tam) {
        for (int x = 0; x < tam; x++) {
            for (int y = 0; y < tam; y++) {
                
                
                FieldButton b = new FieldButton(x,y,1); 
                
                b.setLocation(10+x*40+10,50+y*40+10); 
                b.setSize(40,40); 
                b.setVisible(true);
                this.add(b); 
                
            }
        }
    }
   
    private void iniciarPanelEnemigo(int tam) {
    
    for (int x = 0; x < tam; x++) {
            for (int y = 0; y < tam; y++) {
                
                
                FieldButton b = new FieldButton(x,y,2); 
                
                b.setLocation(500+x*40+10,50+y*40+10); 
                b.setSize(40,40); 
                b.setVisible(true); 
                this.add(b); 
                
            }
        }
    
    }
    
    
    public static void Atacar(){
          // Ataaaca meeen
        bomba.clear();
        jTextArea1.setText("");
         if(jButton1.getText().equals("Desconectar")){
            
                try {
                    
                    System.out.println(coordenadaAtacada);
                    
                    servidor.ataque(id,coordenadaAtacada);
                    
                    
                    
                } catch (RemoteException ex) {
                    Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
        
        
    }
   
}
