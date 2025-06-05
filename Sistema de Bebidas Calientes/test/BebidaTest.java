import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {
    @Test
    public void testCafeConAzucar() {
        Cafe cafe = new Cafe();
        cafe.preparar(true, Condimento.AZUCAR);
        assertEquals(Condimento.AZUCAR, cafe.getCondimento());
    }

    @Test
    public void testTeConMiel() {
        Te te = new Te("Té Verde");
        te.preparar(true, Condimento.MIEL);
        assertEquals(Condimento.MIEL, te.getCondimento());
    }

    @Test
    public void testTeConAzucar() {
        Te te = new Te("Té Manzanilla");
        te.preparar(true, Condimento.AZUCAR);
        assertNull(te.getCondimento(), "AZUCAR NO. El té no debe aceptar edulcorante");
    }

    @Test
    public void testCafeConEdulcorante() {
        Cafe cafe = new Cafe();
        cafe.preparar(true, Condimento.EDULCORANTE);
        assertNull(cafe.getCondimento(), "EDULCORANTE NO. El café no debe aceptar edulcorante");
    }

    @Test
    public void testCafe() {
        Cafe cafe = new Cafe();
        cafe.preparar(false, Condimento.AZUCAR); // no importa el condimento
        assertNull(cafe.getCondimento(), "No debería tener condimento");
    }

    @Test
    public void testTe() {
        Cafe cafe = new Cafe();
        cafe.preparar(false, Condimento.AZUCAR); // no importa el condimento
        assertNull(cafe.getCondimento(), "No debería tener condimento");
    }

}