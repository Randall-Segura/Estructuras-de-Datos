/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircular;

import Modelo.Medicamento;

/**
 *
 * @author Randall Segura
 */
public class NodoLC {
    
    //atributos
    
    private Medicamento dato;
    private NodoLC siguiente;
    
    //constructor lleno

    public NodoLC(Medicamento dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    
    //getters and setters

    public Medicamento getDato() {
        return dato;
    }

    public void setDato(Medicamento dato) {
        this.dato = dato;
    }

    public NodoLC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLC siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
