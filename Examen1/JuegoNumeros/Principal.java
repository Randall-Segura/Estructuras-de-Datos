/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JuegoNumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class Principal {

    
    public static void main(String[] args) {
        
        
       while (true){
       try{   
       int x=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero positivo para ver la suma de sus digitos"));
       
       if (x<0){
           throw new IllegalArgumentException ("Digite solo numero enteros positivos");
       }else{
       JOptionPane.showMessageDialog(null,"El numero ingresado fue: " + x + "\nLa suma de sus digitos es: " + sumaDigitos(x));
       }
       break; //sale del while si no se ingreso un numero negativo 
       }catch(IllegalArgumentException e){
           JOptionPane.showMessageDialog(null,"Digite unicamente numeros positivos","Numero no valido", JOptionPane.ERROR_MESSAGE);
           
       }
       }
        
    }
    
    
    
     public static int sumaDigitos(int n){
         if (n<10){
             return n;
         }else{
             return n%10 + sumaDigitos(n/10);
         }
            
        }
    
}
