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

        // Validar año de fabricación
        if (añoFabricacion < 2010 || añoFabricacion > 2025) {
            System.out.println("No se aceptan vehículos mayores a 15 años de fabricación.");
            return;
        }

        // Calcular impuesto
        double impuesto = calcularImpuesto(añoFabricacion, valorVehiculo);

        // Calcular flete marítimo
        double flete = calcularFlete(paisOrigen, tipoVehiculo);

        // Calcular matrícula inicial
        double matricula = calcularMatricula(añoFabricacion);

        // Calcular total de importación
        double totalImportacion = impuesto + flete + matricula;

        // Mostrar resultados
        System.out.println("\nDatos del vehículo:");
        System.out.println("Tipo: " + tipoVehiculo);
        System.out.println("Marca: " + marcaVehiculo);
        System.out.println("Año de fabricación: " + añoFabricacion);

        System.out.println("\nDatos de importación:");
        System.out.println("Porcentaje de impuesto: " + (impuesto / valorVehiculo * 100) + "%");
        System.out.println("Costo de impuesto: $" + impuesto);
        System.out.println("Lugar de origen: " + paisOrigen);
        System.out.println("Costo de flete: $" + flete);
        System.out.println("Matrícula inicial: $" + matricula);
        System.out.println("Total de importación: $" + totalImportacion);





    }
}
