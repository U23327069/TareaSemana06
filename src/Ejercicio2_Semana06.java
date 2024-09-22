import java.util.Scanner;
public class Ejercicio2_Semana06 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Consideramos las variables
        int numero;
        int suma = 0;
        System.out.println("Ingrear numeros para sumar (Ingrese 0 para terminar):");
        //la constante es hasta que se ingresa un 0
        while (true) {
            System.out.print("Numero: ");
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
                //Sale el repititivo hasta el número si es 0
            }
            suma += numero;
            //Sumatoria de la variable total
        }
        //salida de datos
        System.out.println("La suma total es: " + suma);
        //Fin del programa
    }
}