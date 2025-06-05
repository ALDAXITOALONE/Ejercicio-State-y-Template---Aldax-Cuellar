public class Cafe extends Bebida {
    public Cafe() {
        this.setTemperatura(100);
        this.setTipoDeBebida(TipoDeBebida.CAFE);
    }

    @Override
    public boolean prepararBebida() {
        System.out.println("Agregando café al agua.");
        System.out.println("Diluyendo todo.");
        return true;
    }

    @Override
    public void agregarCondimento(boolean quiere, Condimento condimento) {
        if (quiere) {
            if (condimento == Condimento.AZUCAR) {
                setCondimento(condimento);
                System.out.println("Agregando azúcar al café.");
            }else {
                System.out.println("No ofrecemos nada más que azúcar :p");
            }
        }else{
            System.out.println("No quiere azúcar.");
        }
    }
}
