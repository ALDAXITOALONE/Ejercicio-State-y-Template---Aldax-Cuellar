public class Saludable implements Estado {
    private int cantCaminatas;

    public Saludable(int cantCaminatas) {
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
        return "Saludable";
    }

    @Override
    public void caminar(Jugador jugador) {
        cantCaminatas++;
        System.out.println("Yendo al objetivo");
        if(cantCaminatas >= 5){
            jugador.cambiarEstado(new Herido(0));
            System.out.println("El jugador ahora está herido y va a buscar vendajes" );
        }
    }

    @Override
    public void correr(Jugador jugador) {
        System.out.println("Corro a 5m/m");
    }

    @Override
    public void beber(Jugador jugador) {
        System.out.println("Ganando resistencia");
    }

    @Override
    public void golpear(Jugador jugador) {
        System.out.println("Mi golpe vale 15 puntos");
        cantCaminatas = 0;
    }

}
