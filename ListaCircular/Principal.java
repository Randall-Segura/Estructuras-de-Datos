/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem9listacircular;

/**
 *
 * @author Randall Segura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular lc= new ListaCircular();
        lc.insertar(new Persona(8,"Randall"));
        lc.insertar(new Persona(62,"Valeria"));
        lc.insertar(new Persona(14,"Yorleny"));
        lc.insertar(new Persona(20,"Dulce"));
        lc.insertar(new Persona(10,"Samuel"));
        
        System.out.println(lc.toString());
        lc.extraer();
        System.out.println("");
        System.out.println("Datos actualizados: \n" + lc.toString());
    }
    
}
