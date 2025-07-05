package ejercicio1;

public class Vehiculo {
    protected String marca;
    protected int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Año: " + anio);
    }
}
