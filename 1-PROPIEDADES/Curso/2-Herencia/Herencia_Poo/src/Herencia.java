public class Herencia extends Persona{
    public static void main(String[] args) {
        //Ejemplo de polimorfismo
    Persona vector [] = new Persona[5];
    //En el vector de la clase padre(Persona) vemos como podemos asiganar todas sus clases Hijas
    //Con ello se demuestra su Polimorfismo es decir todas las clases con sus atibutos heredadas
    //Y personalizadas.
    vector[0] = new Persona();
    vector[1] = new Empleado();
    vector[2] = new Consultor();
    vector[3] = new Jefe();
    }
}