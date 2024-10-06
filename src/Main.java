import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        //Dany esto es parte del menu si crees poder mejorarlo ahi le mueves de una :D

        System.out.println("Aquí escribir el codigo :)");
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Calculadora-----");
        System.out.printf("\t MENU \t");
        System.out.printf("1. Sumar");
        System.out.printf("2. Restar");
        System.out.printf("3. Multiplicar");
        System.out.printf("4. Division");
        System.out.println("Seleccionar una opcion:");
        int opcion = sc.nextInt();

        //introducir los numeros
        System.out.printf("Introduce el primer numero: ");
        Double num1 = sc.nextDouble();
        System.out.printf("Introduce el segundo numero: ");
        Double num2 = sc.nextDouble();

        double resultado =0;

        // lógica

        switch (opcion){
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 4:

                //dany date haciendo la logica de esta parte tengo que salir
                resultado = num1 / num2;
                System.out.printf("El resultado es: " + resultado);
                break;

        }
    }
}