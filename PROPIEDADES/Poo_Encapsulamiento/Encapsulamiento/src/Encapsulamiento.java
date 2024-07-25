public class Encapsulamiento {
    public static void main(String[] args) {

        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Andy", "Gomez");


        System.out.println("El id, nombre y apellido del alu2 es: " +"id:" + alu2.getId() + " Nombre:" + alu2.getNombre() + " Apellido:" + alu2.getApellido());

    }
}
