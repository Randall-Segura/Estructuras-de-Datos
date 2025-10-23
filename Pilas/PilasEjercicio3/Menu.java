
package sem4pilas3;

import javax.swing.JOptionPane;


public class Menu {
    
    int op=0;
    
    Pila p = new Pila();
    
    
    //metodos
    
    public void opciones(){
        op=Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n"
        +"\n1-Agregar elemento"
        +"\n2-Extraer elemento"
        +"\n3-Mostrar elementos"
        +"\n4-Salir"
        +"\nDigite su opcion: ", "Menu",JOptionPane.QUESTION_MESSAGE));
        
        
        
        switch(op){
            
            case 1:
                p.apilar();
                opciones();
                break;
            case 2:
                p.desapilar();
                opciones();
                break;
            case 3:
                p.mostrar();
                opciones();
                break;
            case 4: 
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error: opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
        
    }
    
}
