import java.util.ArrayList;

public class Cliente {
    public static void main(String[] args) {
        Producto coca = new Producto("Coca Cola", 150);
        Producto pepsi = new Producto("Pepsi", 140);
        Producto agua = new Producto("Agua", 100);


        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(coca);
        productos.add(pepsi);
        productos.add(agua);

        MaquinaExpendedora maquina = new MaquinaExpendedora(null, productos);
        maquina.setEstado(new SinDinero(maquina));


        maquina.mostrarEstado();


        maquina.getEstado().insertarDinero(200);

        maquina.mostrarEstado();

        maquina.getEstado().seleccionarProducto(pepsi);

        maquina.mostrarEstado();

        maquina.getEstado().obtenerProducto();

        maquina.mostrarEstado();

        maquina.getEstado().devolverDinero();

        maquina.mostrarEstado();

        maquina.getEstado().seleccionarProducto(coca);

        maquina.mostrarEstado();

        maquina.getEstado().insertarDinero(150);

        maquina.mostrarEstado();

        Producto fanta = new Producto("Fanta", 130);
        maquina.getEstado().seleccionarProducto(fanta);


        maquina.getEstado().seleccionarProducto(agua);

        
        maquina.getEstado().devolverDinero();
    }
}