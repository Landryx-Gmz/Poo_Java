import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        //Despus de la palabra reservadad Map entre el rombo se pone primero la clava y luego el valor separado por coma
        Map<Integer,String> mapaEmpleados = new java.util.HashMap<>();
    //Agregar clave valor = .put();
        mapaEmpleados.put(1523,"Andy");
        mapaEmpleados.put(1524,"Pera");
        mapaEmpleados.put(1525,"Kalero");
        mapaEmpleados.put(1526,"Pruevaeliminacion");
        mapaEmpleados.put(1527,"Pruevaeliminacion2");
        mapaEmpleados.put(1528,"Pruevaeliminacion3");

        //.containValue();Sirve para buscar el valor entre los parentesis
        boolean estaono = mapaEmpleados.containsValue("Andy");
        if(estaono==true) {
            System.out.println("El valor buscado está");
        }else {
            System.out.println("El valor buscado no está");
        }


        System.out.println("----Pregunta booleana con .containsKey----");
        //.containKey(); Sirve para buscar la clave entre los parentesis
        boolean estaonoclave = mapaEmpleados.containsKey(1523);//
        if (estaonoclave == true) {
            System.out.println("La clave si esta");
        }
        else {
            System.out.println("La clave no está");
        }
        System.out.println("----Valores con .values()----");
        //.values() Sirve para que nos devuelva todos los valores de la lista
        System.out.println(mapaEmpleados.values());


        System.out.println("----Valores con .keySet()----");
        //.KeySet() Sirve para que nos devuelva todas las claves de la lista
        System.out.println(mapaEmpleados.keySet());


        System.out.println("----Valores con .get()----");
        //con .get() entre los parentesis podemos escribir la clave o el objeto que queremos que
        // nos devuelva mediante una variable auxiliar que en este caso es un String nombre.
        String nombre = mapaEmpleados.get(1523);
        System.out.println("El empleado buscado es: " + nombre);


        //con .remove(): metemos entre parentesis la clave que queremos eliminar.
        mapaEmpleados.remove(1527);

        System.out.println("----Valores despues de la eliminacion mediante .romove()----");

        System.out.println(mapaEmpleados.values());





    }

}
