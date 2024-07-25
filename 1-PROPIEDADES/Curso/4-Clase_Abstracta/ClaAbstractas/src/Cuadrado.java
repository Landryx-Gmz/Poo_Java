//Para poder implementar o extender la clase Figura nos va a lanzar un error porque lo
//tenemos como Abstracto y con alt enter podemos sobreescribir para poder utilizar la
//clase padre.

public class Cuadrado extends Figura{
//Encapsulamos en privado para que solo esta clase pueda pueda utilizar este atributo
    private double lado;
//cramos los contructores
    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

//Esta es la sobreescribtura implementada a raiz del extend que automaticamente al implementarlo
// te escribe el metodo abstracto de la clase abstracta.
    @Override
    public double calcularArea() {//Este es el metodo abstracto pero su solucion es unica de esta clase\
        // y diferente de las demas por este es el motivo de utilizar una clase abstracta.

        //escribimos la formula matematica para calcular el area de un cuadrado.
        double resultado = lado * lado;
        return resultado;
    }
}
