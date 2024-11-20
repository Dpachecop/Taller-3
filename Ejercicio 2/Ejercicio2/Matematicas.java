package Ejercicio2;
public  class Matematicas {
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("La división por cero no está permitida.");
        }
        return a / b;
    }
}

