import java.util.Scanner;
public class Ejercicio1_Semana06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaramos las variables
        int numero;
        //almacenar el número ingresado por el usuario
        int factorial = 1;
        //iniciar el factorial en 1, ya que 0! = 1
        int contador;
        //aplicamos el bucle y entrada de datos
        System.out.print("Ingrese un número entero positivo: ");
        numero = scanner.nextInt();        
        //El número tiene que ser positivo
        if (numero < 0) {
            System.out.println("Por favor, ingrese un número positivo.");
        } else {
            contador = numero;
            //Calcular el factorial
            while (contador > 0) {
                factorial *= contador;
                //Se multiplica el factorial por el contador
                contador--;
            }
            // Salida de datos
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
