/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author USER
 */
public class ParqueaderoCentral {
    private int espaciosTotales;
    private int espaciosOcupados;
    private double ingresos;
    
    // 1. VARIABLE ESTÁTICA
    private static ParqueaderoCentral instancia;
    
    // 2. CONSTRUCTOR PRIVADO
    private ParqueaderoCentral() {
        espaciosTotales = 20;
        espaciosOcupados = 0;
        ingresos = 0.0;
        System.out.println("Parqueadero Abierto");
        System.out.println("Espacios disponibles " + espaciosTotales);
    }
    
    // 3. MÉTODO PÚBLICO ESTÁTICO
    public static ParqueaderoCentral getInstancia() {
        if (instancia == null) {
            instancia = new ParqueaderoCentral();
        }
        return instancia;
    }
    
    public void entrarCarro(String placa) {
        if (espaciosOcupados < espaciosTotales) {
            espaciosOcupados++;
            System.out.println("Ingreso: " + placa);
            System.out.println("Espacios libres: " + (espaciosTotales - espaciosOcupados));
        } else {
            System.out.println("LLENO - " + placa + " espera");
        }
    }
    
    public void salirCarro(String placa, int horas) {
        if (espaciosOcupados > 0) {
            espaciosOcupados--;
            double pago = horas * 3.0;
            ingresos += pago;
            
            System.out.println("Salio: " + placa);
            System.out.println("Horas: " + horas + " - Paga: $" + pago);
            System.out.println("Espacios libres: " + (espaciosTotales - espaciosOcupados));
        }
    }
    
    public void verEstado() {
        System.out.println("\n=== ESTADO ===");
        System.out.println("Espacios: " + espaciosOcupados + "/" + espaciosTotales);
        System.out.println("Libres: " + (espaciosTotales - espaciosOcupados));
        System.out.println("Ingresos: $" + ingresos);
    }
}
