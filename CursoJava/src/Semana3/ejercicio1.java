package Semana3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        int tempCorporal;
        Scanner temp = new Scanner(System.in);
        System.out.print("Digite la temperatura corporal de la persona : ");
        tempCorporal = temp.nextInt();
        if (tempCorporal >= 37) {
            System.out.println("Usted tiene fiebre, visite a un medico");

        } else if (tempCorporal <= 36) {
            System.out.println("Usted no tiene fiebre");

        }
       
    }

}
