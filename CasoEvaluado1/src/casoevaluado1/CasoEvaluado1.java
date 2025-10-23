/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;


/**
 *
 * @author Laboratorio
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String empresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente:");
        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal del agente:");
        int tieneVehiculo = JOptionPane.showConfirmDialog(null, "¿Tiene vehículo propio?", "Vehículo", JOptionPane.YES_NO_OPTION);
 
        boolean vehiculo = (tieneVehiculo == JOptionPane.YES_OPTION);
 
        AgenteVendedor agente = new AgenteVendedor(nombre, apellidos, cedula, codigo, sucursal, vehiculo, empresa);


            int electricos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos eléctricos:"));
            int automotriz = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos automotrices:"));
            int construccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos de construcción:"));
            String estadoFactura = JOptionPane.showInputDialog("Estado de la factura (Ej: Pagada, Pendiente):");

            
            int continuar = 0;
        int cantidadFacturas = 0;
 
        do {
            String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Cédula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Código de factura:");
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura:"));
            int cantidadelectricos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos eléctricos:"));
            int cantidadautomotriz = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos automotrices:"));
            int cantidadconstruccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos de construcción:"));
            String estado = JOptionPane.showInputDialog("Estado de la factura (Ej: Pagada, Pendiente):");
   
 
            Factura factura = new Factura(nombreCliente, cedulaCliente, codigoFactura, monto, electricos, automotriz, construccion, estado);
            factura.calcularComision(agente);
 
            cantidadFacturas++;
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
 
        // Bono extra
        if (cantidadFacturas > 3 || agente.getTotalVendido() > 300000) {
            agente.aplicarBonoExtra();
          // Mostrar resultados finales
                String mensaje = "Agente: " + agente.getNombre() + " " + agente.getApellidos() + "\n"
                + "Código: " + agente.getCodigo() + "\n"
                + "Sucursal: " + agente.getSucursal() + "\n"
                + "Vehículo propio: " + (agente.getVehiculo() ? "Sí" : "No") + "\n"
                + "Total vendido: ₡" + agente.getTotalVendido() + "\n"
                + "Total en comisiones: ₡" + agente.getTotalComision() + "\n"
                + "Puntos obtenidos: " + agente.getPuntos() + "\n"
                + "Meses trabajados: " + cantidadFacturas + "\n"
                + "Puntos extra (20% ventas): ₡" + agente.CalculoPuntosExtra();
 
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    
    }
}

