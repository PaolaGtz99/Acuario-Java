/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario1;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

/**
 *
 * @author pao_g
 */
public class InfoPez extends javax.swing.JFrame {

    /**
     * Creates new form InfoPez
     * @param nom
     * @param imag
     */
    private boolean abierta;
    private int money,tipo;
    public static int alim,medi,v;
    
    public Clip clip;
    
    public void sonido(String arch) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        clip=AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/Sonido/"+arch)));
        clip.start();
    }
    public void actualizar(){
        int fel=medi+alim;
        if(medi==0) fel=fel+9;
        
        //ALIMENTO
         if(alim>=7) lleno1.setIcon(new ImageIcon(getClass().getResource("/img/llena.gif")));
         else if(alim>=5&&alim<7) medio1.setIcon(new ImageIcon(getClass().getResource("/img/media.gif")));
         else if(alim<=4) baja1.setIcon(new ImageIcon(getClass().getResource("/img/baja.gif")));
        //MEDICINA
         if(medi>=7||medi==0) lleno2.setIcon(new ImageIcon(getClass().getResource("/img/llena.gif")));
         else if(medi>=5&&medi<7) medio2.setIcon(new ImageIcon(getClass().getResource("/img/media.gif")));
         else if(medi<=4&&medi!=0) baja2.setIcon(new ImageIcon(getClass().getResource("/img/baja.gif")));
         //FELIZ
         if(fel>=16) lleno.setIcon(new ImageIcon(getClass().getResource("/img/llena.gif")));
         else if(fel>=10&&fel<16) medio.setIcon(new ImageIcon(getClass().getResource("/img/media.gif")));
         else if(fel<10) baja.setIcon(new ImageIcon(getClass().getResource("/img/baja.gif")));
       
         
    }
    public InfoPez(String nom,String imag,int tip,int al,int med ) {
        initComponents();
        jPanel1.setVisible(false);
        this.setLocationRelativeTo(null); 
        this.setBackground(new Color(0,0,0,0));
        this.jTextFieldnombre.setText(nom);
        this.jLabelimg.setIcon(new ImageIcon(getClass().getResource("/peces/"+imag)));
        this.jButton1.setFont(new Font("Wavepool",0,15));
        this.jTextFieldnombre.setFont(new Font("Wavepool",0,15));
        this.jButton2.setOpaque(false);
        this.jButton2.setContentAreaFilled(false);
        this.jLabel3.setFont(new Font("Wavepool",0,30));
        this.jLabel3.setText(pecera.dinero+".00");
        money=Integer.parseInt(pecera.dinero);
        tipo=tip;
        alim=al;
        medi=med;
        actualizar();
        v=0;
        
        comida1.setFont(new Font("Wavepool",0,15));
        comida1.setContentAreaFilled(false);
        comida1.setOpaque(false);
        comida2.setFont(new Font("Wavepool",0,15));
        comida2.setContentAreaFilled(false);
        comida2.setOpaque(false);
        comida3.setFont(new Font("Wavepool",0,15));
        comida3.setContentAreaFilled(false);
        comida3.setOpaque(false);
        comida4.setFont(new Font("Wavepool",0,15));
        comida4.setContentAreaFilled(false);
        comida4.setOpaque(false);
        
        med1.setFont(new Font("Wavepool",0,15));
        med1.setContentAreaFilled(false);
        med1.setOpaque(false);
        med2.setFont(new Font("Wavepool",0,15));
        med2.setContentAreaFilled(false);
        med2.setOpaque(false);
        med3.setFont(new Font("Wavepool",0,15));
        med3.setContentAreaFilled(false);
        med3.setOpaque(false);
        
         
        abierta=false;
       
    }
    static public String newName;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        med3 = new javax.swing.JButton();
        med2 = new javax.swing.JButton();
        med1 = new javax.swing.JButton();
        comida4 = new javax.swing.JButton();
        comida3 = new javax.swing.JButton();
        comida2 = new javax.swing.JButton();
        comida1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextFieldnombre = new javax.swing.JTextField();
        jLabelimg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelEnf = new javax.swing.JPanel();
        lleno2 = new javax.swing.JLabel();
        medio2 = new javax.swing.JLabel();
        baja2 = new javax.swing.JLabel();
        panelHambre = new javax.swing.JPanel();
        lleno1 = new javax.swing.JLabel();
        medio1 = new javax.swing.JLabel();
        baja1 = new javax.swing.JLabel();
        panelFeliz = new javax.swing.JPanel();
        lleno = new javax.swing.JLabel();
        medio = new javax.swing.JLabel();
        baja = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(644, 297));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("VENDER");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(120, 270, 100, 20);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(300, 250));
        jPanel1.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monedaOp1.gif"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 20, 210, 60);

        med3.setForeground(new java.awt.Color(255, 255, 255));
        med3.setText("$100");
        med3.setBorder(null);
        med3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        med3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        med3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med3ActionPerformed(evt);
            }
        });
        jPanel1.add(med3);
        med3.setBounds(190, 180, 70, 80);

        med2.setForeground(new java.awt.Color(255, 255, 255));
        med2.setText("$90");
        med2.setBorder(null);
        med2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        med2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        med2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med2ActionPerformed(evt);
            }
        });
        jPanel1.add(med2);
        med2.setBounds(120, 180, 70, 80);

        med1.setForeground(new java.awt.Color(255, 255, 255));
        med1.setText("$80");
        med1.setBorder(null);
        med1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        med1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        med1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med1ActionPerformed(evt);
            }
        });
        jPanel1.add(med1);
        med1.setBounds(50, 180, 70, 80);

        comida4.setForeground(new java.awt.Color(255, 255, 255));
        comida4.setText("$60");
        comida4.setBorder(null);
        comida4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        comida4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        comida4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comida4ActionPerformed(evt);
            }
        });
        jPanel1.add(comida4);
        comida4.setBounds(220, 100, 50, 80);

        comida3.setForeground(new java.awt.Color(255, 255, 255));
        comida3.setText("$50");
        comida3.setBorder(null);
        comida3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        comida3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        comida3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comida3ActionPerformed(evt);
            }
        });
        jPanel1.add(comida3);
        comida3.setBounds(160, 100, 50, 80);

        comida2.setForeground(new java.awt.Color(255, 255, 255));
        comida2.setText("$40");
        comida2.setBorder(null);
        comida2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        comida2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        comida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comida2ActionPerformed(evt);
            }
        });
        jPanel1.add(comida2);
        comida2.setBounds(90, 100, 50, 80);

        comida1.setForeground(new java.awt.Color(255, 255, 255));
        comida1.setText("$30");
        comida1.setBorder(null);
        comida1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        comida1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        comida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comida1ActionPerformed(evt);
            }
        });
        jPanel1.add(comida1);
        comida1.setBounds(30, 100, 50, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comida.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -20, 300, 320);

        jButton3.setText("jButton3");
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 180, 73, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 10, 300, 270);

        jTextFieldnombre.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldnombre.setText("nombre");
        jTextFieldnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextFieldnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextFieldnombreMouseExited(evt);
            }
        });
        getContentPane().add(jTextFieldnombre);
        jTextFieldnombre.setBounds(10, 30, 150, 30);
        getContentPane().add(jLabelimg);
        jLabelimg.setBounds(30, 60, 110, 100);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 0, 100, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-tienda.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 30, 50, 40);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(200, 100));
        jPanel2.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GloboFeliz.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(150, 0, 50, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GloboEnfermo.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(150, 60, 50, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GloboHambre.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(150, 30, 50, 30);

        panelEnf.setBackground(new java.awt.Color(255, 255, 255));
        panelEnf.setLayout(null);
        panelEnf.add(lleno2);
        lleno2.setBounds(0, 0, 120, 10);
        panelEnf.add(medio2);
        medio2.setBounds(0, 0, 70, 10);
        panelEnf.add(baja2);
        baja2.setBounds(0, 0, 40, 10);

        jPanel2.add(panelEnf);
        panelEnf.setBounds(20, 70, 120, 10);

        panelHambre.setBackground(new java.awt.Color(255, 255, 255));
        panelHambre.setLayout(null);
        panelHambre.add(lleno1);
        lleno1.setBounds(0, 0, 120, 10);
        panelHambre.add(medio1);
        medio1.setBounds(0, 0, 70, 10);
        panelHambre.add(baja1);
        baja1.setBounds(0, 0, 40, 10);

        jPanel2.add(panelHambre);
        panelHambre.setBounds(20, 40, 120, 10);

        panelFeliz.setBackground(new java.awt.Color(255, 255, 255));
        panelFeliz.setLayout(null);
        panelFeliz.add(lleno);
        lleno.setBounds(0, 0, 120, 10);
        panelFeliz.add(medio);
        medio.setBounds(0, 0, 70, 10);
        panelFeliz.add(baja);
        baja.setBounds(0, 0, 40, 10);

        jPanel2.add(panelFeliz);
        panelFeliz.setBounds(20, 10, 120, 10);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 160, 200, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoburbuja.gif"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 20, 220, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:

            sonido("cerrar.wav");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldnombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldnombreMouseExited
        // TODO add your handling code here:
        newName=this.jTextFieldnombre.getText();
    }//GEN-LAST:event_jTextFieldnombreMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(abierta==false){
            try {
            // TODO add your handling code here:

            sonido("pop.wav");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        }
            jPanel1.setVisible(true);
            abierta=true;
        }
        else if(abierta==true){
            try {
                sonido("cerrar.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
            jPanel1.setVisible(false);
            abierta=false;
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void med3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med3ActionPerformed
        // TODO add your handling code here:
        if(tipo==5&&money>=100){
            try {
                sonido("beber.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
            money=money-100;
            pecera.dinero=Integer.toString(money);
            this.jLabel3.setText(pecera.dinero+".00");
            medi=medi+2;
            actualizar();
        }
        else{
            try {
                sonido("insuficiente.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_med3ActionPerformed

    private void comida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comida1ActionPerformed
        // TODO add your handling code here:
        if(tipo==1&&money>=30){
            
            try {
                sonido("comer.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
            money=money-30;
            pecera.dinero=Integer.toString(money);
            this.jLabel3.setText(pecera.dinero+".00");
            alim=alim+2;
            actualizar();
            
        }
        else{
            try {
                sonido("insuficiente.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_comida1ActionPerformed

    private void comida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comida2ActionPerformed
        // TODO add your handling code here:
        if(tipo<=2&&money>=40){
            
            try {
                sonido("comer.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
            money=money-40;
            pecera.dinero=Integer.toString(money);
            this.jLabel3.setText(pecera.dinero+".00");
            alim=alim+2;
            actualizar();
        }
        else{
            try {
                sonido("insuficiente.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_comida2ActionPerformed

    private void comida3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comida3ActionPerformed
        // TODO add your handling code here:
        if(tipo<=3&&money>=50){
           
            try {
                sonido("comer.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
            money=money-50;
            pecera.dinero=Integer.toString(money);
            this.jLabel3.setText(pecera.dinero+".00");
            alim=alim+2;
            actualizar();
        }
        else{
            try {
                sonido("insuficiente.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_comida3ActionPerformed

    private void comida4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comida4ActionPerformed
        // TODO add your handling code here:
        if(money>=60){
            
            try {
                sonido("comer.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
            money=money-60;
            pecera.dinero=Integer.toString(money);
            this.jLabel3.setText(pecera.dinero+".00");
            alim=alim+2;
            actualizar();
        }
        else{
            try {
                sonido("insuficiente.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_comida4ActionPerformed

    private void med1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med1ActionPerformed
        // TODO add your handling code here:
        if(tipo==3&&money>=80){
            try {
                sonido("beber.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
            money=money-80;
            pecera.dinero=Integer.toString(money);
            this.jLabel3.setText(pecera.dinero+".00");
            medi=medi+2;
            actualizar();
        }
        else{
            try {
                sonido("insuficiente.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_med1ActionPerformed

    private void med2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med2ActionPerformed
        // TODO add your handling code here:
        if(tipo==4&&money>=90){
            try {
                sonido("beber.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
            money=money-90;
            pecera.dinero=Integer.toString(money);
            this.jLabel3.setText(pecera.dinero+".00");
            medi=medi+2;
            actualizar();
        }
        else{
            try {
                sonido("insuficiente.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_med2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        v=1;
        try {
            sonido("caja.wav");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InfoPez.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(InfoPez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoPez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoPez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoPez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baja;
    private javax.swing.JLabel baja1;
    private javax.swing.JLabel baja2;
    private javax.swing.JButton comida1;
    private javax.swing.JButton comida2;
    private javax.swing.JButton comida3;
    private javax.swing.JButton comida4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelimg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldnombre;
    private javax.swing.JLabel lleno;
    private javax.swing.JLabel lleno1;
    private javax.swing.JLabel lleno2;
    private javax.swing.JButton med1;
    private javax.swing.JButton med2;
    private javax.swing.JButton med3;
    private javax.swing.JLabel medio;
    private javax.swing.JLabel medio1;
    private javax.swing.JLabel medio2;
    private javax.swing.JPanel panelEnf;
    private javax.swing.JPanel panelFeliz;
    private javax.swing.JPanel panelHambre;
    // End of variables declaration//GEN-END:variables
}
