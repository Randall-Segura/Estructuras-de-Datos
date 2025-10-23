/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnvioPaquetes;

/**
 *
 * @author Randall Segura
 */
public class Nodo {
    
    //atributos
    
    private Paquete dato;
    private Nodo siguiente;
    
    //constructor vacio
    
    public Nodo(){
        this.siguiente=null;
    }
    
    
    //getters and setters

    public Paquete getDato() {
        return dato;
    }

    public void setDato(Paquete dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
