/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prooofconcept2d;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author servkey
 */
public class CanvasDib extends Canvas implements  Runnable, KeyListener{
    
    private int x = 320;
    private int y = 200;
    private BufferedImage sample;
    
    public CanvasDib(){
    addKeyListener(this);
    }
    private BufferedImage cargarImagen(String file){
        BufferedImage img = null;
        try{
            URL image = getClass().getResource(file);
            img = ImageIO.read(image);
        }catch(Exception e){
        }
         return img;
    }
    
    @Override
    public void paint(Graphics g)
    {       
         //g.setColor(Color.BLUE);     //Activa el color azul
        // g.fillOval(getX(), getY(), 60, 60); //Dibuja un óvalo
         if (sample == null) sample = cargarImagen("./images/jake.png");
         g.drawImage(sample, x, y, this);

    }   

    @Override
    public void update(Graphics g)
    {
        super.update(g);
        paint(g);
    }
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
   
    @Override
    public void keyTyped(KeyEvent ke) { }

    @Override
    public void keyPressed(KeyEvent ke) {
    
         //Presiono flecha arriba
               if (ke.getKeyCode() == KeyEvent.VK_UP){ 
                                                         
                   y--;
//System.out.println("Presiono arriba" + x);               //Presiono flecha abajo
               } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                                                        
                   y++;
        //System.out.println("Presiono abajo" + x);
               //Presiono flecha izquierda
               } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) { 
                                                       
                   x--;
//System.out.println("Presiono izquierda" + y);
               //Presiono flecha derecha
               } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) { 
                                                         
                   x++;
                  // System.out.println("Presiono derecha" + y);
               }
    
    }

    @Override
    public void keyReleased(KeyEvent ke) { }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
