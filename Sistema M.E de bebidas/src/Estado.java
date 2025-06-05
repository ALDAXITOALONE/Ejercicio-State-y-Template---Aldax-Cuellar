public abstract class Estado {
    protected MaquinaExpendedora maquina;

    public Estado(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    public MaquinaExpendedora getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    public abstract void insertarDinero(int cantidad);
    public abstract void seleccionarProducto(Producto producto);
    public abstract void obtenerProducto();
    public abstract void devolverDinero();
}

