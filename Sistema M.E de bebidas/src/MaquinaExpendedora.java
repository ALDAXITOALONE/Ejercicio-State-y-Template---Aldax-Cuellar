import java.util.ArrayList;

public class MaquinaExpendedora {
    private Estado estado;
    private ArrayList<Producto> productos;

    public MaquinaExpendedora(Estado estado, ArrayList<Producto> productos) {
        this.estado = estado;
        this.productos = productos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public void removeProducto(Producto producto) {
        productos.remove(producto);
    }

    public void modificarProducto(Producto productoNuevo, Producto productoEliminado) {
        productos.add(productoNuevo);
        productos.add(productoEliminado);
    }

    public void mostrarEstado() {
        System.out.println("Estado: " +  estado);
    }

}
