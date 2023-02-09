package Semana2;
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) throws Exception {

        int cantPaginasWeb;
        Scanner web=new Scanner(System.in);
        System.out.print("Digite la cantidad de paginas web");
        cantPaginasWeb=web.nextInt();
        int sumaTotal=cantPaginasWeb*2;
        sumaTotal=50*cantPaginasWeb;
        System.out.println(sumaTotal);

    }

}
