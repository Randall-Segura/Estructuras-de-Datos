/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9listacircular;

/**
 *
 * @author Randall Segura
 */
public class Persona {
    
    //atributos
    
    private int id;
    private String nombre;
    
    //constructor lleno

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
