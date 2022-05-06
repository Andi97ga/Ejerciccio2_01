/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Factura {
    private int numeroFactura;
    private String nombreCliente;
    private String direccion;
    private int cedula;
    private int total;
    private Producto producto;

    public Factura(int numeroFactura, String nombreCliente, String direccion, 
            int cedula, Producto producto) {
        this.numeroFactura = numeroFactura;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.cedula = cedula;
        this.producto = producto;
        
    }

    public Factura(int numeroFactura, String nombreCliente, String direccion) {
        this.numeroFactura = numeroFactura;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
    }
    

    public Factura() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean facturaValida(){                                              //las facturas seran validas si estan dentro del rango puesto
         var retorno = false;
        
        if(this.numeroFactura <= 1022){
            retorno=true;
        }
        return retorno;
    }
    
    public int calcularDescuento(){
        var productos= 100;
        if(this.total> 0 && this.total< 10){
            productos= (int) (this.total * 0.05);
            
        }else{
            if(this.total>=10 && this.total <=50){
                productos= (int) (this.total * 0.10);
            }else{
                    if(this.total >= 50 && this.total >= 100 ){
                        productos= (int) (this.total * 0.30);
                    }else{
                        productos= 0;
                    }
            }
        }
        return productos;
    }
    
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura + 
                ", nombreCliente=" + nombreCliente + ", direccion=" + 
                direccion + ", cedula=" + cedula + ", producto=" + 
                producto + '}';
    }
    
    

    

    
}
