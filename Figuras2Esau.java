/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esaul
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author esaul
 */
public class Figuras2Esau extends JPanel{
    
    private JFrame ventana;
        
    private Container contenedor;
    
    public Figuras2Esau(){
        ventana = new JFrame("Dibujando figuras basicas");
        
        ventana.setSize(800,600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        ventana.setSize(800,600);
        contenedor.add(this, BorderLayout.CENTER);
        
        
       
        
    }
     @Override
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //1)casita
        g.setColor(Color.black);
        g.drawString("1)Casita", 130, 10);
        g.setColor(Color.red);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        //techo
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50,150, 20);
        //puerta
        g.setColor(Color.black);
        g.drawLine(120,100,120,65);
        g.drawLine(121,65,140,65);
        g.drawLine(140,100,140,65);
        //Camino
        g.setColor(Color.orange);
        g.drawLine(120,100,70,120);
        g.drawLine(140,100,85,120);
        
        //2 Barras
        g.setColor(Color.black);
        g.drawString("2)Barras", 375, 10);
        g.setColor(Color.red);
        g.drawLine(300, 100, 300, 65);
        g.drawLine(300, 65, 315, 65);
        g.drawLine(315, 100, 315, 65);
        g.drawLine(300, 100, 315, 100);
        
        g.setColor(Color.red);
        g.drawLine(325, 100, 325, 55);
        g.drawLine(325, 55, 345, 55);
        g.drawLine(345, 100, 345, 55);
        g.drawLine(325, 100, 345, 100);
        
        g.drawLine(355, 100, 355, 45);
        g.drawLine(355, 45, 375, 45);
        g.drawLine(375, 100, 375, 45);
        g.drawLine(355, 100, 375, 100);
        
        g.drawLine(385, 100, 385, 35);
        g.drawLine(385, 35, 400, 35);
        g.drawLine(400, 100, 400, 35);
        g.drawLine(385, 100, 400, 100);
        
        g.drawLine(410, 100, 410, 25);
        g.drawLine(410, 25, 420, 25);
        g.drawLine(420, 100, 420, 25);
        g.drawLine(410, 100, 420, 100);
        //
        g.setColor(Color.black);
        g.drawString("3)Ovalos", 500, 10);
        g.drawOval(550, 10, 40, 150);
        g.drawOval(500, 30, 140, 50);
        g.drawOval(495, 58, 170, 70);
        
        
        //Circulo
        g.setColor(Color.black);
        g.drawString("4)Carita", 95, 170);
        g.drawOval(40, 200, 170, 170);
        g.drawOval(90, 225, 30, 30);
        g.fillOval(100,230,15,15);
        g.drawOval(140, 225, 30, 30);
        g.fillOval(150,230,15,15);
        g.drawOval(100, 280, 60, 60);
        
        g.setColor(Color.black);
        g.drawString("5)Ovalos", 300, 170);
        g.drawOval(350, 180, 40, 200);
        g.drawOval(300, 195, 140, 55);
        g.drawOval(270, 230, 220,90);
        
        g.setColor(Color.red);
        g.drawString("5)Triangulos", 500, 170);
        g.drawLine(550, 300,650,300);
        g.drawLine(550, 300,620,280);
        g.drawLine(650, 300,620,280);
        
        g.drawLine(620, 280,620,255);
        g.drawLine(620, 280,680,280);
        g.drawLine(680, 280,620,255);
        
        g.drawLine(520, 280,520,245);
        g.drawLine(520, 280,560,280);
        g.drawLine(560, 280,520,245);
        
        
       
     
        
    }
    
}