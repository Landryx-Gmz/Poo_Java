import logica.Caja;

public class Main {
    public static void main(String[] args) {
    //creamos una instancia como ejemplo String de la siguiente manera.
        Caja<String> cajaString = new Caja<>();

        //luego mediante nuestra funcion creada .ponerAlgo introducimos nuestro valor String en este caso.
        cajaString.ponerAlgo("Esto es un String");
        //tambien podemos crear una funcion para que nos muestre el contenido que tenemos guardado.
        String contenido = cajaString.obtenerAlgo();

        System.out.println("El contenido es: " + contenido);

  //Podemos crear otro metodo en el que guardar otros tipos de datos como se muestra acontinuación.
      //nombreDeClase<tipoDeDato> nombreVariablePrincipal = new nombreDeClase<>();
        Caja<Integer> cajaEnteros = new Caja<>();

      //nombreVariablePrincipal.funcionDeEntrada(dato);
        cajaEnteros.ponerAlgo(32);

      //tipoDeDato nombreVariableSecundario = nombreVariablePrincipal.funcionDeSalida();
        Integer numero = cajaEnteros.obtenerAlgo();
        System.out.println("El contenido es: " + numero);
    }



}
