import java.util.Scanner;

public class Programa2 {
    /*
    UNIVERSIDAD TECNOLOGICA INDOAMERICA
    PROGRAMA Nº2
    Nombre: Pozo Xavier
    Carrera: Ingenieria en TI
    Nivel: 3er semestre
    Profesor: Ing.Juan Pabon
    Fecha: 25/10/2026
    -Control de Asistencias

     */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] estudiantes = { "Juan", "Maria", "Pedro", "Lucia"};
        int opcion;

        do {
            System.out.println("--Registro de asistenia--");
            System.out.println("1) Pasar lista");
            System.out.println("0) Salir");
            System.out.println("Opcion: ");

            while (!sc.hasNextInt()){
                System.out.println("Debe ser un numero entero.");
                System.out.println("Opcion: ");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion){
                case 1 ->{
                    int presentes = 0;
                    int ausentes = 0;

                    for (int i=0; i < estudiantes.length; i++) {
                        int estado;
                        do {
                            System.out.println("Esta presente la estudiante " + estudiantes[i] + " .Ingrese 1 para SI y 2 para No.");
                            while (!sc.hasNextInt()) {
                                sc.next();
                            }
                            estado = sc.nextInt();
                        }while (estado != 1 && estado != 2) ;
                        if (estado == 1){
                        presentes ++;
                        }else{
                            ausentes++;
                        }
                    }
                    System.out.println("Presentes: "+presentes+"-Ausentes: "+ausentes);
                }
                case 0 -> System.out.println("Hasta pronto.");
                default -> System.out.println("Opcion no existente.");
            }
        }while (opcion != 0);
        sc.close();
    }
}
/*
Declaración de Gobernanza y Ética de la IA:
-Herramienta utilizada: Gemini (Google).
-Prompt empleado: "Dame un ejemplo de referencia sobre cómo recorrer un arreglo unidimensional
de cadenas en Java utilizando un ciclo for para un pase de lista básico con contadores."
-Justificación de uso: La herramienta sirvió de consulta pedagógica para entender el recorrido
de arreglos por índice y el manejo de contadores incrementales, manteniendo el estudiante la
autoría total del diseño del algoritmo.
-Verificación del resultado: Se validó el comportamiento del programa mediante pruebas de
escritorio, comprobando el conteo correcto de elementos presentes y ausentes según las entradas
simuladas.
 */