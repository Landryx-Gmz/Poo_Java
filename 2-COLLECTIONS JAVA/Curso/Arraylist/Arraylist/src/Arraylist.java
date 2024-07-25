import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
    //Mediante la palabra (List<>)
    // dentro del rombo ponemos el nombre de la clase que queremos iniciar la lista.
    // Luego tiene que ser igual a new ArrayList<"nombre de la clase o interfaz>()
    // con sus parentecis para indicar que es una construccion de arraylist.
        List<Persona> lista = new ArrayList<Persona>();
    //Mediante el nombre que hemos asignado seguido de .add()
    // agregamos para crear con new Persona, un personaje nuevo en la lista.
        lista.add(new Persona(1,"Andy",35));
        lista.add(new Persona(2,"Rosa",33));
        lista.add(new Persona(3,"Dario",35));
        lista.add(new Persona(4,"Annia",0));

        System.out.println("-----FOR-----");

        //recorrer por indice
        for (int i=0; i<lista.size(); i++) {
            System.out.println("prueba: " + lista.get(i).getNombre());
        }

        System.out.println("-----FOREACH-----");

        //RECORRIDO FOREACH
        //por cada nombre de la clase creada(Persona)+ variable auxiliar(perso) treaeme
        // el +nombre variable auxiliar:nombre de la ArrayList(lista)
        for (Persona perso:lista) {
            System.out.println("prueba: " + perso.getNombre());
        }

    }
}
