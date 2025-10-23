/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author Laboratorio
 */
public class Factura {
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double monto;
    private int mes;
    private int electricos;
    private int automotriz;
    private int construccion;
    private String estadoFactura;
 
    // Constructor
    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double monto, int mes, int electricos, int automotriz, int construccion, String estadoFactura) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.mes = mes;
        this.electricos = electricos;
        this.automotriz = automotriz;
        this.construccion = construccion;
        this.estadoFactura = estadoFactura;
    }

    Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double monto, int electricos, int automotriz, int construccion, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    // Getters
    public double getMonto() { return monto; }
    public int getMes() { return mes; }
 
    // Método calculaErroneo
    public double calculaErroneo(double montoFactura) {
        double adicional = montoFactura * 0.01;
        return adicional;
    }
 
    // Método para calcular comisión y puntos de una factura
    public double calcularComision(AgenteVendedor agente) {
        double bono = 0;
        int puntos = 0;
 
        // Caso 1: tiene los tres tipos de productos
        if (electricos > 0 && automotriz > 0 && construccion > 0) {
            bono = monto * 0.10;
            puntos += 3;
        } else {
            // Caso eléctricos
            if (electricos >= 3) {
                bono += monto * 0.04;
            } else {
                bono += monto * 0.02;
            }
            bono += calculaErroneo(monto);
            puntos += 1;
 
            // Caso automotriz
            if (automotriz > 4) {
                bono += monto * 0.04;
            } else if (automotriz > 0) {
                bono += monto * 0.02;
            }
            puntos += 1;
 
            // Caso construcción
            if (construccion > 0) {
                bono += monto * 0.08;
                puntos += 2;
            }
        }
 
        // Monto mayor a 50000
        if (monto > 50000) {
            bono += monto * 0.05;
            puntos += 1;
        }
 
        agente.agregarVenta(monto);
        agente.agregarComision(bono);
        agente.agregarPuntos(puntos);
 
        return bono;
    }
    }

 
