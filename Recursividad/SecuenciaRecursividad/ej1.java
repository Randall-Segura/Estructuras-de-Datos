/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplorecursividad;

/**
 *
 * @author Randall Segura
 */
public class ej1 {
    
    
    // 1 2 3 4 5 
    public void serie(int n){ //siempre se debe de poner un valor inicial como parametro, el valor inicial es donde arranca el ejemplo
        
        if (n<=5){                                              //si n es menor o igual a 5 se imprime y cuando llega a 5 se detiene 
            System.out.print(n + " ");                          //aca se debe debuggear, selecionar los breakpoints y luego darle en la opcion a la derecha de run
            serie(n+1);                                         // se pone como parametro n+1 para que vaya incrementando de 1 en 1
        }
    }
    
}
