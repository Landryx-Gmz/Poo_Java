public class Herencia extends Persona{
    public static void main(String[] args) {
        Empleado emple = new Empleado();

        emple.getNum_legajo();
        emple.getNombre();

        Consultor consul1 = new Consultor();
        consul1.getNum_consultor();
        consul1.getNombre();
    }
}