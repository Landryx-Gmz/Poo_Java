import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
//
//        List<Persona> lista = new java.util.LinkedList<Persona>();
//
//        lista.add(new Persona(1, "Andy",35));
//        lista.add(new Persona(2, "Rosa",33));
//        lista.add(new Persona(3, "Ania", 0));
//        lista.add(new Persona(4, "Dario",35));
//
//        //para añadir al principio de la lista o cabeza se hace de la siguiente manera:
//        //antes del new Persona colocamos el (0) que es el primer numero de la lista y asi se agrega a ella.
//        lista.add(0,new Persona(5,"Marcos",32));
//
//        //Foreach
//
//        System.out.println("---Foreach---");
//
//        for (Persona persona:lista) {//Persona = Clase padre /persona=variable auxiliar/:=que contenga todo de/ lista=nombre de la LinkedList.
//            System.out.println("prueba: " + persona.getNum() + " " + persona.getNombre() + " " + persona.getEdad());
//        }


        List<Persona> listaArray = new ArrayList<Persona>();

        listaArray.add(new Persona(1, "Andy", 35));
        listaArray.add(new Persona(2, "Rosa", 33));
        listaArray.add(new Persona(3, "Dario", 35 ));
        listaArray.add(new Persona(4, "Miriam",26));


        List<Persona> listaLinked = new java.util.LinkedList<Persona>();

        listaLinked.add(new Persona(1,"Andy",33));
        listaLinked.add(new Persona(2, "Rosa",33));
        listaLinked.add(new Persona(3,"Dario",35));
        listaLinked.add(new Persona(4,"Miriam",26));

        //Remove en ArrayList
        listaArray.remove(2);

        //Remove en LInkedList
        //listaLinked.remove(2);
        String nombreborrar ="Dario";//Creamos una variable String con el el nombre que queremos borrar
        for (Persona auxpersona: listaLinked) {//Usamos un for para recorrer la lista y borrar el nombre que queremos borrar con otra variable auxiliar.
            if (auxpersona.getNombre().equals(nombreborrar)) {//son el auxiliar.getNombre().equals(variableStringconelnombre)
                listaLinked.remove(auxpersona);
                break;//colocamos el breack para poder seguier consultando la lista sin problemas
            }
        }
        System.out.println("-----Luego de eliminar-----");
        //Recorrido foreach
        System.out.println("----ArrayList----");
        for (Persona persona:listaArray) {
            System.out.println("prueba" + persona.getNombre());
        }
        System.out.println("---LinkedList---");
        for (Persona persona:listaLinked) {
            System.out.println("prueba " + persona.getNombre());
        }

        //Tamaño de la lita con .size()
        System.out.println("---¿Que tamaño tienen las listas?---");
        System.out.println("ArrayList " + listaArray.size());
        System.out.println("LinkedList " + listaLinked.size());

        //Obtener primer objeto con .getFirst().toString()
        System.out.println("---Primer y ultimo Objeto (solo para LinkedList---");

        System.out.println("Primero del LindkedList " + listaLinked.getFirst().toString());
        System.out.println("Ultimo del LinkedList " + listaLinked.getLast().getNombre());

        //Borrar toda la lista con .clear()
        System.out.println("---Borrando listas...---");
        listaArray.clear();
        listaLinked.clear();

        //comprobar si está vacia con .isEmpy() traduccion: Esta vacia?
        System.out.println("----¿Esta la vacia alguna lista?");
        System.out.println("ArrayList " + listaArray.isEmpty());
        System.out.println("LinkedList " + listaLinked.isEmpty());

    }
}
