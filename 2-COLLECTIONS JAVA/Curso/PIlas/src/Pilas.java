import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Lista vacía: " + pila);
        System.out.println("¿Está vacia? " + pila.isEmpty());

        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //recorrido
        for (Integer pilita:pila) {
            System.out.println(pilita);
        }

        //mostrar
        System.out.println("pila: " + pila);
        System.out.println("¿pila vacia? " + pila.isEmpty());//.isEmpy() para saber si esta vacia la lista

        pila.pop(); //eliminar el último registro que entro
        System.out.println("Está el 3? " + pila.search(3));//search() para bustar un elemento en particular y no vale para objeto(te devuelve un valor positivo si esta en la pila, caso contrario seria un -1)
        System.out.println("Ultimo agregado: " + pila.peek());//peek() para saber cual es el ultimo elemto agregado sin eliminar a la pila


    }
}
