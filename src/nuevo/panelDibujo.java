package nuevo;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class panelDibujo extends JPanel {
    Scanner entrada = new Scanner(System.in);


    public void paintComponent(Graphics g){

        super.paintComponent(g);
        int anchura=getWidth();
        int altura=getWidth();
        /*
        //origen

        g.drawLine(10,10,100,10);
        g.drawLine(10,80,100,80);
        g.drawLine(10,10,10,180);
        g.drawLine(10,180,100,180);
        g.drawLine(100,180,100,0);
        //g.drawLine(0,0,anchura,altura);
        //destino
        //g.drawLine(0,altura,anchura,0);

        */

        String Nombre;
        double peso;
        double Altura;
        double Resultado;


        Nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        g.drawString(Nombre,50,50);

        peso= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en Kg: "));
        Altura= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en cm: "));
        Resultado= (peso/altura);
        g.drawString(String.valueOf(Resultado),200,200);










    }


}









