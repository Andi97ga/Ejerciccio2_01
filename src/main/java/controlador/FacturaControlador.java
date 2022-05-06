/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Factura;
import modelo.Producto;
import servicio.FacturaServicio;

/**
 *
 * @author User
 */
public class FacturaControlador {
    public FacturaServicio facturaServicio = new FacturaServicio();
    
    public Factura crear(int nf , String nC, String d, String c, int cd, 
            String np){
        var producto = new Producto();
        var factura = new Factura();
        this.facturaServicio.crear(factura);
        return factura;
    }
    
    public Factura eliminar(int f) {
        return this.facturaServicio.eliminar(f);
    }
    
    public Factura modificar(int nf,Factura f) {
        return this.facturaServicio.modificar(nf,f);
    }
    
    public List<Factura> listar()
    {
        return this.facturaServicio.listar();
    }

   
}
