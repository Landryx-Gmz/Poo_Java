public class EjemploEnum {
//Para crear un enum o enumeracion si es en el main lo hacemos antes de asignarlo.
//Despues de la palabra reservada enum asignamos el nombre, que tiene que ir con mayusculas.
//Ya que es un tipo de dato creado por nosotros y se trata como tal o como una clase.
enum Color{
    ROJO,AZUL,VERDE,AMARILLO,ANARANJADO,NEGRO,BLANCO//no hace falta ponerlo entre comillas.
}

    public static void main(String[] args) {

    //Utilización del enum.
        Color color = Color.ROJO;//despues de asignar el nombre de la variable utilizamos el nombre de nuestro enum "Color"
        // segido de un punto ya utomaticamente saldran todos los valores que contenga nuestro enum.

        System.out.println("El color es: " + color);


        System.out.println("----Recorrido de valores del enum----");
        //Recorrido de todo los valores del enum.
        //Mediante un for creamos una valiable auxiliar "c", utilizamos : nombre del enum.values() para que nos haga el recorrido
        // de los valores del enum, y luego los mostramos por pantalla.
        for (Color c : Color.values()) {
            System.out.println("El color es: " + c);
        }



    }
}
