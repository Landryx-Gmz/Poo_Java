//Para poder invocar a una interfaz tenemos la plabra reservada en java implements
// seguido del nombre de la clase a la que corresponda. Y de su @Override.
// Si necesitamos mas de una  interfas en nuestra clase,
// solo tenemos que escribir el nombre de la interfas seguida de la coma.
// En este caso seria (implements Figura, Dibujable, Rotable). y su @Override(o sobrecarga)
public class Circulo implements Figura, Dibujable, Rotable {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi =3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("HOla, estoy rotando un círculo");
    }
}
