package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiecisiete {

    public void hip () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el valor del cateto a; ");
        String input = reader.readLine();
        double a = Double.parseDouble(input);

        System.out.print("Ingrese el valor del cateto b; ");
        input = reader.readLine();
        double b = Double.parseDouble(input);

        double c2 = Math.pow(a,2) + Math.pow(b,2);

        System.out.println("La hipotenusa tiene un valor de: " + Math.sqrt(c2));


    }
}
