/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9listacircular;

/**
 *
 * @author Randall Segura
 */
public class Nodo {
    
    //atributos
    
    private Persona dato;
    private Nodo siguiente;
    
    //constructor lleno

    public Nodo(Persona dato) {
        this.dato = dato;
        this.siguiente=null;
    }
    
    
    //getters and setters

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
    
}
