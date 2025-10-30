/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

import Modelo.Medicamento;

/**
 *
 * @author Randall Segura
 */
public class NodoPila {
    
    private Medicamento elemento;
    private NodoPila siguiente;
    
    //constructor vacio

    public NodoPila() {
        this.siguiente = null;
    }
    
    
    //getters and setters

    public Medicamento getElemento() {
        return elemento;
    }

    public void setElemento(Medicamento elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
   

   
    
    
    
    
    
}
