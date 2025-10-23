/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9listadoblecircular;

/**
 *
 * @author Randall Segura
 */
public class Nodo {
    
    //atributos
    
    private Curso elemento;
    private Nodo siguiente;
    private Nodo anterior;
    
    //constructor vacio

    public Nodo() {
        this.siguiente = null;
        this.anterior = null;
    }
    
    
    
    //getters and setters

    public Curso getElemento() {
        return elemento;
    }

    public void setElemento(Curso elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
    
    
    
    
}
