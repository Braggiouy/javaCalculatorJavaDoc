import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    System.out.println("Bienvenido a la calculadora!");

    while (true) {
      System.out.println("\nSeleccione una operación:");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicación");
      System.out.println("4. División");
      System.out.println("5. Módulo");
      System.out.println("6. Salir");

      int opcion = scanner.nextInt();
      if (opcion == 6) {
        break;
      }

      System.out.println("Ingrese el primer número:");
      int num1 = scanner.nextInt();

      System.out.println("Ingrese el segundo número:");
      int num2 = scanner.nextInt();

      switch (opcion) {
        case 1:
          int suma = calculadora.sumar(num1, num2);
          System.out.println("La suma es: " + suma);
          break;
        case 2:
          int resta = calculadora.restar(num1, num2);
          System.out.println("La resta es: " + resta);
          break;
        case 3:
          int multiplicacion = calculadora.multiplicar(num1, num2);
          System.out.println("La multiplicación es: " + multiplicacion);
          break;
        case 4:
          try {
            int division = calculadora.dividir(num1, num2);
            System.out.println("La división es: " + division);
          } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
          }
          break;
        case 5:
          try {
            int modulo = calculadora.modulo(num1, num2);
            System.out.println("El módulo es: " + modulo);
          } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
          }
          break;
        default:
          System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
          break;
      }
    }

    System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
    scanner.close();
  }
}
