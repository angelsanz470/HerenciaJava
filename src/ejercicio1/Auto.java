package ejercicio1;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, int anio, int puertas) {
        super(marca, anio);
        this.puertas = puertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + puertas);
    }
}
