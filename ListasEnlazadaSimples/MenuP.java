/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8listasenlazadassimples;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class MenuP {
    ListaSimple lista= new ListaSimple();
    int op;
    
    public void opciones(){
        op=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opcion deseada: "
        +"\n1-Agregar elemento"
        +"\n2-Extraer elemento"
        +"\n3-Mostrar elementos"
        +"\n4-Salir"));
        
        switch (op){
            case 1:
                lista.agregar();
                opciones();
                break;
            case 2:
                lista.extraer();
                opciones();
                break;
            case 3:
                lista.mostrar();
                opciones();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite una opcion valida");
                opciones();
                break;
                
        }
    }
    
}
