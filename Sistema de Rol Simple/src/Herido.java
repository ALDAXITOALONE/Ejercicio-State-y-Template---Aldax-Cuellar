public class Herido implements Estado{
    private int cantCaminatas;

    public Herido(int cantCaminatas) {
        this.cantCaminatas = cantCaminatas;
    }

    public int getCantCaminatas() {
        return cantCaminatas;
    }

    public void setCantCaminatas(int cantCaminatas) {
        this.cantCaminatas = cantCaminatas;
    }

    @Override
    public String toString() {
        return "Herido";
    }

    @Override
    public void caminar(Jugador jugador) {
        cantCaminatas++;
        if(cantCaminatas == 15){
            jugador.cambiarEstado(new Envenenado(0, 0));
            System.out.println("El jugador ahora está envenenado y necesita una pócima");
        }
    }

    @Override
    public void correr(Jugador jugador) {
        System.out.println("No puedo correr");
    }

    @Override
    public void beber(Jugador jugador) {
        System.out.println("Recuperándome");
        jugador.cambiarEstado(new Saludable(0));
    }

    @Override
    public void golpear(Jugador jugador) {
        System.out.println("No tengo suficiente energía");
    }
}
