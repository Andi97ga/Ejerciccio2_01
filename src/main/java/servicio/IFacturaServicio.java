/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Factura;
import modelo.Producto;

/**
 *
 * @author User
 */
public interface IFacturaServicio {
    public Factura crear(Factura f);
    public Factura modificar(int nf,Factura f);
    public Factura eliminar(int f);
    public List<Factura> listar();
    public int buscarPosicion(int c);
}
