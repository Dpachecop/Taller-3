package uso_incorrecto;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        Persona.cambiarNombre(persona, "Ana");
        System.out.println("Nombre después de cambiar: " + persona.getNombre());

        Persona.mostrarEdad(persona);
    }
}


