/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlazadaSimple;

import Modelo.Medicamento;

/**
 *
 * @author Randall Segura
 */
public class NodoLES {
    
    
    //atributos
    
    private Medicamento dato;
    private NodoLES siguiente;
    
    //constructor lleno

    public NodoLES(Medicamento dato) {
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

    public NodoLES getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLES siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
