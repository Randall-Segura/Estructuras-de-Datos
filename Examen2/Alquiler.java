/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2randallseguraj;

/**
 *
 * @author Randall Segura
 */
public class Alquiler {
    
    //atributos
    
    private int idAlquiler;
    private String tipoVehiculo;
    private String placaVehiculo;
    private String marcaVehiculo;
    private String nombreCli;
    private String dirCli;
    private int teleCli;
    private String fechaAlquiler;
    private String fechaDevolucion;
    
    
    //constructor lleno

    public Alquiler(int idAlquiler,String tipoVehiculo, String placaVehiculo, String marcaVehiculo, String nombreCli, String dirCli, int teleCli,
            String fechaAlquiler, String fechaDevolucion) {
        this.idAlquiler=idAlquiler;
        this.tipoVehiculo = tipoVehiculo;
        this.placaVehiculo = placaVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.nombreCli = nombreCli;
        this.dirCli = dirCli;
        this.teleCli = teleCli;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    //getters and setters

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getDirCli() {
        return dirCli;
    }

    public void setDirCli(String dirCli) {
        this.dirCli = dirCli;
    }

    public int getTeleCli() {
        return teleCli;
    }

    public void setTeleCli(int teleCli) {
        this.teleCli = teleCli;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

   
    
    public String toString(){
        return "ID Alquiler: " + idAlquiler +
                "\nTipo Vehiculo: " + tipoVehiculo+
                "\nPlaca: " + placaVehiculo+
                "\nCliente: " + nombreCli+
                "\nDireccion: " + dirCli+
                "\nTelefono: " + teleCli+
                "\nFecha Alquiler: " + fechaAlquiler+
                "\nFecha Devolucion: " + fechaDevolucion;
    }
    
    
    
    
    
}
