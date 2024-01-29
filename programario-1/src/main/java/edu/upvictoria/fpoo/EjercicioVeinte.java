package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeinte {

    public void llamada() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double total = 0;

        System.out.print("Especifique costo x minuto para llamadas: ");
        String input = reader.readLine();
        double costo = Double.parseDouble(input);

        System.out.print("La llamada duro mas de una hora? Si[1] No[0]");
        input = reader.readLine();
        double p = Double.parseDouble(input);

        if (p == 1) {

            System.out.print("Cuanto tiempo duro la llamada en horas? ");
            input = reader.readLine();
            double th = Double.parseDouble(input);
            total = (th*60)*costo;

            System.out.println("El total a pagar es de: $" + total + " pesos");

        } else {

            System.out.print("Cuantos minutos duro la llamada? ");
            input = reader.readLine();
            double tm = Double.parseDouble(input);
            total = tm*costo;

            System.out.println("El total a pagar es de: $" + total + " pesos");

        }


    }

}
