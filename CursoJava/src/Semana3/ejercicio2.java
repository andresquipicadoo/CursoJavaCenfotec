package Semana3;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) throws Exception {
        int edad;
        Scanner ed = new Scanner(System.in);
        System.out.print("Digite la edad de la persona : ");
        edad = ed.nextInt();
        if(edad >=18){
            System.out.println("Usted puede votar ");
        }
        else if (edad<=17){
            System.out.println("Usted puede votar, es menor de edad ");

        }

    }
}
