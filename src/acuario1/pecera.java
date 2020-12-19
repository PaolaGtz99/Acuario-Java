/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario1;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author pao_g
 */
public class pecera extends javax.swing.JFrame {

    /**
     * Creates new form pecera
     */
    public String nombre;
    public static String dinero;
    public static int xtib,ytib,numeroPeces;
    
    public static int numPez;
    
    public Clip clip;
    
    public void sonido(String arch) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        clip=AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/Sonido/"+arch)));
        clip.start();
    }
    
    public pecera(String nombre,String dinero) throws FontFormatException, IOException, InterruptedException, LineUnavailableException {
        initComponents();
        jPanel1.setOpaque(false);
        this.setLocationRelativeTo(null); 
        this.setBackground(new Color(0,0,0,0));
       
        salir.setOpaque(false);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted(false);
        salir.setBorder(null);
        this.nombre=nombre;
        pecera.dinero=dinero;
        pecera.numPez=1;
        pecera.numeroPeces=0;
        //tipo de letra----------------------------------------------
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src\\sonido\\Wavepool.otf")));
        this.jLabelNombre.setFont(new Font("Wavepool",0,36));
        this.jLabelNombre.setText(nombre);
        this.jLabelDinero.setText("$$ "+dinero+".00");
        this.jLabelDinero.setFont(new Font("Wavepool",0,36));
        this.loser.setFont(new Font("Wavepool",0,100));
        loser.setVisible(false);
        try {
            sonido("fondo.wav");
            //-----------------------------------------------------------
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        Tiburon t=new Tiburon();
        Juego j=new Juego();
        j.start();
    }
    
    public class Juego extends Thread{
        public void run(){
            
            while(true){
                
                System.out.print("");
                if(Integer.parseInt(pecera.dinero)<100){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(numeroPeces==0&&Integer.parseInt(pecera.dinero)<100){
                        try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        if(numeroPeces==0&&Integer.parseInt(pecera.dinero)<100){
                            try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                    }
                            if(numeroPeces==0&&Integer.parseInt(pecera.dinero)<100) break;
                        }
                    }
                    
                }
                //hola
            }
            System.out.println(numeroPeces);
            System.out.println(dinero);
            loser.setVisible(true);
            try {
                sonido("perder.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        loser = new javax.swing.JLabel();
        jButtonPeces = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();
        jButtonTienda = new javax.swing.JButton();
        jLabelCompra3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCompra1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCompra2 = new javax.swing.JLabel();
        jLabelCompra4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                salirMouseDragged(evt);
            }
        });
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(630, 390, 80, 60);

        jPanel1.setLayout(null);

        loser.setForeground(new java.awt.Color(255, 0, 0));
        loser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loser.setText("GAME OVER");
        jPanel1.add(loser);
        loser.setBounds(30, 40, 640, 280);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 700, 350);

        jButtonPeces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pez.png"))); // NOI18N
        jButtonPeces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPecesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPeces);
        jButtonPeces.setBounds(240, 20, 90, 70);

        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("NOMBRE");
        jLabelNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNombreMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(30, 30, 200, 60);

        jLabelDinero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDinero.setText("$$$");
        getContentPane().add(jLabelDinero);
        jLabelDinero.setBounds(450, 30, 220, 70);

        jButtonTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shop.png"))); // NOI18N
        jButtonTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTienda);
        jButtonTienda.setBounds(340, 20, 90, 70);
        getContentPane().add(jLabelCompra3);
        jLabelCompra3.setBounds(270, 240, 250, 220);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/algas2gif.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 80, 220, 360);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/burbujas.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 240, 200, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/burbujas.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 140, 190, 220);
        getContentPane().add(jLabelCompra1);
        jLabelCompra1.setBounds(290, 160, 260, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/burbujas.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 120, 190, 220);
        getContentPane().add(jLabelCompra2);
        jLabelCompra2.setBounds(-20, 320, 170, 140);
        getContentPane().add(jLabelCompra4);
        jLabelCompra4.setBounds(540, 160, 160, 300);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 700, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        try {
            // TODO add your handling code here:
            sonido("cerrar.wav");
            System.exit(0); 
            this.dispose();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_salirActionPerformed

    private void jButtonPecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPecesActionPerformed
        try {
            // TODO add your handling code here:
            sonido("pop.wav");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        }
        ComprarHilo hilo=new ComprarHilo();
        hilo.start();
       
    }//GEN-LAST:event_jButtonPecesActionPerformed

    private void salirMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseDragged
       
    }//GEN-LAST:event_salirMouseDragged

    private void jButtonTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTiendaActionPerformed
        try {
            // TODO add your handling code here:
            sonido("pop.wav");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TiendaHilo ht=new TiendaHilo();
        ht.start();
        
      
    }//GEN-LAST:event_jButtonTiendaActionPerformed

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        this.salir.setIcon( new ImageIcon(getClass().getResource("/img/salir2.png")));
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        // TODO add your handling code here:
       this.salir.setIcon(new ImageIcon(getClass().getResource("/img/salir.png")));
    }//GEN-LAST:event_salirMouseExited

    private void jLabelNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreMouseClicked
       
    }//GEN-LAST:event_jLabelNombreMouseClicked

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
            java.util.logging.Logger.getLogger(pecera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pecera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pecera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pecera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }
    
    private class ComprarHilo extends Thread{
        
        public void run(){
            Comprar c=new Comprar();
            c.setVisible(true);
            
            while(c.isShowing()){
                
                switch(c.tipo){
                    case 1: Pez t1=new Tipo1(); c.tipo=0; break;
                    case 2: Pez t2=new Tipo2(); c.tipo=0; break;
                    case 3: Pez t3=new Tipo3(); c.tipo=0; break;
                    case 4: Pez T4=new Tipo4(); c.tipo=0; break;
                    case 5: Pez T5=new Tipo5(); c.tipo=0; break;
                }
                jLabelDinero.setText("$$ "+dinero+".00");
            }
        }
    }
    
    private class TiendaHilo extends Thread {
    
        public void run(){
                
            tienda t=new tienda();
            t.setVisible(true);
            
            while(t.isShowing()){
               
             switch(t.var){
            case 1: jLabelCompra1.setIcon(new ImageIcon(getClass().getResource("/img/piedra.png"))); break;
            case 2: jLabelCompra2.setIcon(new ImageIcon(getClass().getResource("/img/estrella.gif"))); break;
            case 3: jLabelCompra3.setIcon(new ImageIcon(getClass().getResource("/img/tes.gif"))); break;
            case 4: jLabelCompra4.setIcon(new ImageIcon(getClass().getResource("/img/cala.png"))); break;
             }
             jLabelDinero.setText("$$ "+dinero+".00");
            }
        }
    }
    
 ////////////////////////////////////////////TIBURON/////////////////////////////////////////////////////
    
    public class Tiburon extends Thread{
       
        private javax.swing.JLabel tib;
        public Tiburon(){
            tib=new javax.swing.JLabel();
            tib.setSize(400, 400);
            tib.setBounds(-100, 100, 400,400);
            jPanel1.add(tib);
            start();
        }
        public void run(){
            int x=-150;
            int y,neg;
            
            while(true){
                
               y=(int)(Math.random()*100);
               neg=(int)(Math.random()*3)+1;
               
               if(neg!=1) y=-y;
               else y=y-30;
               
               
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    sonido("tiburon.wav");
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(tib.getX()<jPanel1.getWidth()){
                    
                    tib.setIcon(new ImageIcon(getClass().getResource("/peces/tiburon.gif")));
                    
                    tib.setLocation(x, y);
                    xtib=x;
                    ytib=y;
                    x=x+2;
                    try {
                        Thread.sleep(70);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                x=-150;
                tib.setLocation(x, 0);
                xtib=-150; ytib=-150;
                tib.setIcon(new ImageIcon(getClass().getResource("")));
            }
        }
    }
 ////////////////////////////////////////////PECES///////////////////////////////////////////////////////   
 
    public abstract class Pez {
    
    String nomPez;    
    private javax.swing.JLabel img;
    protected String der,izq,derEnf,izqEnf;
    int alimento,medicamento,ganancia,tiempo,tipo,venta;
    public abstract void disminuir();
    
   
    public void crear(){
       //creando el jlabel
        
        img=new javax.swing.JLabel();
        img.setSize(200, 200);
       venta=0;
       numeroPeces++;
        
        img.setIcon(new ImageIcon(getClass().getResource("/peces/"+der)));
        jPanel1.add(img);//AÑADIR JLABEL EN EL JFRAME 
        nomPez="Pez"+pecera.numPez++;
        
        Movimiento mov=new Movimiento();
        mov.start();
        
        img.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                
                Info inf=new Info();
                inf.start();
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {  }

            @Override
            public void mouseExited(MouseEvent e) {}
            
        });
        
    }
    
    private class Info extends Thread{
        
        public void run(){
            
            InfoPez p=new InfoPez(nomPez,der,tipo,alimento,medicamento); p.setVisible(true);
            while(p.isShowing()){
                nomPez=InfoPez.newName;
                jLabelDinero.setText("$$ "+dinero+".00");
                alimento= p.alim;
                medicamento=p.medi;
                venta=p.v;
                
                if(venta==1){
                    p.dispose();
                    pecera.dinero=Integer.toString(Integer.parseInt(pecera.dinero)+(ganancia+60));
                }
                
            }
            
            jLabelDinero.setText("$$ "+dinero+".00");
        }
    }
    
    private class Movimiento extends Thread{
        
        public void run(){
            int t=0;
            int a=0;
            //lugar donde se posicionara
            int y=(int)(Math.random()*230); 
            int x=(int)(Math.random()*jPanel1.getWidth()+1); 
        
            
            while(alimento>0&&venta==0){
                
                //imagen hacia la derecha
                while(img.getX()<jPanel1.getWidth()-110&&venta==0){
                    
                    
                    if(x>=xtib&&x<=xtib+130&&y>=ytib+35&&y<=ytib+200){
                        venta=2;
                    }
                    if(venta==1){
                        break;
                    }
                    //CONDICION PARA VER SI TIENE HAMBRE
                    if(alimento<7||medicamento<7&&medicamento!=0){
                        img.setIcon(new ImageIcon(getClass().getResource("/peces/"+derEnf)));
                    }
                    else{
                        img.setIcon(new ImageIcon(getClass().getResource("/peces/"+der)));
                    }
                    
                    //MOVIMIENTO DEL PEZ
                    try {
                        
                        img.setLocation(x, y);
                        x=x+2;
                        Thread.sleep(100);
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    //TIEMPO TRANSCURRIENDO PARA QUE DE GANANCIA
                    t++;
                    if(t==tiempo){
                        t=0;
                        pecera.dinero=Integer.toString(Integer.parseInt(pecera.dinero)+(ganancia+(alimento*2)));
                        jLabelDinero.setText("$$ "+dinero+".00");
                        try {
                            sonido("moneda.wav");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    //TIEMPO TRANSCURRIENDO PARA QUE LE DE HAMBRE
                    a++;
                    if(a==150){
                        a=0;
                        disminuir();
                    }
                    
                }
                
                y=y+4;
                //imagen hacia la izquierda
                while(img.getX()>0&&venta==0){
                    
                    if(x>=xtib&&x<=xtib+130&&y>=ytib+35&&y<=ytib+200){
                        venta=2;
                    }
                    
                    if(venta==1){
                        break;
                    }
                    
                    //VALIDACION PARA VER SI EL PEZ TIENE HAMBRE O ESTA ENFERMO
                    if(alimento<7||medicamento<7&&medicamento!=0){
                        img.setIcon(new ImageIcon(getClass().getResource("/peces/"+izqEnf)));
                    }
                    else{
                       img.setIcon(new ImageIcon(getClass().getResource("/peces/"+izq))); 
                    }
                    
                    //MOVER PEZ
                    try {
                        
                        img.setLocation(x,y);
                        x=x-2;
                        Thread.sleep(100);
                        t++;
                    } catch (InterruptedException ex) {
                        Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    //TIEMPO TRANSCURRIENDO PARA QUE DE GANANCIA
                    if(t==tiempo){
                        t=0;
                        
                        pecera.dinero=Integer.toString(Integer.parseInt(pecera.dinero)+(ganancia+(alimento*2)));
                        jLabelDinero.setText("$$ "+dinero+".00");
                        try {
                            sonido("moneda.wav");
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    //TIEMPO TRANSCURRIENDO PARA QUE LE DE HAMBRE
                    a++;
                    if(a==150){
                        a=0;
                        disminuir();
                    }
                }
                y=y-4;
                
            }
           
            
            img.setVisible(false);
            img.setIcon(new ImageIcon(getClass().getResource("")));
            numeroPeces--;
            
            if(venta==0){
                try {
                sonido("muerte.wav");
            } catch (LineUnavailableException ex) {
                Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
            } 
            }
            if(venta==2){
                try {
                    sonido("morder.wav");
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(pecera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
           
               
            
        }
    }
 
    
           
 }
    
 public class Tipo1 extends Pez{

    
    public Tipo1(){
        this.der="fish(1).gif";
        this.izq="fish(1)2.gif";
        this.derEnf="fish(1)Enfermo.gif";
        this.izqEnf="fish(1)2Enfermo.gif";
        this.ganancia=30;
        this.tiempo=300;
        this.tipo=1;
        this.medicamento=0;
        this.alimento=10;
       
        crear();
    }
    
    public void disminuir(){
        alimento=alimento-2;
    }
    }
 
  public class Tipo2 extends Pez{

    
    public Tipo2(){
        this.der="fish(2).gif";
        this.izq="fish(2)2.gif";
        this.derEnf="fish(2)Enfermo.gif";
        this.izqEnf="fish(2)2Enfermo.gif";
        this.ganancia=40;
        this.tiempo=320;
        this.tipo=2;
        this.medicamento=0;
        this.alimento=10;
       
        crear();
    }
    
    public void disminuir(){
        alimento=alimento-2;
    }
    }
  
   public class Tipo3 extends Pez{

    
    public Tipo3(){
        this.der="fish(4).gif";
        this.izq="fish(4)2.gif";
        this.derEnf="fish(4)Enfermo.gif";
        this.izqEnf="fish(4)2Enfermo.gif";
        this.ganancia=50;
        this.tiempo=350;
        this.tipo=3;
        this.medicamento=10;
        this.alimento=10;
       
        crear();
    }
    
    public void disminuir(){
        alimento=alimento-2;
        medicamento--;
    }
    }
   
    public class Tipo4 extends Pez{

    
    public Tipo4(){
        this.der="fish(3).gif";
        this.izq="fish(3)2.gif";
        this.derEnf="fish(3)Enfermo.gif";
        this.izqEnf="fish(3)2Enfermo.gif";
        this.ganancia=60;
        this.tiempo=350;
        this.tipo=4;
        this.medicamento=10;
        this.alimento=10;
       
        crear();
    }
    
    public void disminuir(){
        alimento=alimento-2;
        medicamento--;
    }
    }
    
     public class Tipo5 extends Pez{

    
    public Tipo5(){
        this.der="fish(5).gif";
        this.izq="fish(5)2.gif";
        this.derEnf="fish(5)Enfermo.gif";
        this.izqEnf="fish(5)2Enfermo.gif";
        this.ganancia=70;
        this.tiempo=360;
        this.tipo=5;
        this.medicamento=10;
        this.alimento=10;
       
        crear();
    }
    
    public void disminuir(){
        alimento=alimento-2;
        medicamento--;
    }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonPeces;
    private javax.swing.JButton jButtonTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCompra1;
    private javax.swing.JLabel jLabelCompra2;
    private javax.swing.JLabel jLabelCompra3;
    private javax.swing.JLabel jLabelCompra4;
    private javax.swing.JLabel jLabelDinero;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loser;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
