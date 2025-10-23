
package ejemplo4;


public class sumaSucesiva {
    
    public int suma(int n){
        //caso base: si n es 1, la suma sea 1
        
        if (n==1){
            return 1;
        }else{
            //caso recursivo: sumar n con la sumatoria de los valores anteriores
            return n +suma(n-1);
        }
    }
    
}
