package Ejercicio2;


public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        System.out.println("Operaciones matemáticas:");
        System.out.println("Suma: " + Matematicas.suma(num1, num2));
        System.out.println("Resta: " + Matematicas.resta(num1, num2));
        System.out.println("Multiplicación: " + Matematicas.multiplicacion(num1, num2));
        System.out.println("División: " + Matematicas.division(num1, num2));
    }
}
