public class EstrategiaTarjetaCredito implements EstrategiaMetodoPago{

    private String nombre;
    private String numeroTarjeta;
    private String cvv;
    private String fechaVencimiento;

    public EstrategiaTarjetaCredito() {
        this.nombre = "Eddie";
        this.numeroTarjeta = "1948136597813";
        this.cvv = "123";
        this.fechaVencimiento = "14/09/2028";
    }



    @Override
    public void pago(double cantidad) {
        System.out.println("Pagando " + cantidad + " con tarjeta de credito");
    }
}
