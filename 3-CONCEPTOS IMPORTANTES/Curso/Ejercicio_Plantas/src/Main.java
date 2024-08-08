import Logica.Arbol;
import Logica.Arbusto;
import Logica.Flor;

public class Main {
    public static void main(String[] args) {
//Creacion de objetos
        Arbol arbol = new Arbol();
        Arbusto arbusto = new Arbusto();
        Flor flor = new Flor();
//Implementacion de sus metodos en este caso es un metodo abstracto sobreescrito de su clase madre o padre.
        arbol.decirLoQueSoy();
        flor.decirLoQueSoy();
        arbusto.decirLoQueSoy();

    }
}
