public class ProductoSelecionado extends Estado{
    private int dinero;
    private Producto producto;

    public ProductoSelecionado(MaquinaExpendedora maquina, int dinero, Producto producto) {
        super(maquina);
        this.dinero = dinero;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public MaquinaExpendedora getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int vuelto(){
        return dinero - producto.getPrecio();
    }

    @Override
    public String toString() {
        return "ProductoSelecionado";
    }

    @Override
    public void insertarDinero(int cantidad) {
        System.out.println("Ya hay dinero ");
    }

    @Override
    public void seleccionarProducto(Producto producto) {
        System.out.println("Ya se ha seleccionado un producto");
    }

    @Override
    public void obtenerProducto() {
        System.out.println("Producto entregado, su vuelto es de:" + vuelto());
        maquina.setEstado(new SinDinero(maquina));
    }

    @Override
    public void devolverDinero() {
        System.out.println("Compra cancelada, dinero devuelto: " + dinero);
        maquina.setEstado(new SinDinero(maquina));
    }


}
