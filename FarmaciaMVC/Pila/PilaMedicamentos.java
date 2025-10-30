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
public class PilaMedicamentos {
    
    
    //atributos
    
    private NodoPila cima;
    
    //constructor vacio
    
    public PilaMedicamentos(){
        this.cima=null;
    }
    
    //metodos
    
    public boolean vacia(){
        return cima==null;
    }
    
    
    
    public void apilarMedicamento(Medicamento med){
        
        NodoPila nuevo= new NodoPila();
        nuevo.setElemento(med);
        
        if(vacia()){
            cima=nuevo;
        }else{
            nuevo.setSiguiente(cima);
            cima=nuevo;
        }
        
    }
    
    public String mostrarHistorialEliminados(){
        if(cima==null){
            return "De momento no se han eliminado medicamentos";
        }
        
        String historial="Historial de medicamentos eliminados: \n\n";
        NodoPila aux=cima;
        
        while(aux!=null){
            Medicamento med= aux.getElemento();
            historial+="Nombre: " + med.getNombre()+
                    "\nId: " + med.getId()+
                    "\nCantidad: " + med.getCantidad()+
                    "\nFecha Caducidad: " + med.getFechaCaducidad()+"\n---------------------------------------------\n";
            aux=aux.getSiguiente();
        }
        return historial;
    }
    
    
    
}
