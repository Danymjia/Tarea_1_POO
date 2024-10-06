import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creación del menu

        int opcion;
        boolean continuar = true;
        while (continuar) {

            // Si quieres mejorar el menu de una :D

            System.out.printf("\tBienvenido al sistema del programa\t");
            System.out.printf("------Calculadora de Areas------------");
            System.out.printf("1. Area de un triangulo");
            System.out.printf("2. Area de un cuadrado");
            System.out.printf("3. Area de un circulo\n");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la base del triangulo:");
                    double base = sc.nextDouble();
                    System.out.println("Introduce la altura del triangulo:");
                    double altura = sc.nextDouble();
                    double area = (base*altura)/2;
                    System.out.println("El area del triangulo es: " + area);
                    break;
                case 2:
                    System.out.println("Introduce el lado del cuadrado:");
                    double lado = sc.nextDouble();
                    double cuadrado = lado*lado;
                    System.out.println("El area del cuadrado es: " + cuadrado);
                    break;
                case 3:
                    System.out.println("Introduce el radio del circulo:");
                    double radio = sc.nextDouble();
                    double circulo = Math.PI * Math.pow(radio, 2);
                    System.out.println("El area del circulo es: " + circulo);
                    break;
                case 4:

                    //// Dany ponle la función para salir del programa porfa que ya llego a mi casa :D


                    //// Agrega la funcion de la opcion no válida y queda el programa
                    


            }
        }
    }
}