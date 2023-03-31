package Semana3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) throws Exception {

        int num1;
        int num2;

        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        num1 = n1.nextInt();

        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite el segundo numero");
        num2 = n2.nextInt();
        if (num1 == num2) {

            System.out.println("Son iguales");
        }
        if (num1 < num2) {

            System.out.println(num1);

        } else {
            System.out.println(num2);

        }
        if (num1 > num2) {
            System.out.println(num1);

        } else {
            System.out.println(num2);

        }

    }

}
