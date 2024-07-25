//Mediante la palabra reservada (abtract) crearemos nuestra clase abstracta.
public abstract class Figura {
//Declaramos el encapsulamiento protegido(protected), para que solo las clases hijas puedan tener sus atributos.
    protected double x; //pos en x
    protected double y; //pos en y

//hacemos lo mismo con los constructores
    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

//Creamos un método abstracto, solo se declara su firma, incluyendo el nombre del método
// y los parámetros que acepta cerrando la línea con «;», nada más que eso.
// Es decir sin los corchetes "{}".
    public abstract double calcularArea();
}
