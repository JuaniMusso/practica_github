
package tienda.entidades;

public class Control {
    
    private Producto producto;

    public Control() {}

    public Control(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
