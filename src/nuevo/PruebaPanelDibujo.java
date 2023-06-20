package nuevo;

import javax.swing.*;

public class PruebaPanelDibujo {
    public static void main(String[] args) {


        //creo una instancia de la clase panelDibujo
        panelDibujo panel =new panelDibujo();
        //Creo un marco en la ventana

        JFrame aplicacion=new JFrame();
        //Pongo un boton para cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);  //agregar un panel a la ventana
       aplicacion.setSize(250,250);
       aplicacion.setVisible(true); //permite que se vea la ventana









    }


}
