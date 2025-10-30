/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2randallseguraj;

/**
 *
 * @author Randall Segura
 */
public class Nodo {
    
    //atributos
    
    private Alquiler dato;
    private Nodo siguiente;
    
    
    //constructor lleno

    public Nodo(Alquiler dato) {
        this.dato = dato;
        this.siguiente = null;
    }

   
    
    //getters and setters

    public Alquiler getDato() {
        return dato;
    }

    public void setDato(Alquiler dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
   
    
    
    
    
}
