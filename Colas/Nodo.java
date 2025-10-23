/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem6colas;

/**
 *
 * @author Randall Segura
 */
public class Nodo {
    
    //atributos
    
    private Estudiante elemento;
    private Nodo siguiente;
    
    //constructor vacio
    
    public Nodo(){
        this.siguiente=null;
    }
    
    
    //getters and setters

    public Estudiante getElemento() {
        return elemento;
    }

    public void setElemento(Estudiante elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    



    
}
