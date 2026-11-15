import java.util.Scanner;

 public class Programa1 {
    /*
    UNIVERSIDAD TECNOLOGICA INDOAMERICA
    PROGRAMA Nº1
    Nombre: Pozo Xavier
    Carrera: Ingenieria en TI
    Nivel: 3er semestre
    Profesor: Ing.Juan Pabon
    Fecha: 25/10/2026
    -Calculadora de descuentos

     */
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--Calculadora de descuentos--");
            System.out.println("1) Ingresar a la calculadora de descuentos:");
            System.out.println("0) Salir");
            System.out.println("Eliga una opcion: ");
            while (!sc.hasNextInt()){
                System.out.println("Erro, debe ingresar un numero entero. Seleccione una opcion:");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion){
                case 1 ->{
                    double monto;
                    do{
                        System.out.println("Ingrese el monto de la compra:");
                        while(!sc.hasNextDouble()){
                            System.out.println("Error, ingrese un valor numerico valido.");
                            System.out.println("Ingrese el monto de la compra:");
                            sc.next();
                        }
                        monto = sc.nextDouble();
                        if (monto <= 0){
                            System.out.println("El monto debe ser mayor a 0.");
                        }
                    } while (monto <= 0);

                    double descuento = 0;
                    if (monto >=100){
                        descuento = monto * 0.15;
                    } else if (monto >= 50) {
                        descuento = monto * 0.10;
                    }

                    double totalPagar = monto - descuento;
                    System.out.printf("Subtotal: $%.2f - Descuento: $%.2f - Total: $%.2f%n", monto, descuento, totalPagar);
                }
                case 0 -> System.out.println("Hasta luego.");
                default -> System.out.println("Opcion no valida.");
            }
        }while (opcion != 0 );
        sc.close();
    }
}
/*
Declaración de Gobernanza y Ética de la IA:
-Herramienta utilizada: Gemini (Google).
-Prompt empleado: "Explícame cómo estructurar condicionales anidadas (if / else-if) en Java
para calcular tramos de descuento según rangos de montos, y ayúdame a revisar la sintaxis de
validación con hasNextInt() en un menú interactivo."
-Justificación de uso: Se empleó exclusivamente como soporte conceptual para comprender la
sintaxis de bifurcaciones múltiples y validación de tipos de datos en Java, supervisando,
adaptando y comprendiendo cada línea del código implementado.
-Verificación del resultado: Se realizaron pruebas de caja negra con valores normales,
límites y erróneos, comprobando que los cálculos de porcentaje y los mensajes de error
respondieran de forma exacta a lo esperado.
 */