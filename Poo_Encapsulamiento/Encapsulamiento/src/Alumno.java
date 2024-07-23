public class Alumno {
//mediante el modificador de acceso private podemos tener en restigcion los atributos de esta clase
    private int id;
    private String nombre;
    private String apellido;

    public Alumno() {
//ejemplo de encapsulamiento del constructor alumno vacio:
// private Alumno() {
// } hemos cambiado el modificador de acceso de public a private(tambien lo podriamos cambiar a protected).
    }


    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
