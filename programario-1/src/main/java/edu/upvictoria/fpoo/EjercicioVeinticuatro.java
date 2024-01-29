package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeinticuatro {

    public void ahorro () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese su sueldo semanal en pesos: ");
        String input = reader.readLine();
        double sueldo = Double.parseDouble(input);

        double ahorro_semanal = sueldo*0.15;
        double total_ahorro = (ahorro_semanal*4)*12;

        System.out.println("Su ahorra anual es de: $" + total_ahorro + " pesos");

    }

}
