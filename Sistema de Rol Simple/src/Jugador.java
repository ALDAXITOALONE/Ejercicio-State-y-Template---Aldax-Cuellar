
public class Jugador {
    private Estado estado;

    public Jugador(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void cambiarEstado(Estado estadoNuevo) {
        if (estado == estadoNuevo) {
            System.out.println("El jugador ya tiene ese estado");
        }
        else {
            setEstado(estadoNuevo);
        }
    }

    public void mostrarEstado() {
        System.out.println(estado);
    }

}
