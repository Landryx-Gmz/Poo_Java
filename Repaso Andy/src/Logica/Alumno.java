package Logica;


//Creamos la clase dentro del paquete logica
public class Alumno {

    //creamos los atributos de la clase.
    int id;
    String nombre;
    String apellido;

    //Asignamos sus METODOS o Acciones (o cosas que puede hacer siempre son verbos en infinitivo).
    //ejemplo: mostrar su nombre(mostrarNombre) y saber si a aprobado(saberAprovado).

    public void mostrarNombre () {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }
    
    public void  sabreAprovado(double calificacion){
        if (calificacion>=6) {
            System.out.println("Aprobé la materia");
        }
        else {
            System.out.println("Uyy no aprobé");
    }


}
