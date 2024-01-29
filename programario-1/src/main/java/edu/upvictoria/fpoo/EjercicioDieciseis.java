package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDieciseis {

    public void costo () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el cobro x m^2: ");
        String input = reader.readLine();
		double cobro = Double.parseDouble(input);

		System.out.print("Ingrese cuantos m^2 se pintaran: ");
        input = reader.readLine();
        double metros = Double.parseDouble(input);


        System.out.println("El presupuesto es de $" + cobro*metros + " pesos");

    }

}
