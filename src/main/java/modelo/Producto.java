/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String fechaElaboracion;
    private double precio;
    private double peso;

    public Producto(String codigo, String nombre, String fechaElaboracion, 
            double precio, double peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaElaboracion = fechaElaboracion;
        this.precio = precio;
        this.peso = peso;
    }

    public Producto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public String verificarCodigo(){
        var retorno="TBD";
        var verificarProducto=this.codigo.charAt(0);
        switch(verificarProducto)
        {
            case 'P':
                retorno="Pimiento";
                break;
            case 'T':
                retorno="tomate riñon";
                break;
            case 'C':
                retorno="Coco";
                break;
            case 'm':
                retorno="manzanas";
                break;
  
            default:
                retorno="Producto no disponible";
        }
        return retorno;
    } 
    
    public boolean comprobarFecha(){
         var retorno = false;
        
        if(this.fechaElaboracion == "2022"){                                     //los productos son validos si son elaborados dentro del año
            retorno=true;
        }
        return retorno;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", fechaElaboracion=" + fechaElaboracion + ", importadora=" 
                + precio + ", peso=" + peso + '}';
    }
    

    
}
