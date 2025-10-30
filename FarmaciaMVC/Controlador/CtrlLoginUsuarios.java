/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultasLogin;
import Modelo.Farmaceuticos;
import Vista.frmInventario;
import Vista.frmLoginUsuarios;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class CtrlLoginUsuarios implements ActionListener {

    //atributos
    private Farmaceuticos modelo;
    private ConsultasLogin consultas;
    private frmLoginUsuarios vista;

    //constructor lleno
    public CtrlLoginUsuarios(Farmaceuticos modelo, ConsultasLogin consultas, frmLoginUsuarios vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnIngresar.addActionListener(this);
        this.vista.btnRegistrarse.addActionListener(this);
    }

    //metodos
    public void limpiar() {
        vista.txtUsuario.setText("");
        vista.txtContrasena.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnIngresar) {

            modelo.setUsuario(vista.txtUsuario.getText());
            modelo.setContrasena(vista.txtContrasena.getText());

            if (consultas.ingresar(modelo)) {
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + modelo.getUsuario());
                frmInventario inventario= new frmInventario();
                inventario.setVisible(true);
                inventario.setLocationRelativeTo(null);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
        }

        if (e.getSource() == vista.btnRegistrarse) {

            modelo.setUsuario(vista.txtUsuario.getText());
            modelo.setContrasena(vista.txtContrasena.getText());

            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro de usuario exitoso", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Rellene ambos campos", "ERROR", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
        }
    }

}
