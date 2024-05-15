public class EstrategiaPayPal implements EstrategiaMetodoPago{

    private String correo;
    private String contrasena;

    public EstrategiaPayPal() {
        this.correo = "eddie@gmail.com";
        this.contrasena = "empanada123";
    }

    @Override
    public void pago(double cantidad) {
        System.out.println("Pagando " + cantidad + " con Paypal");
    }

}
