package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintitres {

    public void producto() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la cantidad del cobro x kilowatt en pesos: ");
        System.out.println( "Bienvenido, cual de los siguientes articulos desea comprar?:" );
        System.out.print("[1] Lust for life (CD) // 350 MXN\n");
        System.out.print("[2] Red Moon in Venus (Vynil) // 900 MXN\n");
        System.out.print("[3] ORQUIDEAS (CD Exlusive) // 400 MXN\n");
        System.out.print("[4] Besitos, cuidate (CD) // 230 MXN\n");
        System.out.print("[5] Electra Heart (Platinum Edition, CD) // 450 MXN\n");
        String input = reader.readLine();
        int opc = Integer.parseInt(input);
        double precio, desc, total;

        switch (opc) {

            case 1:
                precio = 350; desc = (precio-(precio*.2)); total = (desc+(desc*0.15));
                System.out.print("Lust for life (CD) // 350 MXN\n");
                System.out.print("PRECIO 20% DE DESCUENTO: "+ desc +" MXN\n");
                System.out.print("PRECIO FINAL: "+ total +" MXN\n");
                break;
            case 2:
                precio = 900; desc = (precio-(precio*.2)); total = (desc+(desc*0.15));
                System.out.print("PRECIO INICIAL: Red Moon in Venus (Vynil) // 900 MXN\n");
                System.out.print("PRECIO 20% DE DESCUENTO: "+ desc +" MXN\n");
                System.out.print("PRECIO FINAL: "+ total +" MXN\n");
                break;
            case 3:
                precio = 400; desc = (precio-(precio*.2)); total = (desc+(desc*0.15));
                System.out.print("PRECIO INICIAL: ORQUIDEAS (CD Exlusive) // 400 MXN\n");
                System.out.print("PRECIO 20% DE DESCUENTO: "+ desc +" MXN\n");
                System.out.print("PRECIO FINAL: "+ total +" MXN\n");
                break;
            case 4:
                precio = 230; desc = (precio-(precio*.2)); total = (desc+(desc*0.15));
                System.out.print("PRECIO INICIAL: Besitos, cuidate (CD) // 230 MXN\n");
                System.out.print("PRECIO 20% DE DESCUENTO: "+ desc +" MXN\n");
                System.out.print("PRECIO FINAL: "+ total +" MXN\n");
                break;
            case 5:
                precio = 450; desc = (precio-(precio*.2)); total = (desc+(desc*0.15));
                System.out.print("PRECIO INICIAL: Electra Heart (Platinum Edition, CD) // 450 MXN\n");
                System.out.print("PRECIO 20% DE DESCUENTO: "+ desc +" MXN\n");
                System.out.print("PRECIO FINAL: "+ total +" MXN\n");
                break;
        }


    }
}
