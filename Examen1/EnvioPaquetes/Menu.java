/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnvioPaquetes;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class Menu {
    
    
    Pila p = new Pila();
    
     public void opciones(){
     while (true){
     int op=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Principal"
                                                     +"\n1-Insertar paquete"
                                                     +"\n2-Eliminar paquete"
                                                     +"\n3-Mostrar paquetes"
                                                     +"\n4-Buscar paquete"
                                                     +"\n5-Calcular costo de envio"
                                                     +"\n6-Salir"));
     
     
     switch (op){
         case 1:
             p.insercion();
             
             break;
         case 2:
             p.eliminar();
             
             break;
         case 3:
             p.mostrar();
             
             break;
         case 4:
             p.busqueda();
             
             break;
         case 5:
             p.envio();
             
             break;
         case 6:
             System.exit(0);
         default:
             JOptionPane.showMessageDialog(null,"Digite unicamente las opciones 1-6");
              
     }
    
     }  
}
}