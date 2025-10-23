
package Ejemplo3;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);          //utilizando el scanner
        System.out.println("Digite un valor: ");     //ingreso del numero
        int valor=sc.nextInt();                      //se lee el numero
        imprime(valor);                              // se llama al metodo 
       
    }
    
    
    
    public static void imprime(int n){
        
                

        if (n==1){
            System.out.print(n + " ");  //si n es 1, imprime 1
        }else{
            System.out.print(n + " ");       //imprime n-1 hasta llegar a 1 
            imprime(n-1);
        }
        
    }
        
    
}
