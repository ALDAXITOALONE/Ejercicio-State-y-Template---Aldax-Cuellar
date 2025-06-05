public abstract class Bebida {
    private int temperatura;
    private Condimento condimento;
    private TipoDeBebida tipoDeBebida;

    public void preparar(boolean quiereCondimento, Condimento condimento) {
        hervirAgua();
        prepararBebida();
        servir();
        agregarCondimento(quiereCondimento, condimento);
    }

    protected abstract boolean prepararBebida();
    protected abstract void agregarCondimento(boolean quiere, Condimento condimento);

    protected boolean hervirAgua() {
        boolean hervido = false;
        if (tipoDeBebida.equals(TipoDeBebida.CAFE)) {
            if (temperatura == 100) {
                System.out.println("Alcanzó la temperatura.");
                hervido = true;
            }else{
                System.out.println("No alcanzó la temperatura deseada.");
            }
        }else if (tipoDeBebida.equals(TipoDeBebida.TE)) {
            if (temperatura == 65) {
                System.out.println("Alcanzó la temperatura.");
                hervido = true;
            }else{
                System.out.println("No alcanzó la temperatura deseada.");
            }
        }
        return hervido;
    }

    protected void servir () {
        System.out.println("Servido.");
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public Condimento getCondimento() {
        return condimento;
    }

    public void setCondimento(Condimento condimento) {
        this.condimento = condimento;
    }

    public TipoDeBebida getTipoDeBebida() {
        return tipoDeBebida;
    }

    public void setTipoDeBebida(TipoDeBebida tipoDeBebida) {
        this.tipoDeBebida = tipoDeBebida;
    }
}
