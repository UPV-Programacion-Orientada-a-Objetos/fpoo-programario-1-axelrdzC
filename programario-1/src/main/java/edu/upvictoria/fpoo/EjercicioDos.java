package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDos {

    public void prom() throws IOException {

        float c1,c2,c3,c4, prom;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la calificacion 1: ");
        String input = reader.readLine();
        c1 = Float.parseFloat(input);

        System.out.print("Ingrese la calificacion 2: ");
        input = reader.readLine();
        c2 = Float.parseFloat(input);

        System.out.print("Ingrese la calificacion 3: ");
        input = reader.readLine();
        c3 = Float.parseFloat(input);

        System.out.print("Ingrese la calificacion 4: ");
        input = reader.readLine();
        c4 = Float.parseFloat(input);

        prom = (c1+c2+c3+c4)/4;

        System.out.println("El promedio del alumno es: " + prom);

    }

}
