/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

import Modelo.Medicamento;

/**
 *
 * @author Randall Segura
 */
public class NodoArbol {
    
    //atributos
    
    private Medicamento dato;
    private NodoArbol enlaceIzq;
    private NodoArbol enlaceDer;
    
    
    //constructor vacio

    public NodoArbol() {
        this.enlaceIzq=null;
        this.enlaceDer=null;
    }
    
    
    //getters and setters

    public Medicamento getDato() {
        return dato;
    }

    public void setDato(Medicamento dato) {
        this.dato = dato;
    }

    public NodoArbol getEnlaceIzq() {
        return enlaceIzq;
    }

    public void setEnlaceIzq(NodoArbol enlaceIzq) {
        this.enlaceIzq = enlaceIzq;
    }

    public NodoArbol getEnlaceDer() {
        return enlaceDer;
    }

    public void setEnlaceDer(NodoArbol enlaceDer) {
        this.enlaceDer = enlaceDer;
    }
    
    
    
    
    
}
