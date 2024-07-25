//Mediante la palabra reservada extends y el nombre de la clase se hereda o se extiende
public class Empleado extends Persona {
    //Atributos individuales:
    int num_legajo;
    String cargo;
    double sueldo;

    //constuctor vacio
    public Empleado() {
    }

    //constructor con atributos individuales y de Herencia.
    public Empleado(int id, String nombre, String apellido, String domicilio, String telefono,
                    int num_legajo, String cargo, double sueldo) {
        //La palabra super significa que son los atributos herdedados
        super(id, nombre, apellido, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
