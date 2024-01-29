package edu.upvictoria.fpoo;

import java.io.*;

public class EjercicioUno {
    public void suma() throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("ingrese el primer numero: ");
        String input = reader.readLine();
        double a = Double.parseDouble(input);

        System.out.print("ingrese el segundo numero: ");
        input = reader.readLine();
        double b = Double.parseDouble(input);

        System.out.println(a + " + " + b + " = " + (a+b));

    }
}
