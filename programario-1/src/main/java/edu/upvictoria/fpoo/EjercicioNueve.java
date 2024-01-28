package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioNueve {

    public void sueldo() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese cuantas horas trabaja x dia: ");
        String input = reader.readLine();
        double hrs = Double.parseDouble(input);

        System.out.print("Ingrese su pago x horas: ");
        input = reader.readLine();
        double pxh = Double.parseDouble(input);

        System.out.print("Ingrese cuantos dias trabaja a la semana: ");
        input = reader.readLine();
        double dias = Double.parseDouble(input);

        double pago = (hrs*pxh)*dias;

        System.out.println("Su sueldo semanal es de: $" + pago);

    }

}
