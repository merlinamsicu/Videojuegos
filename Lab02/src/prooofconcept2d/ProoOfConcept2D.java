/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prooofconcept2d;

import java.awt.BorderLayout;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.sound.sampled.Clip;
/**
 *
 * @author servkey
 */
public class ProoOfConcept2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanvasDib canvas = new CanvasDib();
        FrmGame fr = new FrmGame(canvas);
        fr.setSize(800, 600);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     javax.sound.sampled.Clip sonido;
        try{
     sonido =AudioSystem.getClip();
     sonido.open(AudioSystem.getAudioInputStream(new File("c:/horadeaventura.wav")));
     
     }catch(Exception e){
            System.out.println(""+e);
              
     }
     //  fondo.loop(Clip.LOOP_CONTINUOUSLY);
    
    
    }
}
