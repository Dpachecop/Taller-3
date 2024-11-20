package uso_incorrecto;

/*
    public class Persona {
        private String nombre;
        private int edad;
    
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    
        // -----AQUI----- No se puede acceder a un atributo no estático desde un método estático

        public static void cambiarNombre(String nuevoNombre) {
            nombre = nuevoNombre; 
        }
    
        // -----AQUI------  No se puede acceder a un atributo no estático desde un método estático
        public static void mostrarEdad() {
            System.out.println("Edad: " + edad); 
        }
    }
    

*/


//El codigo correcto seria este:

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void cambiarNombre(Persona persona, String nuevoNombre) {
        persona.setNombre(nuevoNombre);
    }

    public static void mostrarEdad(Persona persona) {
        System.out.println("Edad: " + persona.getEdad());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}



   
