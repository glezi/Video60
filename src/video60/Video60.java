/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video60;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoConDibujos mimarco = new MarcoConDibujos(); 
        mimarco.setVisible(true); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }
    
}
class MarcoConDibujos extends JFrame{
    
    public MarcoConDibujos(){
        setTitle("prueba de Dibujo"); 
        
        setSize(500,500); 
        
        LaminaConFiguras milamina = new LaminaConFiguras(); 
        add(milamina); 
    }
}

class LaminaConFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g; 
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double(); 
        elipse.setFrame(rectangulo); 
        g2.draw(elipse); 
        g2.draw(new Line2D.Double(100,100,300,250));
        
        double CentroenX=rectangulo.getCenterX(); 
        double CentroenY=rectangulo.getCenterY(); 
        double radio = 150; 
        
        Ellipse2D circulo = new Ellipse2D.Double(); 
        circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
        g2.draw(circulo);
        
    
    }
}