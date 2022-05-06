/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2_01;
import controlador.FacturaControlador;
import modelo.Factura;
import modelo.Producto;
/**
 *
 * @author User
 */
public class Ejercicio2_01 {

    public static void main(String[] args) {
         var facturaControl = new FacturaControlador();
        facturaControl.crear(300, "Pepe", "Av.Americas", "0107064487", 200,
                "pimientos");
        facturaControl.crear(350, "Amanda", "Mariscal Lamar", "010789745", 568, 
                "manzanas");
        facturaControl.crear(400, "Jaime", "Av.Americas", "0107064487", 200, 
                "pimientos");
        System.out.println("Listado de Facturas");
        
        for(Factura f: facturaControl.listar())
            System.out.println(f.toString());
        
        facturaControl.eliminar(400);

        System.out.println("Eliminar factura 400");
        
        for(Factura f: facturaControl.listar())
            System.out.println(f.toString());

        System.out.println("Modificar datos de la Factura");
         
        var nuevaFactura = new Factura(500, "Jaime", "Parque del Dragon");
        
        facturaControl.modificar(500, nuevaFactura);
        
        for(Factura f: facturaControl.listar())
            System.out.println(f.toString());
        
        
    }
}
