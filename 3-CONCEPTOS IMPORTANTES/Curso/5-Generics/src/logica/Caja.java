package logica;
//Establecemos en nuestra clase como parametro que pueda recibir
// un tipo de dato generico con : <T> despues del nombre de nuestra clase
public class Caja <T> {
    //creamos un atributo de la siguiente manera.
    //despues de declarar la privacidad del atributo escribimos la letra T
    // como referencia a nuestro tipo de dato creado por nosotros y luego el nombre que deseamos.
    //Declarando que el contenido puede ser de un tipo generico
    private T contenido;

    //creamos un metodo para recibir los parametros como un contenido generico en caso de procedimiento.
    public  void ponerAlgo(T contenido) {
        this.contenido = contenido;
    }


    //creamos un metodo para que nos devuelva en caso de una funcion el tipo que hemos establecido
    public  T obtenerAlgo() {
        return contenido;
    }

}
