public class ContextoMetodoPago {

    private EstrategiaMetodoPago estrategia;

    public ContextoMetodoPago(){
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaMetodoPago estrategia) {
        this.estrategia = estrategia;
    }

    public void pago(double cantidad){
        estrategia.pago(cantidad);
    }

}
