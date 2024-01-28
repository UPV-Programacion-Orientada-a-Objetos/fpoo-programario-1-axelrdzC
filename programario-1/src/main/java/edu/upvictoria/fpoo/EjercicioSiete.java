package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {

    public void lechero() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("cuantos litros de leche vendio? ");
        String input = reader.readLine();
        double litros = Double.parseDouble(input);

        System.out.print("a cuanto le pagan el galon? ");
        input = reader.readLine();
        double pago = Double.parseDouble(input);

        double venta = litros/3.785;

        System.out.println("Usted vendio " + venta + " galones de leche");
        System.out.println("Su pago sera de: " + (venta*pago));

    }

}
