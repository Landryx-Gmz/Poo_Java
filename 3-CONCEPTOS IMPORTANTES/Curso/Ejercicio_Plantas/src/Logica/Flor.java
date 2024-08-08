package Logica;
//clase extendida de planta
public class Flor extends Planta{
//Atributos
    private String colorDePetalos;
    private int cantPromePetalos;
    private String colorDelPistilo;
    private String variedadDeFlor;
    private String estacionQueFlorece;
//Constructor vacio
    public Flor() {
    }
//Constructor con parametros
    public Flor(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String colorDePetalos,
                int cantPromePetalos, String colorDelPistilo, String variedadDeFlor, String estacionQueFlorece) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantPromePetalos = cantPromePetalos;
        this.colorDelPistilo = colorDelPistilo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }
//Getters and Setters
    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public int getCantPromePetalos() {
        return cantPromePetalos;
    }

    public void setCantPromePetalos(int cantPromePetalos) {
        this.cantPromePetalos = cantPromePetalos;
    }

    public String getColorDelPistilo() {
        return colorDelPistilo;
    }

    public void setColorDelPistilo(String colorDelPistilo) {
        this.colorDelPistilo = colorDelPistilo;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }
//Sobreescritura de metodo Abstracto
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un arbol");
    }
}
