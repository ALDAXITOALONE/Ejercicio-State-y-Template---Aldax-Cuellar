public class Te extends Bebida {
    private String tipoDeTe;
    public Te(String tipoDeTe) {
        this.setTemperatura(65);
        this.setTipoDeBebida(TipoDeBebida.TE);
        this.tipoDeTe = tipoDeTe;
    }


    @Override
    public boolean prepararBebida() {
        System.out.println("Eligiendo saco de " + tipoDeTe + ".");
        System.out.println("Preparando Té.");
        return true;
    }

    @Override
    public void agregarCondimento(boolean quiere, Condimento condimento) {
        if (quiere) {
            if (condimento == Condimento.MIEL || condimento == Condimento.EDULCORANTE) {
                setCondimento(condimento);
                System.out.println("Agregando " + condimento + " al té.");
            } else {
                System.out.println("El té solo puede llevar miel o edulcorante :p");
            }
        } else {
            System.out.println("No quiere condimento.");
        }
    }
}
