import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado #" + (i + 1));

            // Capturar datos del empleado
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Salario mensual: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Departamento (Gerencia, Auditoria, Tecnología, Contabilidad): ");
            String departamento = scanner.nextLine();

            System.out.print("Horas extras trabajadas (máximo 20): ");
            int horasExtras = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Validar que las horas extras no excedan 20
            if (horasExtras > 20) {
                System.out.println("El número de horas extras no puede superar 20. Se ajustará a 20.");
                horasExtras = 20;
            }

            // Obtener el bono por hora según el departamento
            double bonoPorHora = obtenerBonoPorDepartamento(departamento);

            // Calcular pago de horas extras
            double pagoHorasExtras = ((salario / 30) * horasExtras) + (horasExtras * bonoPorHora);

            // Mostrar resultados
            System.out.println("\n--- Resumen del Empleado ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario: $" + salario);
            System.out.println("Departamento: " + departamento);
            System.out.println("Horas extras trabajadas: " + horasExtras);
            System.out.println("Pago total de horas extras: $" + String.format("%.2f", pagoHorasExtras));
        }

        scanner.close();
    }

    // Metodo para obtener el bono por hora según el departamento
    public static double obtenerBonoPorDepartamento(String departamento) {
        return switch (departamento.toLowerCase()) {
            case "gerencia" -> 3.50;
            case "auditoria" -> 1.75;
            case "tecnologia" -> 2.25;
            case "contabilidad" -> 2.00;
            default -> 0.00; // Si el departamento no existe, no hay bono
        };
    }
}