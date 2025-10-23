
package sem3recursivo;

import javax.swing.JOptionPane;


public class Principal2 {

   
    public static void main(String[] args) {
        
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("Digite algun numero para calcular el factorial"));
        JOptionPane.showMessageDialog(null, "El factorial recursivo de " + n + " es " + factorialRecursivo(n));
        JOptionPane.showMessageDialog(null, "El factorial iterativo de " + n + " es " + factorialIterativo(n));
        
        
        
    }
    
    
    public static int factorialRecursivo(int n){
        if (n>0){
            return n * factorialRecursivo(n-1);
        }else{
            return 1;
        }
    }
    
    
    
    public static int factorialIterativo(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    
}
