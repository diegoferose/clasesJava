import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {

    //un numero que solo es divisible por el mismo y por 1
        int contadorDeDivisibles;
   for (int i=2; i <= 20; i++){
       contadorDeDivisibles = 0;
       for (int j = 1; j<=i;j++){
            if(i%j==0){
                contadorDeDivisibles++;
            }
       }
       if (contadorDeDivisibles<=2){
           System.out.println(i+"r");
       }

   }



    }
}
