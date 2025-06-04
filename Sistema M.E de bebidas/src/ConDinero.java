public class ConDinero extends Estado {
    private int dinero;

    public ConDinero(MaquinaExpendedora maquina, int dinero) {
        super(maquina);
        this.dinero = dinero;
    }

    public int getDineroDeMas() {
        return dinero;
    }

    public void setDineroDeMas(int dineroDeMas) {
        this.dinero = dineroDeMas;
    }


    @Override
    public String toString() {
        return "ConDinero";
    }

    @Override
    public void insertarDinero(int cantidad) {
        System.out.println("Ya hay dinero insertado");
    }

    @Override
    public void seleccionarProducto(Producto producto) {
        System.out.println("Producto seleccionado");
        if( maquina.getProductos().contains(producto) ) {
            if (dinero >= producto.getPrecio()) {
            maquina.setEstado(new ProductoSelecionado(maquina, dinero, producto));
        }
        }
        else{
            System.out.println("Producto no encontrado, seleccione un nuevo producto");
        }
    }

    @Override
    public void obtenerProducto() {
        System.out.println("Seleccionar un producto primero");
    }

    @Override
    public void devolverDinero() {
        System.out.println("Dinero devuelto: " + dinero);
        maquina.setEstado(new SinDinero(maquina));
    }
}


