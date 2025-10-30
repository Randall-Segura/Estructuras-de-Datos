/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmacia;

import Controlador.CtrlLoginUsuarios;
import Modelo.ConsultasLogin;
import Modelo.Farmaceuticos;
import Vista.frmLoginUsuarios;

/**
 *
 * @author Randall Segura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Inicio de sesion 
        
        Farmaceuticos mod= new Farmaceuticos();
        ConsultasLogin modC= new ConsultasLogin();
        frmLoginUsuarios frmLU= new frmLoginUsuarios();
        CtrlLoginUsuarios ctrlLU= new CtrlLoginUsuarios(mod,modC,frmLU);
        
        frmLU.setVisible(true);
        frmLU.setLocationRelativeTo(null);
        
      
    }
    
}
