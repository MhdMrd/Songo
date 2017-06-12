
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mourad
 */
public class Case extends JLabel{
    private Graphics g;
    private int nbPions=5;
    private int tCase;
    private int numCase=1;
    private int ligneCase=1;
    
    public void paint (Graphics g){ 
        
        //super.paint(g);
        
        g.drawRoundRect(0, 0, this.getWidth(), this.getHeight(), WEST, RIGHT);
        
        for(int i=0; i<nbPions; i++){
            Point p= this.getLocation();
            int largeur, longueur;
            largeur=this.getWidth();
            tCase=largeur;
            longueur=this.getHeight();
            new Pion(g, largeur*i, longueur*i,largeur , longueur, getNbPionsCase());
        }
        
    }
    
    public void dessinerPionsCase(Graphics appletG){
        g=appletG;
        
        for(int i=0; i<nbPions; i++){
            Point p= this.getLocation();
            int largeur, longueur;
            largeur=this.getWidth();
            longueur=this.getHeight();
            //System.out.println("lar="+largeur);
            
            new Pion(g, largeur*(i+1), longueur*(i+1), (int)this.getWidth(), (int)this.getHeight(), getNbPionsCase());;
            
        }
        
    }
    
    public int getNbPionsCase(){
        return nbPions;
    }
    
    public int getLargeurCase(){
        return this.getWidth();
    }
    
    public int getLongueurCase(){
        return this.getHeight();
    }
    public int getTailleCase(){
        return tCase;
    }
    
    public void setNbPions(int nb){
        this.nbPions=nb;
    }
    public int getNumCase(){
        return numCase;
    }
    
    public void setNumCase(int n){
        this.numCase=n;
    }
    
    public int getLigneCase(){
        return ligneCase;
    }
    
    public void setLigneCase(int l){
        this.ligneCase=l;
    }
    
}