package Logica;


//Creamos la clase dentro del paquete logica
public class Alumno {

    //Creamos los atributos de la clase (suelen ser variable).
    int id;
    String nombre;
    String apellido;


    //Creamos sus METODOS o Acciones (cosas que puede hacer siempre son verbos en infinitivo).
    //ejemplo: mostrar su nombre(mostrarNombre) y saber si a aprobado(saberAprovado).

    //Metodo de ProcedimientoJ(que no nos devuelve ningun valor)
    public void mostrarNombre () {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    //Metodo de Funcion (que devulve un valor especifico)
    public void  sabreAprovado(double calificacion){
        if (calificacion>=6) {
            System.out.println("Aprobé la materia");
        }
        else {
            System.out.println("Uyy no aprobé");
        }

    }
    //Creamos un constructor con el atajoj(Alt Insert) constructor y no seleccionamos ningun atributo.
    public Alumno() {
    }

    //Creamos el mismo constructor pero seleccionando todos los atributos
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;


    }
    //Luego los llamamos en el main.
}
