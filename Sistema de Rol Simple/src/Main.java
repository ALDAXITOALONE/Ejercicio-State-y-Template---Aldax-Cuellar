//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(new Saludable(0));
        jugador.mostrarEstado();

        for (int i = 0; i < 5; i++) {
            jugador.getEstado().caminar(jugador);
        }

        jugador.mostrarEstado();

        for (int i = 0; i < 15; i++) {
            jugador.getEstado().caminar(jugador);
        }

        jugador.mostrarEstado();

        for (int i = 0; i < 2; i++) {
            jugador.getEstado().correr(jugador);
        }

        jugador.mostrarEstado();

        for (int i = 0; i < 5; i++) {
            jugador.getEstado().golpear(jugador);
        }

        jugador.mostrarEstado();

        System.out.println("Caso 2");

        Jugador jugador2 = new Jugador(new Saludable(0));

        jugador2.mostrarEstado();

        for (int i = 0; i < 5; i++) {
            jugador2.getEstado().caminar(jugador2);
        }

        jugador2.mostrarEstado();

        jugador2.getEstado().beber(jugador2);

        jugador2.mostrarEstado();


    }
}
