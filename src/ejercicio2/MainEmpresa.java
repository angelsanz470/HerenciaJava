package ejercicio2;

public class MainEmpresa {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Ana", 3000);
        Gerente ger = new Gerente("Luis", 4000, 1500);

        System.out.println("--- Información del Empleado ---");
        emp.mostrarInfo();

        System.out.println("\n--- Información del Gerente ---");
        ger.mostrarInfo();
    }
}
