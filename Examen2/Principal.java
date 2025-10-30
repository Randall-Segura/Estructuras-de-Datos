/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2randallseguraj;

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
        lc.agregarAlquiler(new Alquiler(1, "Sedan", "1212136", "Toyota", "Randall", "Aserri", 70281811, "Marzo", "Mayo"));
        lc.agregarAlquiler(new Alquiler(2, "Sedan", "254789", "BMW", "Marlen", "Guapiles", 784715478, "Enero", "Mayo"));
        lc.agregarAlquiler(new Alquiler(3, "SUV", "254713", "Chevrolet", "Valeria", "Desamparados", 25478512, "Diciembre", "Febrero"));
        lc.agregarAlquiler(new Alquiler(4, "Pick Up", "895621", "Nissan", "Dulce", "Jorco", 70847142, "Julio", "Septiembre"));
        System.out.println(lc.toString());
        
        System.out.println("Alquiler mas reciente: ");
        lc.alquilerReciente();
    }
    
}
