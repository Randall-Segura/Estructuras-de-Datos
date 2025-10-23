
package ejemplo4;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        
        System.out.println("Digite un numero: ");
        sumaSucesiva sum = new sumaSucesiva();
        int num=sc.nextInt();
        System.out.println("La suma de los numeros del 1 al " + num + " es: " + sum.suma(num));
        
    }
    
}
