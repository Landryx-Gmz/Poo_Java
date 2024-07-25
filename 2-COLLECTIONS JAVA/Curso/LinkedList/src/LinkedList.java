import java.util.List;


public class LinkedList {
    public static void main(String[] args) {

        List<Persona> lista = new java.util.LinkedList<Persona>();

        lista.add(new Persona(1, "Andy",35));
        lista.add(new Persona(2, "Rosa",33));
        lista.add(new Persona(3, "Ania", 0));
        lista.add(new Persona(4, "Dario",35));

        //para añadir al principio de la lista o cabeza se hace del siguiente modo:
        //antes del new Persona colocamos el (0) que es el primer numero de la lista y asi se agrega a ella.
        lista.add(0,new Persona(5,"Marcos",32));

        //Foreach

        System.out.println("---Foreach---");

        for (Persona persona:lista) {//Persona = Clase padre /persona=variable auxiliar/:=que contenga todo de/ lista=nombre de la LinkedList.
            System.out.println("prueba: " + persona.getNum() + " " + persona.getNombre() + " " + persona.getEdad());
        }
    }
}
