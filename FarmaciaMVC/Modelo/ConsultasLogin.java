/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;

/**
 *
 * @author Randall Segura
 */
public class ConsultasLogin extends Conexion {
    
    
    public boolean ingresar(Farmaceuticos farm){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        ResultSet rs= null;
        
        String sql="SELECT * FROM farmaceuticos WHERE usuario=? AND contrasena=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setString(1,farm.getUsuario());
            ps.setString(2,farm.getContrasena());
            rs=ps.executeQuery();
            return rs.next();
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        
        
    }
    
    
    
    public boolean registrar(Farmaceuticos farm){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        
        String sql="INSERT INTO farmaceuticos (usuario,contrasena) VALUES (?,?)";
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setString(1,farm.getUsuario());
            ps.setString(2,farm.getContrasena());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
             con.close();   
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
}
