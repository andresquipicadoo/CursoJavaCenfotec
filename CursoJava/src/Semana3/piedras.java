package Semana3;
import java.util.Scanner;
public class piedras {
    public static void main(String[] args) throws Exception {
        double edadPiedra;
        System.out.println("Digite la edad de la piedra ");
        Scanner edp = new Scanner(System.in);
        edadPiedra =edp.nextDouble();
        if (edadPiedra >=542) {

            System.out.println("La piedra pertenece a la edad Pre-paleozoica ya que tiene una antiguedad de "+edadPiedra+" años");
            
        }
        else if (edadPiedra <=65.5){

            System.out.println("La piedra pertenece a la edad cenozoica ya que tiene una antiguedad de "+edadPiedra+" años");


        }
        else if (edadPiedra >65.5 && edadPiedra <=251){
            System.out.println("La piedra pertenece a la edad mesozoica ya que tiene una antiguedad de "+edadPiedra+" años");

        }
        else if (edadPiedra >65.5 && edadPiedra <=251){
            System.out.println("La piedra pertenece a la edad mesozoica ya que tiene una antiguedad de "+edadPiedra+" años");

        }
        
        float operacion;
        operacion=3%4
        System.out.println(operacion);
     






    }

}
