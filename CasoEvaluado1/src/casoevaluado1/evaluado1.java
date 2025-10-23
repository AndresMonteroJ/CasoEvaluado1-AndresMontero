/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class evaluado1 {
    String empresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente:");
        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal del agente:");
        int tieneVehiculo = JOptionPane.showConfirmDialog(null, "¿Tiene vehículo propio?", "Vehículo", JOptionPane.YES_NO_OPTION);
 
        boolean vehiculo = (tieneVehiculo == JOptionPane.YES_OPTION);
 
        AgenteVendedor agente = new AgenteVendedor(nombre, apellidos, cedula, codigo, sucursal, vehiculo, empresa);

}

