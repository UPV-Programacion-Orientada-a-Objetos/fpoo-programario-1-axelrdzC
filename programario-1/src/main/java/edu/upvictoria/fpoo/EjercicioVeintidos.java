package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintidos {

    public void kw() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la cantidad del cobro x kilowatt en pesos: ");
        String input = reader.readLine();
        double kilow = Double.parseDouble(input);

        System.out.println("Ingrese la cantidad del consumo en kilowatts: ");
        input = reader.readLine();
        double consumo = Double.parseDouble(input);

        double total = kilow*consumo;

        System.out.println("El total a pagar es de: " + total + " pesos");



    }

}
