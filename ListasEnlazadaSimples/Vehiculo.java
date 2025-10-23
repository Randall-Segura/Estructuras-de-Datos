/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8listasenlazadassimples;

/**
 *
 * @author Randall Segura
 */
public class Vehiculo {
    
    
    //atributos
    
    private String marca;
    private int modelo;
    
    
    //constructor vacio
    
    public Vehiculo(){
        this.marca="";
        this.modelo=0;
    }
    
    //getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
    
}
