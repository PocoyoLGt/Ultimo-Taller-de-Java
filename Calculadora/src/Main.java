import java.util.Scanner;

import static java.lang.Math.floorMod;

public class Main {
    private static int bandera = 0;


    private static Scanner input;

    public static void main(String[] args){
         input = new Scanner(System.in);
        double num2,resultado;
       String signo;

            System.out.println("Bienvenido a su calculadora");
            System.out.println("Digite una numero");
            resultado = input.nextDouble();
            do {
            System.out.println("Digite el signo de la operacion que desea realizar");
            System.out.println("Suma(+),Resta(-),Multiplicacion(*),Division(/),Modulo(%),Igual(=)");
            signo = input.next();

            if(signo.equals("-")){
                System.out.println("Digite un numero");
                num2 = input.nextDouble();

                resultado= resultado-num2;
                System.out.println("Resultado: "+ resultado);

            }else if(signo.equals("+")){
                System.out.println("Digite un numero");
                num2 = input.nextDouble();

                resultado= resultado+num2;
                System.out.println("Resultado: "+ resultado);

            }else if(signo.equals("*")){
                System.out.println("Digite un numero");
                num2 = input.nextDouble();

                resultado= resultado*num2;
                System.out.println("Resultado: "+ resultado);

            }else if(signo.equals("/")){
                System.out.println("Digite un numero");
                num2 = input.nextDouble();
                if(num2 == 0){
                    System.out.println("No se puede dividir por cero");
                }

                resultado= resultado/num2;
                System.out.println("Resultado: "+ resultado);

            }else if (signo.equals("%")){
                System.out.println("Digite un numero");
                num2 = input.nextDouble();

                resultado= resultado%num2;
                System.out.println("Resultado: "+ resultado);

            }else if (signo.equals("=")){
                System.out.println("Resultado: "+ resultado);
                break;
            }

        }while (bandera <=0);


    }


}
