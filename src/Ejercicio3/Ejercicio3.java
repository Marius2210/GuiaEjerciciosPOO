package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos del cliente
        System.out.print("Ingrese nombre y apellidos del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el tipo de jet a alquilar (Light o Super): ");
        String tipoJet = scanner.nextLine().trim().toLowerCase();

        System.out.print("Ingrese la cantidad de horas de alquiler: ");
        int horas = scanner.nextInt();

        // Vamos a asignar el precio por hora dependiendo el tipo de yet
        double precioPorHora = 0;
        if (tipoJet.equals("light")) {
            precioPorHora = 3000;
        } else if (tipoJet.equals("super")) {
            precioPorHora = 4500;
        } else {
            System.out.println("Tipo de jet inválido. Debe ser 'Light' o 'Super'.");
            return;
        }
        // Calculamos el precio total sin descuento
        double precioTotal = precioPorHora * horas;
        double descuento = 0;

        // Asignamos el descuento dependiendo la cantidad de horas que decida el cliente
        if (horas >= 4 && horas <= 8) {
            descuento = 0.15;
        } else if (horas >= 9 && horas <= 12) {
            descuento = 0.20;
        } else if (horas >= 13 && horas <= 16) {
            descuento = 0.25;
        } else if (horas >= 17) {
            descuento = 0.30;
        }

        // Calculamos el precio final con descuento
        double montoDeDescuento = precioTotal * descuento;
        double precioFinal = precioTotal - montoDeDescuento;

        // Mostramos los resultados
        System.out.println("\n--- Resumen de Alquiler ---");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Tipo de jet alquilado: " + (tipoJet.equals("light") ? "Light Jet" : "Super Jet"));
        System.out.println("Cantidad de horas: " + horas);
        System.out.println("Precio del jet por hora: $" + precioPorHora);
        System.out.println("Precio total antes del descuento: $" + precioTotal);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto total a pagar: $" + precioFinal);

    }
}
