


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mourad
 */
public class Pion {
    private Graphics g;
    private int tailleCase;
    Random rand = new Random();
    Pion(Graphics appletG, int x, int y, int largeurCase, int longueurCase, int nBPionsCase){
        
        g=appletG;
        int xPion,yPion,r;
         r=rand.nextInt();
         r=(r>=0)?r:-r;
           
        xPion=r%(largeurCase - getTaillePion());
        yPion=r%(longueurCase - getTaillePion());
        g.fillOval(xPion, yPion, 10, 10);
        g.drawString(""+nBPionsCase, x+5, y+11);
        
    }

    
    
    public int getTaillePion() {
        return 10;
    }
    
}
