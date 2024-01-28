package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioQuince {

    public void parki() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese cuanto es el cobro x hora: ");
        String input = reader.readLine();
        double cobro = Double.parseDouble(input);

        System.out.print("Ingrese cuantas horas fue utilizado el parquimetro: ");
        input = reader.readLine();
        double hora = Double.parseDouble(input);

        Math.ceil(hora);

        System.out.println("El costo a aplicar es de: $" + (Math.ceil(hora)*cobro) + " pesos");


    }
}
