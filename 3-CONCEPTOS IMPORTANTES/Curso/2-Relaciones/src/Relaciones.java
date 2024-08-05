import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        //Seteamos un Auto
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");

        //Creamos nuestra ArrayList "listaPropietarios vacia.
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();

        //Creamos 2 propietarios.
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        //Seteamos los propietarios.
        prop1.setId(35L);
        prop1.setNombre("Andy");
        prop1.setApellido("Gómez");

        prop2.setId(23L);
        prop2.setNombre("Rosa");
        prop2.setApellido("Montoya");

        //Guardamos los propietarios en la listasPropietarios de la siguiente manera.
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        //Al auto creado seteamos la lista de propietarios.
        aut.setListaPropietarios(listaPropietarios);

        //Mostramos por pantalla los propietarios asignados mediante la lista al auto.
        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() +
                "tiene como propietarios a :" + aut.getListaPropietarios().toString());
    }                  
}
