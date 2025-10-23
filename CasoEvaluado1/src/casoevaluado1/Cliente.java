/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author Laboratorio
 */
public class Cliente {
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double monto;
    private int mes;
    private int electricos;
    private int automotriz;
    private int construccion;
    
    //Constructor

    public Cliente(String nombreCliente, String cedulaCliente, String codigoFactura, double monto, int mes, int electricos, int automotriz, int construccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.mes = mes;
        this.electricos = electricos;
        this.automotriz = automotriz;
        this.construccion = construccion;
    }
    //Getter y Setter

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getElectricos() {
        return electricos;
    }

    public void setElectricos(int electricos) {
        this.electricos = electricos;
    }

    public int getAutomotriz() {
        return automotriz;
    }

    public void setAutomotriz(int automotriz) {
        this.automotriz = automotriz;
    }

    public int getConstruccion() {
        return construccion;
    }

    public void setConstruccion(int construccion) {
        this.construccion = construccion;
    }
    
    
    
    //Getter

    public double getMonto() {
        return monto;
    }

    public int getMes() {
        return mes;
    }
    
}
   