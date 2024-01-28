package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDoce {

    public void tri() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("ingrese la base del triangulo: ");
        String input = reader.readLine();
        double b = Double.parseDouble(input);

        System.out.print("ingrese la altura del triangulo: ");
        input = reader.readLine();
        double h = Double.parseDouble(input);


        double area = (b*h)/2;

        System.out.println("El area es de = " + area);

    }

}
