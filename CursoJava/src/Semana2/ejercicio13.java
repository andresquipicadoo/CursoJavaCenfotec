package Semana2;
import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) throws Exception {
        double precioTiquete;
        double precioConDescuento;
        Scanner prec=new Scanner(System.in);
        System.out.println("Digite el precio original del tiquete");

        precioTiquete=prec.nextDouble();
        precioConDescuento=precioTiquete-(precioTiquete*0.15);
        if (precioTiquete==5000){

            System.out.println("El precio queda igual"+precioTiquete+"$");
        }
        else{
            System.out.println(precioConDescuento);
        }




        
    }



}
