/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import java.util.ArrayList;
import java.util.List;
import modelo.Factura;
import modelo.Producto;
/**
 *
 * @author User
 */
public class FacturaServicio implements IFacturaServicio {

   public final List<Factura> facturaList = new ArrayList<>();
    
    @Override
    public Factura crear(Factura f) {
       this.facturaList.add(f); 
        return f;
    }

   @Override
    public Factura modificar(int nf, Factura f) {
        this.facturaList.set(this.buscarPosicion(nf),f);
        return f;
    }

    @Override
    public Factura eliminar(int nf) {
        var factura=this.facturaList.get(nf);
        this.facturaList.remove(nf);
        return factura;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }

     @Override
    public int buscarPosicion(int nf) {  
        var posicion=-1;
        var i=0;
        for(var auxfact:this.facturaList){
            if(auxfact.getNumeroFactura()==nf){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }

 
}
