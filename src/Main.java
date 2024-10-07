import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creación del menu
        int opcion;
        boolean continuar = true;
        while (continuar) {

            System.out.printf("\t\t\tBienvenido al sistema del programa\t\t\t\n");
            System.out.printf("*-*-*-*-*- Calculadora de Areas *-*-*-*-*-\n");
            System.out.printf("1. Area de un triangulo\n");
            System.out.printf("2. Area de un cuadrado\n");
            System.out.printf("3. Area de un circulo\n");
            System.out.println("4. Salir\n");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la base del triangulo:");
                    double base = sc.nextDouble();
                    System.out.println("Introduce la altura del triangulo:");
                    double altura = sc.nextDouble();
                    double area = (base*altura)/2;
                    System.out.println("El area del triangulo es: " + area + "\n");
                    break;
                case 2:
                    System.out.println("Introduce el lado del cuadrado:");
                    double lado = sc.nextDouble();
                    double cuadrado = lado*lado;
                    System.out.println("El area del cuadrado es: " + cuadrado + "\n");
                    break;
                case 3:
                    System.out.println("Introduce el radio del circulo:");
                    double radio = sc.nextDouble();
                    double circulo = Math.PI * Math.pow(radio, 2);
                    System.out.println("El area del circulo es: " + circulo + "\n");
                    break;
                case 4:
                    continuar = false;
                    System.out.println("\tSaliendo del programa\t\n");
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo.\n");
                    break;

            }
        }
    }
}