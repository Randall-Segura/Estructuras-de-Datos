/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9listadoblecircular;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class Menu {
    
    ListaDC lis= new ListaDC();
    
    int op=0;
    String botones[]={"Agregar","Extraer", "Mostrar","Salir"};
    
    public void opciones(){
        
        
        do{
            
           op = JOptionPane.showOptionDialog(null, "Escoja su opción: ", "Menu Principal",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, botones, botones[0]);
            switch (op) {
                case 0:
                    lis.agregar();
                    break;
                case 1:
                    lis.extraer();
                    break;
                case 2:
                    lis.mostrar();
                    break;
                default:
                    System.exit(0);
            }
            
        }while(op!=3);
        
    }
    
}
