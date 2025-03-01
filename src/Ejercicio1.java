import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del vehículo
        System.out.print("Ingrese el tipo de vehículo (Sedan, Pickups, Microbuses, Motos): ");
        String tipoVehiculo = scanner.nextLine();

        System.out.print("Ingrese la marca del vehículo: ");
        String marcaVehiculo = scanner.nextLine();

        System.out.print("Ingrese el año de fabricación del vehículo: ");
        int añoFabricacion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el valor del vehículo: ");
        double valorVehiculo = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el país de origen (China, Estados Unidos): ");
        String paisOrigen = scanner.nextLine();

        
    }
}
