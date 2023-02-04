package Semana2;
import java.util.Scanner;
public class Prueba1Input {
    
    public static void main(String[] args) throws  Exception  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=sc.nextLine();
        System.out.println("Bienvenido "+nombre);
        int edad =sc.nextInt();
        System.out.println("Gracias " + nombre + " en 47 años usted tendrá " + (edad + 47) + " años."); //Operacion numerica con la edad
    }

}