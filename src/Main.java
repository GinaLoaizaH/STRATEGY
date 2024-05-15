import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int formaPago;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cual metodo de pago desea utilizar");
        System.out.println("1. PayPal");
        System.out.println("2. Tarjeta de Credito");
        formaPago = teclado.nextInt();

        ContextoMetodoPago metodoPago = new ContextoMetodoPago();

        switch (formaPago) {
            case 1:
                metodoPago.setEstrategia(new EstrategiaPayPal());
                metodoPago.pago(25000);
                break;
            case 2:
                metodoPago.setEstrategia(new EstrategiaTarjetaCredito());
                metodoPago.pago(25000);
                break;

            default:
                System.out.println("Ingrese un metodo de pago correcto");
        }
        
    }
}