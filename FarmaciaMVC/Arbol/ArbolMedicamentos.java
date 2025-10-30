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
public class ArbolMedicamentos {
    
    //atributos
    
    private NodoArbol raiz;
    
    //constructor vacio

    public ArbolMedicamentos() {
        this.raiz = null;
    }
    
    
    //metodos 
    
    
    public boolean vacio(){
        return raiz==null;
    }
    
    public void insertarMedicamento(Medicamento med){
        
        NodoArbol nuevo= new NodoArbol();
       nuevo.setDato(med);
        
        if (vacio()){
            raiz=nuevo;
        }else{
            insertarNodo(raiz,nuevo);
        }
        
    }
    
    private void insertarNodo(NodoArbol actual, NodoArbol nuevo){
        if(nuevo.getDato().getId()<= actual.getDato().getId()){
            if(actual.getEnlaceIzq()==null){
                actual.setEnlaceIzq(nuevo);
            }else{
                insertarNodo(actual.getEnlaceIzq(),nuevo);
            }
        }else{
            if (actual.getEnlaceDer()==null){
                actual.setEnlaceDer(nuevo);
            }else{
                insertarNodo(actual.getEnlaceDer(),nuevo);
            }
        }
    }
    
    
    private String inorden(NodoArbol n){
        if(n==null){
            return "";
        }
        
        String busqueda=inorden(n.getEnlaceIzq());
       
        busqueda+="\nNombre: " + n.getDato().getNombre()+
                "\nId: " + n.getDato().getId()+
                "\nCantidad: " + n.getDato().getCantidad()+
                "\nFecha Caducidad: " + n.getDato().getFechaCaducidad()+"\n----------------------------------------\n";
        busqueda+=inorden(n.getEnlaceDer());
        
        return busqueda;
    }
    
    public String InOrden(){
        return "Medicamentos mostrados inorden:" + inorden(raiz);
    }
    
    public void eliminarRecursivo(int id){
        raiz= eliminarRecursivo(raiz,id);
        
    }
    
    private NodoArbol eliminarRecursivo(NodoArbol nodo, int id){
        if (nodo==null){
            return null;
        }
        
        int idNodo=nodo.getDato().getId();
        
        if (id<idNodo){
            nodo.setEnlaceIzq(eliminarRecursivo(nodo.getEnlaceIzq(),id));
        }else if(id>idNodo){
            nodo.setEnlaceDer(eliminarRecursivo(nodo.getEnlaceDer(),id));
        }else{
            //Sin hijos
            if(nodo.getEnlaceIzq()==null & nodo.getEnlaceDer()==null){
                return null;
            }
            
            //Un hijo
            if(nodo.getEnlaceIzq()==null){
                return nodo.getEnlaceDer();
            }else if(nodo.getEnlaceDer()==null){
                return nodo.getEnlaceIzq();
            }
            
            //Dos hijos
            
            NodoArbol sucesor= encontrarMinimo(nodo.getEnlaceDer());
            nodo.setDato(sucesor.getDato());
            nodo.setEnlaceDer(eliminarRecursivo(nodo.getEnlaceDer(),sucesor.getDato().getId()));
        }
        return nodo;
    }
    
    private NodoArbol encontrarMinimo(NodoArbol nodo){
        while(nodo.getEnlaceIzq()!=null){
            nodo=nodo.getEnlaceIzq();
        }
        return nodo;
    }
    
    
    
    
}
