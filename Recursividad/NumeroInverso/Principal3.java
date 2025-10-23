
package sem3recursivo;

import javax.swing.JOptionPane;


public class Principal3 {

    
    public static void main(String[] args) {
        
        int numero=123;
        System.out.println("Numero inverso recursivo: ");
        inversoRecursivo(numero);
        
        System.out.println("Numero inverso iterativo");
        inversoIterativo(numero);
        
        
    }
    
    
    public static void inversoRecursivo(int n){
        if (n<10){
            System.out.println(n);
        }else{
            System.out.print(n%10);
            inversoRecursivo(n/10);
        }
    }
    
    
    
    public static void inversoIterativo(int n){
        int inverso =0,x=0;
        while(n>0){
            x= n%10;
            inverso= inverso * 10 + x;
            n=n/10;
        }
        System.out.println(inverso);
        
    }
}
