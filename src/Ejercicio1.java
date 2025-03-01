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
    private static double calcularImpuesto(int añoFabricacion, double valorVehiculo) {
        int añosAntiguedad = 2025 - añoFabricacion;

        if (añosAntiguedad >= 10 && añosAntiguedad <= 15) {
            return valorVehiculo * 0.16;
        } else if (añosAntiguedad >= 5 && añosAntiguedad <= 9) {
            return valorVehiculo * 0.13;
        } else if (añosAntiguedad >= 1 && añosAntiguedad <= 4) {
            return valorVehiculo * 0.11;
        } else {
            return 0;
        }
    }

    private static double calcularFlete(String paisOrigen, String tipoVehiculo) {
        switch (paisOrigen.toLowerCase()) {
            case "china":
                switch (tipoVehiculo.toLowerCase()) {
                    case "sedan":
                        return 1700.00;
                    case "pickups":
                        return 1900.00;
                    case "microbuses":
                        return 2400.00;
                    case "motos":
                        return 1300.00;
                    default:
                        return 0;
                }
            case "estados unidos":
                switch (tipoVehiculo.toLowerCase()) {
                    case "sedan":
                        return 1200.00;
                    case "pickups":
                        return 1500.00;
                    case "microbuses":
                        return 1700.00;
                    case "motos":
                        return 900.00;
                    default:
                        return 0;
                }
            default:
                return 0;
        }
    }

    private static double calcularMatricula(int añoFabricacion) {
        if (añoFabricacion >= 2020 && añoFabricacion <= 2025) {
            return 11.99;
        } else if (añoFabricacion >= 2016 && añoFabricacion <= 2019) {
            return 13.99;
        } else if (añoFabricacion >= 2010 && añoFabricacion <= 2015) {
            return 15.99;
        } else {
            return 0;
        }
    }

}
