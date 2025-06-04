public class SinDinero extends Estado {

    public SinDinero(MaquinaExpendedora maquina) {
        super(maquina);
    }

    @Override
    public String toString() {
        return "SinDinero";
    }

    @Override
    public void insertarDinero(int cantidad) {
        System.out.println("Dinero insertado");
        maquina.setEstado(new ConDinero(maquina, cantidad));
    }

    @Override
    public void seleccionarProducto(Producto producto) {
        System.out.println("Primero debe insertar dinero");
    }

    @Override
    public void obtenerProducto() {
        System.out.println("Primero debe insertar dinero");
    }

    @Override
    public void devolverDinero() {
        System.out.println("No hay dinero");
    }

}
