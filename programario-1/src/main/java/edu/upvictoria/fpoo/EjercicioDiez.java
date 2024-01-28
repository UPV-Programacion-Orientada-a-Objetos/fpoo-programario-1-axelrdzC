package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiez {

    public void telas() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Cuantos metros de tela requiere?");
        String in = reader.readLine();
        double m = Double.parseDouble(in);

        double conversion = m/0.0254;

        System.out.println("Usted debera pedir " + conversion + " pulgadas de tela");

    }
}
