import java.util.Scanner;

public class Telas {
    public static void main(String[] args) {
        //en el almacen mil telas tiene dos colores de tela
        // si la tela a vender es blanca tiene un de descuento del 15%
        // si es de cualquir otro color, el descuento es del 5%
        //
        //escriba un programa que pida el valor de la tela y su color
        // y calcule el valor a pagar.

        //aqui se crea un scaner para ingresar numeros por consola
        Scanner miScanercito = new Scanner(System.in);

        System.out.println("por favor ingrese el color de la tela: ");
        String colorTela = miScanercito.next();
        System.out.println("por favor ingrese el valor de la tela: ");
        double valorTela = miScanercito.nextDouble();


        if (colorTela.equals("blanco")){
            valorTela = valorTela * 0.85;
        }
        System.out.println("El valor a pagar es: "+valorTela);

    }



}
