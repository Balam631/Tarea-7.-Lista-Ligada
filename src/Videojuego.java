public class Videojuego {
    private String nombre;
    private float precio;
    private boolean esMultijugador;
    private String consola;
    private int maxJugadores;

    public Videojuego() {
    }

    public Videojuego(String nombre, float precio, boolean esMultijugador, String consola, int maxJugadores) {
        this.nombre = nombre;
        this.precio = precio;
        this.esMultijugador = esMultijugador;
        this.consola = consola;
        this.maxJugadores = maxJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEsMultijugador() {
        return esMultijugador;
    }

    public void setEsMultijugador(boolean esMultijugador) {
        this.esMultijugador = esMultijugador;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getMaxJugadores() {
        return maxJugadores;
    }

    public void setMaxJugadores(int maxJugadores) {
        this.maxJugadores = maxJugadores;
    }

    public boolean equals(Videojuego v) {
        if (v == null) return false;
        return this.nombre.equals(v.getNombre()) &&
                this.precio == v.getPrecio() &&
                this.esMultijugador == v.isEsMultijugador() &&
                this.consola.equals(v.getConsola()) &&
                this.maxJugadores == v.getMaxJugadores();
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", precio=$" + precio +
                ", esMultijugador=" + esMultijugador +
                ", consola='" + consola + '\'' +
                ", maxJugadores=" + maxJugadores +
                '}';
    }
}
