import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args){
        int numero1;
        int numero2;
        int suma;
        Scanner miEscanercito = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        numero1 = miEscanercito.nextInt();
        System.out.println("Por favor ingrese otro numero");
        numero2 = miEscanercito.nextInt();

        suma = numero1 + numero2;
        //concatenacion o concatena
        System.out.println("El resulado de la suma es: "+suma);

    }
}
