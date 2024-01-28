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
            System.out.print("[6] Area figura\n");
            System.out.print("[7] El lechero\n");
            System.out.print("[8] Distancia entre dos puntos\n");
            System.out.print("[9] Calcular sueldo x hora\n");
            System.out.print("[10] Metros a pulgadas de tela\n");
            System.out.print("[11] Alberca\n");
            System.out.print("[12] Area del triangulo\n");
            System.out.print("[13] Pesos a dolares\n");
            System.out.print("[14] Calcular edad de un empleado\n");
            System.out.print("[15] Parquimetro\n");
            System.out.print("[16] d\n");
            System.out.print("[17] x\n");
            System.out.print("[18] c\n");
            System.out.print("[19] c\n");
            System.out.print("[20] c\n");
            System.out.print("[21] c\n");
            System.out.print("[22] c\n");
            System.out.print("[23] c\n");
            System.out.print("[24] v\n");
            System.out.print("[25] v\n");
            System.out.print("[26] v\n");
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
                case 6:
                    do {
                        EjercicioSeis obj = new EjercicioSeis();
                        obj.heladito();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 7:
                    do {
                        EjercicioSiete obj = new EjercicioSiete();
                        obj.lechero();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 8:
                    do {
                        EjercicioOcho obj = new EjercicioOcho();
                        obj.distancia();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 9:
                    do {
                        EjercicioNueve obj = new EjercicioNueve();
                        obj.sueldo();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 10:
                    do {
                        EjercicioDiez obj = new EjercicioDiez();
                        obj.telas();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 11:
                    do {
                        EjercicioOnce obj = new EjercicioOnce();
                        obj.alberca();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 12:
                    do {
                        EjercicioDoce obj = new EjercicioDoce();
                        obj.tri();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 13:
                    do {
                        EjercicioTrece obj = new EjercicioTrece();
                        obj.empresa();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 14:
                    do {
                        EjercicioCatorce obj = new EjercicioCatorce();
                        obj.edad();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
                case 15:
                    do {
                        EjercicioQuince obj = new EjercicioQuince();
                        obj.parki();
                        opc = pregunta();
                    } while (opc == 0);
                    break;
            }

        }

        reader.close();
        System.out.print("Que le vaya bien. \n");

    }
}