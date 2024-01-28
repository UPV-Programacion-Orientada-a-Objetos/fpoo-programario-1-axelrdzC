package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTrece {

    public void empresa() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la cantidad de dinero en pesos mexicanos");
        String input = reader.readLine();
        double pesos = Double.parseDouble(input);

        double dolar = pesos*0.058;

        System.out.print("Usted puede adquirir $" + dolar + " dolares");

    }

}

