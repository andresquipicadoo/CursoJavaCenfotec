package Semana3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) throws Exception {
        int cantFlores;
        double precio;
        double precioDescuento;
        Scanner cant = new Scanner(System.in);
        System.out.print("Digite la cantidad de flores  : ");
        cantFlores = cant.nextInt();
        Scanner prec = new Scanner(System.in);
        System.out.println("Digite el precio de las flores :");
        precio = prec.nextDouble();
        if (cantFlores == 3) {

            precioDescuento = precio - (precio * 0.10);
            System.out.println("Las flores tiene un precio de " + precioDescuento + 
            " colones con 10% del descuento aplicado y su precio original era de "+precio);

        } else {
            System.out.println("Las flores tienen un precio de " + precio);

        }

    }

}
