import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class MaquinaExpendedoraTest {

    private MaquinaExpendedora maquina;
    private Producto coca;
    private Producto pepsi;
    private Producto agua;

    @BeforeEach
    public void setUp() {
        coca = new Producto("Coca Cola", 150);
        pepsi = new Producto("Pepsi", 140);
        agua = new Producto("Agua", 100);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(coca);
        productos.add(pepsi);
        productos.add(agua);

        maquina = new MaquinaExpendedora(null, productos);
        maquina.setEstado(new SinDinero(maquina));
    }

    @Test
    public void testCambiarEstadoAConDinero() {
        maquina.getEstado().insertarDinero(200);
        assertTrue(maquina.getEstado() instanceof ConDinero);
    }

    @Test
    public void testCambiarEstadoAProductoSeleccionado() {
        maquina.getEstado().insertarDinero(200);
        maquina.getEstado().seleccionarProducto(pepsi);
        assertTrue(maquina.getEstado() instanceof ProductoSelecionado);
    }

    @Test
    public void testSeleccionarProductoInvalido() {
        maquina.getEstado().insertarDinero(200);
        Producto fanta = new Producto("Fanta", 130);
        maquina.getEstado().seleccionarProducto(fanta);

        assertTrue(maquina.getEstado() instanceof ConDinero);
    }

    @Test
    public void testSinInterrupciones() {
        maquina.getEstado().insertarDinero(200);
        maquina.getEstado().seleccionarProducto(pepsi);
        maquina.getEstado().obtenerProducto();
        assertTrue(maquina.getEstado() instanceof SinDinero);
    }

    @Test
    public void testDevolverDinero() {
        maquina.getEstado().insertarDinero(200);
        maquina.getEstado().devolverDinero();
        assertTrue(maquina.getEstado() instanceof SinDinero);
    }

    @Test
    public void testSeleccionarProductoSinDinero() {
        maquina.getEstado().seleccionarProducto(pepsi);
        assertTrue(maquina.getEstado() instanceof SinDinero);
    }

    @Test
    public void testObtenerProductoSinSeleccionar() {
        maquina.getEstado().insertarDinero(200);
        maquina.getEstado().obtenerProducto();
        assertTrue(maquina.getEstado() instanceof ConDinero);
    }
}