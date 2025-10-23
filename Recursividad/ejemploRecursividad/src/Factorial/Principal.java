/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class Principal {
    
    public static void main (String[] args){
        
        int x=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor para obtener el factorial: "));
        JOptionPane.showMessageDialog(null, "El factorial de " + x + " es " + factorial(x));
    }
    
    
    public static int factorial(int n){
        if (n>0){                              //n tiene que ser mayor que 0 porque o sino en el factorial al final se multiplica por 0 y da 0
            int result= n * factorial(n-1);    //se crea la variable result que recibe n y el metodo factorial(n-1)
            return result;                     // se le pone un return result para que devuelva el resultado de la multiplicacion 
        }
            
        return 1;                  // Condición base: si n es 0, retornamos 1 porque 0! = 1
    }
    
}

