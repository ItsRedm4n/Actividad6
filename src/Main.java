import java.util.Scanner;

public class Main {

    private String nombre;
    private double[] calificaciones = new double[5];

    // Constructor
    public Main(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método para imprimir los resultados
    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el nombre
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();

        // Solicitar al usuario ingresar las calificaciones
        double[] calificacionesEstudiante = new double[5];
        for (int i = 0; i < calificacionesEstudiante.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificacionesEstudiante[i] = scanner.nextDouble();
        }

        // Crear una instancia de CalculadoraCalificaciones
        Main calculadora = new Main(nombreEstudiante, calificacionesEstudiante);

        // Imprimir los resultados
        calculadora.imprimirResultados();

        // Cerrar el scanner
        scanner.close();
    }
}
