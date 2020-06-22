
package tienda.entidades;

public class Proovedor {
    
    private String nombre;
    private String telefono;
    private String direccion;
    private Integer cantidad;
    private Producto producto;

    public Proovedor() {}

    public Proovedor(String nombre, String telefono, String direccion, Integer cantidad, Producto producto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
