import java.util.Scanner;
public class Ejercicio3_Semana06 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        //declaramos las variables
        int numero = scanner.nextInt();        
        int digitoMayor = 0;        
        //Ejecutaremos el resultado del número sea mayor que 0
        while (numero > 0) {
            int digito = numero % 10;
            // obtenemos el último dígito del número            
            if (digito > digitoMayor) {
                digitoMayor = digito;
                // Buscamos el dígito mayor si es necesario
            }            
            numero = numero / 10;
        }
        //Salida de datos
        System.out.println("El digito mayor es: " + digitoMayor);
    }    
}
