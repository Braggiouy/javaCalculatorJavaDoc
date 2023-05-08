/**
 * Esta clase representa una calculadora básica.
 */
public class Calculadora {

  /**
   * Constructor predeterminado de la calculadora.
   * Crea una nueva instancia de la calculadora.
   */
  public Calculadora() {
    // Código del constructor
  }

  /**
   * Suma dos números enteros.
   *
   * @param a El primer número.
   * @param b El segundo número.
   * @return La suma de los dos números.
   */
  public int sumar(int a, int b) {
    return a + b;
  }

  /**
   * Resta dos números enteros.
   *
   * @param a El primer número.
   * @param b El segundo número.
   * @return La resta de los dos números.
   */
  public int restar(int a, int b) {
    return a - b;
  }

  /**
   * Multiplica dos números enteros.
   *
   * @param a El primer número.
   * @param b El segundo número.
   * @return El producto de los dos números.
   */
  public int multiplicar(int a, int b) {
    return a * b;
  }

  /**
   * Divide dos números enteros.
   *
   * @param a El dividendo.
   * @param b El divisor.
   * @return El cociente de la división.
   * @throws ArithmeticException Si el divisor es cero.
   */
  public int dividir(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("No se puede dividir por cero.");
    }
    return a / b;
  }

  /**
   * Calcula el módulo de dos números enteros.
   *
   * @param a El dividendo.
   * @param b El divisor.
   * @return El módulo de la división.
   * @throws ArithmeticException Si el divisor es cero.
   */
  public int modulo(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException(
          "No se puede calcular el módulo con divisor cero.");
    }
    return a % b;
  }
}
