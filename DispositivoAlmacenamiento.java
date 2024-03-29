public abstract class DispositivoAlmacenamiento extends ObjetoGiratorio implements Almacenable {
    private final String nombre;
    private final String contenido = "No contengo datos.";
    private final float capacidad;
    private final int rpm;

    public DispositivoAlmacenamiento(String nombre, float capacidad, int rpm) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.rpm = rpm;
    }

    public String toString () {
        return "Me llamo " + nombre + ". Soy un " + getClass().getSimpleName() + " de " +
                capacidad + "Gb. " + contenido;

    }

    @Override
    void girar() {
        System.out.println("Giro a " + getRpm() + "rpm.");
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public int getRpm() {
        return rpm;
    }
}
