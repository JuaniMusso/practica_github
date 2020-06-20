
package tienda.entidades;

public class Venta {
    
    private Producto producto;
    private Integer precio;
    private String calidad;

    public Venta() {
    }

    public Venta(Producto producto, Integer precio, String calidad) {
        this.producto = producto;
        this.precio = precio;
        this.calidad = calidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    
    
    
}
