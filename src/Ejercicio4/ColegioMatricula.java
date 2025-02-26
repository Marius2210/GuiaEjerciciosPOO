package Ejercicio4;

import java.util.Scanner;

public class ColegioMatricula {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //ingreso de datos
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el apellido del estudiante: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese la edad del estudiante: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Tipo de ingreso (Antiguo/Nuevo): ");
            String tipoIngreso = scanner.nextLine();

            //calcula el costo de la matrícula segun la edad
            double costoMatricula;
            if (edad > 15) {
                costoMatricula = 100;
            } else if (edad > 10) {
                costoMatricula = 125;
            } else if (edad > 5) {
                costoMatricula = 150;
            } else {
                System.out.println("Edad no válida para matriculación.");
                return;
            }

            //descuento solo para antiguo ingreso
            double descuento = 0;
            if (tipoIngreso.equalsIgnoreCase("Antiguo")) {
                descuento = costoMatricula * 0.25;
            }

            double totalPagar = costoMatricula - descuento;

            //mostrata los datos en consola
            System.out.println("\n--- Información de Matrícula ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Costo de Matrícula: $" + costoMatricula);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + totalPagar);
        }
}

