import java.util.Scanner;

public class Programa4 {
    /*
    UNIVERSIDAD TECNOLOGICA INDOAMERICA
    PROGRAMA Nº4
    Nombre: Pozo Xavier
    Carrera: Ingenieria en TI
    Nivel: 3er semestre
    Profesor: Ing.Juan Pabon
    Fecha: 25/10/2026
    -Prototipo de Inventario

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productos = {"Arroz", "Azúcar", "Aceite"};
        int[] stock = {50, 5, 20};
        int opcion;
        do {
            System.out.println("--CONTROL DE INVENTARIO--");
            System.out.println("1) Listar stock");
            System.out.println("2) Vender producto");
            System.out.println("0) Salir");
            System.out.print("Opción: ");

            while (!sc.hasNextInt()) {
                System.out.println("Debe ser un número entero.");
                System.out.print("Opción: ");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("--- ESTADO DE INVENTARIO ---");
                    for (int i = 0; i < productos.length; i++) {
                        String alerta = (stock[i] < 10) ? " [CRÍTICO]" : "";
                        System.out.println("[" + i + "] " + productos[i] + " - Stock: " + stock[i] + alerta);
                    }
                }
                case 2 -> {
                    System.out.print("Ingrese ID del producto (0, 1 o 2): ");
                    int id = sc.nextInt();
                    if (id >= 0 && id < productos.length) {
                        int cantidad;
                        do {
                            System.out.print("Cantidad a retirar: ");
                            while (!sc.hasNextInt()) {
                                System.out.println("Debe ser un número entero.");
                                sc.next();
                            }
                            cantidad = sc.nextInt();
                            if (cantidad > stock[id]) {
                                System.out.println("Stock insuficiente. Disponible: " + stock[id]);
                            } else if (cantidad <= 0) {
                                System.out.println("Ingrese una cantidad mayor a 0.");
                            }
                        } while (cantidad <= 0 || cantidad > stock[id]);

                        stock[id] -= cantidad;
                        System.out.println("Venta exitosa. Stock restante de " + productos[id] + ": " + stock[id]);
                    } else {
                        System.out.println("Error, ID de producto no existe.");
                    }
                }
                case 0 -> System.out.println("Vuelve pronto.");
                default -> System.out.println("Opción no válida.");
            }
        }while (opcion != 0) ;
        sc.close();
    }
}
/*
Declaración de Gobernanza y Ética de la IA:
-Herramienta utilizada: Gemini (Google).
-Prompt empleado: "Explícame cómo implementar arreglos paralelos en Java para asociar nombres
 de productos con sus respectivos valores numéricos de stock dentro de un menú repetitivo con switch."
-Justificación de uso: El uso de la IA se limitó al soporte de sintaxis y aclaración de conceptos
sobre arreglos paralelos, siendo el código adaptado, analizado y validado enteramente por el estudiante.
-Verificación del resultado: Se evaluaron casos de prueba límite (como compras exactas al stock
disponible) y erróneos (retiros superiores al inventario), comprobando la solidez y el control
de excepciones lógicas del sistema.
 */