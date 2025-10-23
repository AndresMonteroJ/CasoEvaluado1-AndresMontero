/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author Laboratorio
 */
public class Vendedor {
    //Clase del vendedor
    
    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean vehiculo;
    private double totalVendido;
    private double totalComision;
    private int puntos;
    private double bonoExtra;
    
    // Constructor

    public Vendedor(String nombre, String cedula, String codigo, String sucursal, boolean vehiculo, double totalVendido, double totalComision, int puntos, double bonoExtra) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculo = vehiculo;
        this.totalVendido = totalVendido;
        this.totalComision = totalComision;
        this.puntos = puntos;
        this.bonoExtra = bonoExtra;
    }
    
    //Setter y getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(boolean vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public double getTotalComision() {
        return totalComision;
    }

    public void setTotalComision(double totalComision) {
        this.totalComision = totalComision;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getBonoExtra() {
        return bonoExtra;
    }

    public void setBonoExtra(double bonoExtra) {
        this.bonoExtra = bonoExtra;
    }
    
    //Suma de datos;
    
    public void agregarVenta(double monto){
    totalVendido += monto;
    }
    public void agregarComision(double comision){
    totalComision += comision;
    }
    public void agregarPuntos(int puntos){
    puntos += puntos;
    }
    
    //Bomo extra
    public void aplicarBono(){
    bonoExtra = 20000;
    totalComision += bonoExtra;
    }
    
    //Calcular puntos extra
    
    public double CalculoPuntosExtra(){
    return totalVendido *0.20;
    }
    
}
