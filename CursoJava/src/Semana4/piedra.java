package Semana4;
import java.util.Scanner;
public class piedra {
    public static void main(String[] args) throws Exception {
        double edadPiedra;
        System.out.println("Digite la edad de la piedra ");
        Scanner edp = new Scanner(System.in);
        edadPiedra =edp.nextDouble();
        if (edadPiedra >=542) {

            System.out.println("La piedra pertenece a la edad Pre-paleozoica ya que tiene una antiguedad de "+edadPiedra+" años");
            
        }


    }



}
