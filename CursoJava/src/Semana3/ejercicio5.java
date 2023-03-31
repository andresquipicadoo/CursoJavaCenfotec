package Semana3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {

        int salario;
        double impuesto;
        Scanner sal = new Scanner(System.in);
        System.out.print("Digite el salario del trabajador  : ");
        salario = sal.nextInt();
        if (salario >= 1000000) {

            impuesto = salario - (salario * 0.10);
            System.out.println("El salario del trabajador con el impuesto aplicado es de :" + impuesto);
        } else {

            System.out.print("Usted tiene un salario menor a un millon de colones pro lo tanto no aplica el impuesto : "
                    + salario);

        }

    }

}
