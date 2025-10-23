/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem6colas;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class Cola {

    //atributos
    private Nodo inicio;
    private Nodo fin;

    //constructor vacio
    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }

    }
    
    
    public void encolar(){
        //creamos el objeto que se va a insertar en el nodo
        
        Estudiante e= new Estudiante();
        e.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        e.setCalificacion(Double.parseDouble(JOptionPane.showInputDialog("Digite su calificacion")));
        
        
        //se agrega el objeto estudiante en el nuevo nodo
        Nodo nuevo= new Nodo();
        //se agrega el estudiante al nodo nuevo
        nuevo.setElemento(e);
        //se inserta el nodo en la cola
        
        if (vacia()){ //si esta vacia, se coloca el unico nodo
            inicio=nuevo;
            fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    
    
    public void desencolar(){
        if (!vacia()){
            System.out.println("Extraido: " + inicio.getElemento().getNombre());
            inicio=inicio.getSiguiente();
            JOptionPane.showMessageDialog(null,"Elemento extraido", "Desencolar", JOptionPane.CLOSED_OPTION);
        }else{
            JOptionPane.showMessageDialog(null,"No se puede extraer", "Cola vacia", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public void mostrar(){
        if (!vacia()){
            String s="";
            Nodo aux=inicio;
            while (aux!=null){
                s+=aux.getElemento().getNombre() + " - " + aux.getElemento().getCalificacion() + " ← ";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Contenido de la cola: \n\n" + s, "Mostrar datos", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No se puede mostrar", "Cola vacia", JOptionPane.ERROR_MESSAGE);
        }
    }

}
