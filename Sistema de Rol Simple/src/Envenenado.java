public class Envenenado implements Estado{

    private int puntosGolpear;
    private int cantCorridas;

    public Envenenado(int puntosGolpear, int cantCorridas) {
        this.puntosGolpear = puntosGolpear;
        this.cantCorridas = cantCorridas;
    }

    public int getPuntos() {
        return puntosGolpear;
    }

    public void setPuntos(int puntosGolpear) {
        this.puntosGolpear = puntosGolpear;
    }

    public int getCantCorridas() {
        return cantCorridas;
    }

    public void setCantCorridas(int cantCorridas) {
        this.cantCorridas = cantCorridas;
    }

    public void accion(Jugador jugador){
        if (puntosGolpear >= 75 && cantCorridas <= 2) {
            jugador.cambiarEstado(new Saludable(0));
            System.out.println("Ahora el jugador es saludable");
        }
    }

    @Override
    public String toString() {
        return "Envenenado";
    }

    @Override
    public void caminar(Jugador jugador) {
        System.out.println("No puedo caminar, solo corro");
    }

    @Override
    public void correr(Jugador jugador) {
        System.out.println("Corro en búsqueda de sanos");
        cantCorridas++;
        accion(jugador);
    }

    @Override
    public void beber(Jugador jugador) {
        System.out.println("No necesito más beber");
    }

    @Override
    public void golpear(Jugador jugador) {
        puntosGolpear += 15;
        System.out.println("Mi golpe vale 15 puntos");
        accion(jugador);
    }

}
