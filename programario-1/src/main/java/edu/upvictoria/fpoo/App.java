package edu.upvictoria.fpoo;

import java.io.*;

/**
 * este es el menu del programario 1
 */
public class App
{

    static int pregunta () throws IOException{
        System.out.println("Desea volver al menu principal [1] o repetir el ejercicio [0]?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        return Integer.parseInt(input);
    }

    public static void main( String[] args ) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "\nBienvenido!" );

        int opc = 1;

        while (opc != 0) {

            System.out.println( "Ingrese la opcion que desea realizar.\n" );

            System.out.println( "POR CLASE:" );
            System.out.print("[1] Sumar dos numeros\n");
            System.out.print("[2] Promediar examenes\n");
            System.out.print("[3] Area del rectangulo\n");
            System.out.print("[4] Area del circulo\n");
            System.out.print("[5] Area de un terreno\n");
            System.out.print("[6] Ejercicio1\n");
            System.out.print("[7] Ejercicio1\n");
            System.out.print("[8] Ejercicio1\n");
            System.out.print("[9] Ejercicio1\n");
            System.out.print("[10] Ejercicio1\n");
            System.out.print("[11] Ejercicio1\n");
            System.out.print("[12] Ejercicio1\n");
            System.out.print("[13] Ejercicio1\n");
            System.out.println( "\n\nPOR PAQUETE:" );
            System.out.println( "\nSALIR [0]" );

            System.out.print("\nIngrese su eleccion: ");
            String input = reader.readLine();
            System.out.println("\nUsted selecciono la opcion: " + input);
            opc = Integer.parseInt(input);

            switch (opc) {
                case 1:
                    do {
                        EjercicioUno obj = new EjercicioUno();
                        obj.suma();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 2:
                    do {
                        EjercicioDos obj = new EjercicioDos();
                        obj.prom();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 3:
                    do {
                        EjercicioTres obj = new EjercicioTres();
                        obj.areaRec();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 4:
                    do {
                        EjercicioCuatro obj = new EjercicioCuatro();
                        obj.circunferencia();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 5:
                    do {
                        EjercicioCinco obj = new EjercicioCinco();
                        obj.terreno();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
            }

        }

        reader.close();
        System.out.print("Que le vaya bien. \n");

    }
}