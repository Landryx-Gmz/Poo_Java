package Logica;

public class Main {
    public static void main(String[] args) {
        // LLamamos al nombre de la clase del objeto como si fuera una variable
        // Ejemplo sin atributos
        Alumno alu1 = new Alumno();

        // Ejemplo con atributos
        Alumno alu2 = new Alumno(5,"Andy","Gómez");

        //Mediante el Getter mostramos por pantalla los datos del alu2
        System.out.println("El id del alu2 es: " + alu2.getId());
        System.out.println("El nombre del alu2 es: " + alu2.getNombre());
        System.out.println("El apellido del alu2 es: " + alu2.getApellido());
        System.out.println("-----------------");

        //mediante el setter damos los datos de sus atributos al objeto creado que no lo tenia es decir alu1
        alu1.setId(8);
        alu1.setNombre("Rosa");
        alu1.setApellido("Montoya");



        System.out.println("El id del alu1 es: " + alu1.getId());
        System.out.println("El nombre del alu1 es: " + alu1.getNombre());
        System.out.println("El apellido del alu1 es: " + alu1.getApellido());
        System.out.println("---------------");

        //Mediante el setter modificamos la informacion del atributo Id como ejemplo.
        alu2.setId(35);

        System.out.println("El id del alu2 es: " + alu2.getId());
        System.out.println("El nombre del alu2 es: " + alu2.getNombre());
        System.out.println("El apellido del alu2 es: " + alu2.getApellido());

    }
}
