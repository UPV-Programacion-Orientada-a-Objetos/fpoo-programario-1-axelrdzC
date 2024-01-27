package edu.upvictoria.fpoo;

import java.io.*;

public class EjercicioUno {
    public void suma () throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1, num2;

        System.out.print("ingrese el primer numero: ");
        String input = reader.readLine();
        num1 = Integer.parseInt(input);

        System.out.print("ingrese el segundo numero: ");
        input = reader.readLine();
        num2 = Integer.parseInt(input);

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

    }
}
