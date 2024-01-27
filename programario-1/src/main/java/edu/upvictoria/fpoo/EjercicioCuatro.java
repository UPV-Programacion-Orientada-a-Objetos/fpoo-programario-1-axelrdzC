package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuatro {

    public void circunferencia() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el radio de su circulo: ");
        String input = reader.readLine();
        double radio = Double.parseDouble(input);

        double area = Math.PI*(Math.pow(radio,2));

        System.out.println("El area de su circulo es de: " + area);

    }

}
