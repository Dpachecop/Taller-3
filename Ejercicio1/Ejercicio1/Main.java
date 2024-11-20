package Ejercicio1;
public class Main {


    
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Fiesta");

        System.out.println("Detalles de los coches creados:");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);

        System.out.println("Cantidad de coches creados: " + Coche.getContadorCoches());
    }
}

