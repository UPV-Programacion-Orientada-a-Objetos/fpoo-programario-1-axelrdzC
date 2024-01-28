package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOcho {

    public void distancia() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("x1 = ");
        String input = reader.readLine();
        double x1 = Double.parseDouble(input);
        System.out.print("y1 = ");
        input = reader.readLine();
        double y1 = Double.parseDouble(input);
        System.out.print("x2 = ");
        input = reader.readLine();
        double x2 = Double.parseDouble(input);
        System.out.print("y2 = ");
        input = reader.readLine();
        double y2 = Double.parseDouble(input);

        double d = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));

        System.out.println("la distancia es igual a " + d);

    }
}
