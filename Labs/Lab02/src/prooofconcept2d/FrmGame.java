/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prooofconcept2d;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.ImageProducer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author servkey
 */
public class FrmGame extends JFrame{
    private Thread t;
    private CanvasDib c;
    public FrmGame(CanvasDib c){
        this.c = c;
        add(c);
        
        //Iniciar hilo
        t = new Thread(){
              public void run(){
                  updating();
              }
        };
        t.start();
     
        this.getContentPane().setBackground(Color.green);
    }
    public void updating(){
        while (true){
            try {
                Thread.sleep(1000);
                c.repaint();
               
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGame.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
    }
}
