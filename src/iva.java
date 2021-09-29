import java.util.Scanner;

public class iva {
    public static void main(String[] args) {
        //pedir el valor de un producto, si es mayor a 20.000
        //de mostrar el valor + iva 19%
        // sino debe mostrar el valor + iva 16%
        Scanner miScanercito = new Scanner(System.in);
        double valor = miScanercito.nextDouble();
        double valorConIva;
        if (valor > 20000){
            valorConIva = valor * 1.19;
        }else{
            valorConIva =valor * 1.16;
        }
        System.out.println("El valor con iva es: "+valorConIva);
    }
}
