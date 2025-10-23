/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnvioPaquetes;

/**
 *
 * @author Randall Segura
 */
public class Paquete {
    
    
    //atributos
    
    private int id;
    private String descripcion;
    private int peso;
    
    //constructor vacio
    
    public Paquete(){
        this.id=0;
        this.descripcion="";
        this.peso=0;
    }
    
    
    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
