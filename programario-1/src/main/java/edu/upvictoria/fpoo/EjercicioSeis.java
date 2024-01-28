package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSeis {

    public void heladito() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double aC, c, aTri, areaTotal;

        System.out.println("Ingrese el valor en R: ");
        String input = reader.readLine();
        double R = Double.parseDouble(input);

        System.out.println("Ingrese el valor en H: ");
        input = reader.readLine();
        double H = Double.parseDouble(input);

        // calcular semicirculo
        aC = (Math.PI*(R*R))/2;

        //calcular cateto c
        c = Math.sqrt((H*H)-(R*R));

        // calcular triangulo
        aTri = R*c;

        areaTotal = aC + aTri;

        System.out.println("El area de su figura es de: " + areaTotal);

    }
}
