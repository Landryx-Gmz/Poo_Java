public class Videojuegos {
    int codigo;
    String titulo;
    String consola;
    int cantJugadores;
    String categoria;

    @Override
    public String toString() {
        return "Videojuegos{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantJugadores=" + cantJugadores +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public Videojuegos() {
    }

    public Videojuegos(int codigo, String titulo, String consola, int cantJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }
}
