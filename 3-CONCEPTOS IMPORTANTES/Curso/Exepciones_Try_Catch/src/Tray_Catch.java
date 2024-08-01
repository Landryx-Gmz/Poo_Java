public class Tray_Catch {
    public static void main(String[] args) {

        //Con try y con catch creamos una exepcion.
        try {//dentro de los corchetes metemos la logica de la exepcion.
            int resultado = 2/0;
        }
        catch (Exception e) {//dentro de los paretecis escribimos la palabra "Exepcion" y el nombre que queremos asignar para crear la exepcion.
            System.out.println("NO se puede dividir por cero!!!!");//y entre corchetes el mensaje.
        }

        //Ejemplo2:

        int edades[] = {15,12,23,30};
        try {//colocamos dentro del try el error por desbordamiento o el error.
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        }
        catch (Exception c) {//creamos la exepcion c con el catch para mostrar por pantalla que el índice no existe.
            System.out.println("El índice no existe");
        }

    }
}
