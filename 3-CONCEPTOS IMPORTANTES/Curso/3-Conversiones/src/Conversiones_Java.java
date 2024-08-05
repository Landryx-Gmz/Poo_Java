public class Conversiones_Java {
    public static void main(String[] args) {
        double num = 1.67;

        //casteo o conversion a entero
        //siempre se pone entre parentesis el tipo de dato que quiero comvertir
        // y luego el nombre de la variable que quiero convertir.
        int numInt = (int) num;

        //ejemplo2
        //casteo o conversion a long
        long numLong = (long) num;

        System.out.println("double: " + num);
        System.out.println("double: " + numInt);
        System.out.println("double: " + numLong);

        //nota: cuando hacemos un cambio de un double a un int solo tendra en cuenta los numeros enteros.

        //Conversion de clase
        //ejemplo con String(se hace con un parseo que es lo mismo que una conversion.

        String cantidad = "15";
        String precio = "150.27";

        int cantEntero = Integer.parseInt(cantidad);//Integer se usa para pasar un Strig a entero con parseo.
        double precioDouble = Double.parseDouble(precio);//Double se escribe con D mayuscula para llamar al metodo
        // para cambiar junto con .parseDouble de un String a double.

        double totalCompra = cantEntero * precioDouble;

        System.out.println("El valor total de la combra es: " + totalCompra);

        //conversion de int, double a String con: String.valueof();
        int edad = 30;
        double estatura = 1.67;

        String edadString = String.valueOf(edad);
        String estaturaStrig = String.valueOf(estatura);

        System.out.println("Edad: " + edadString + " Estatura: " + estaturaStrig);
    }
}
