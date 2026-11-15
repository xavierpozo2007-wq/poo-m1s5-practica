import java.util.Scanner;

public class Programa3 {
    /*
    UNIVERSIDAD TECNOLOGICA INDOAMERICA
    PROGRAMA Nº3
    Nombre: Pozo Xavier
    Carrera: Ingenieria en TI
    Nivel: 3er semestre
    Profesor: Ing.Juan Pabon
    Fecha: 25/10/2026
    -Tabla de Multiplicar

     */
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--Generador de Tablas--");
            System.out.println("1) Generar tabla de multiplicar");
            System.out.println("0) Salir");
            System.out.println("Opcion: ");

            while (!sc.hasNextInt()){
                System.out.println("Debe ingresar un numero entero.");
                System.out.println("Opcion: ");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion){
                case 1 -> {
                    int numero;

                    do{
                        System.out.println("Ingrese la tabla a generar (1 al 12): ");
                        while (!sc.hasNextInt()){
                            System.out.println("Debe ser un numero entero.");
                            sc.next();
                        }
                        numero = sc.nextInt();
                        if (numero <1 || numero>12){
                            System.out.println("Error, el numero debe estar entre el rango dado");
                        }
                    }while (numero<1 || numero >12);

                    System.out.println("Tabla del "+ numero);

                    for (int i = 1; i <=10; i++){
                        System.out.println(numero + " x "+i+" = "+(numero * i));
                    }
                }
                case 0-> System.out.println("Hasta pronto.");
                default -> System.out.println("Opcion no valida.");
            }
        }while(opcion !=0);
        sc.close();
    }
}
/*
Declaración de Gobernanza y Ética de la IA:
-Herramienta utilizada: Gemini (Google).
-Prompt empleado: "¿Cuál es la estructura recomendada en Java para validar que un número
entero ingresado por teclado se encuentre estrictamente dentro de un rango determinado (1 al 12)
usando un ciclo do-while?"
-Justificación de uso: Se utilizó la IA como guía metodológica para el diseño de bucles de
validación de rangos numéricos, asegurando la comprensión plena de la lógica de control repetitivo.
-Verificación del resultado: Se probaron entradas fuera de rango (como mayores a 12 o letras)
constatando que el sistema rechaza el dato erróneo y solicita el reingreso de forma correcta.
 */
