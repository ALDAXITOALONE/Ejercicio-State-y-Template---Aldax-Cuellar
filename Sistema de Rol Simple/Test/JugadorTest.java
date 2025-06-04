import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {

        @Test
        public void testCambioDeEstadosCompleto() {
            Jugador jugador = new Jugador(new Saludable(0));

            assertEquals("Saludable", jugador.getEstado().toString());

            for (int i = 0; i < 5; i++) {
                jugador.getEstado().caminar(jugador);
            }

            assertEquals("Herido", jugador.getEstado().toString());

            for (int i = 0; i < 15; i++) {
                jugador.getEstado().caminar(jugador);
            }

            assertEquals("Envenenado", jugador.getEstado().toString());

            for (int i = 0; i < 2; i++) {
                jugador.getEstado().correr(jugador);
            }

            for (int i = 0; i < 5; i++) {
                jugador.getEstado().golpear(jugador);
            }

            assertEquals("Saludable", jugador.getEstado().toString());
        }


    @Test
    public void testRecuperacionConBeber() {
        Jugador jugador = new Jugador(new Saludable(0));

        for (int i = 0; i < 5; i++) {
            jugador.getEstado().caminar(jugador);
        }

        assertEquals("Herido", jugador.getEstado().toString());

        jugador.getEstado().beber(jugador);

        assertEquals("Saludable", jugador.getEstado().toString());
    }
}
